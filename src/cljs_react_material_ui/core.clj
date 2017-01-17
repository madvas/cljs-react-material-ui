(ns cljs-react-material-ui.core
  (:require [clojure.string :as str]))

(defn kebab-case
  "Converts CamelCase / camelCase to kebab-case"
  [s]
  (str/join "-" (map str/lower-case (re-seq #"\w[a-z]+" s))))

(defn generate-mui-dom-fn [fname tname]
  (let [f (symbol fname)]
    `(~'defn ~(symbol (kebab-case (str tname))) [& ~'args]
       (~f ~(name tname) ~'args))))

(defmacro generate-mui-dom-fns [fname tags]
  `(do ~@(clojure.core/map (partial generate-mui-dom-fn fname) tags)))

(defn generate-mui-reagent-fn [tname]
  `(def ~(symbol (kebab-case (str tname))) (r/adapt-react-class (~'aget js/MaterialUI ~(name tname)))))

(defn generate-mui-rum-fn [tname]
  `(def ~(symbol (kebab-case (str tname))) (cljs-react-material-ui.core/adapt-rum-class (~'aget js/MaterialUI ~(name tname)))))

(defmacro adapt-rum-class [react-class]
  `(fn [& args#]
     (let [[opts# children#] (if (map? (first args#))
                               [(first args#) (rest args#)]
                               [{} args#])
           type# (first children#)]
       (let [new-children# (if (vector? type#)
                             [(sablono.interpreter/interpret (last children#))]
                             children#)]
         (cljs-react-material-ui.core/create-mui-cmp ~react-class (cons opts# new-children#))))))