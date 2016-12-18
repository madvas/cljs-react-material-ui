(ns cljs-react-material-ui.chip-input.core
  (:require [cljsjs.material-ui-chip-input]
            [cljs-react-material-ui.core :refer [create-mui-cmp]]))

(defn chip-input [& args] (create-mui-cmp js/window "MaterialUIChipInput" args))