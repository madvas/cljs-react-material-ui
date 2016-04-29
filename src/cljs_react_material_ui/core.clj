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