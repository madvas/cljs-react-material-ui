(ns cljs-react-material-ui.chip-input.reagent
  (:require [material-ui-chip-input]
            [reagent.core :as r]))

(def chip-input (r/adapt-react-class (aget js/window "MaterialUIChipInput")))
