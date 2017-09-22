(ns cljs-react-material-ui.chip-input.rum
  (:require [material-ui-chip-input])
  (:require-macros [cljs-react-material-ui.core]))

(def chip-input (cljs-react-material-ui.core/adapt-rum-class (aget js/window "MaterialUIChipInput")))
