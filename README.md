# cljs-react-material-ui

This library is interop to get [Material-UI](http://www.material-ui.com/#/) working in Clojurescript.

Current Material-UI version: `0.15.2`

###### See Om.Next example app here 
https://github.com/madvas/cljs-react-material-ui-example

## Installation
- Add `[cljs-react-material-ui "0.2.18"]` to your dependencies
- Exclude `cljsjs/react` from Om or other React library.
This is because currently material-ui has to be built together with react to get [onTouchTap](http://www.material-ui.com/#/get-started/installation) event [working](http://stackoverflow.com/questions/29881439/react-tap-events-and-material-ui). This will not be needed in future.
for example: `[org.omcljs/om "1.0.0-alpha34" :exclusions [cljsjs/react]]`

## Usage

  ```clojure
  (ns cljs-react-material-ui-example.core
    (:require [cljsjs.material-ui]  ; I recommend adding this at the beginning of core file
                                    ;  so React is always loaded first. It's not always needed
              [cljs-react-material-ui.core :as ui]
              [cljs-react-material-ui.icons :as ic]))   ; SVG icons that comes with MaterialUI
                                                        ; Including icons is not required
  ```

You must start your MaterialUI component tree with [ui/mui-theme-provider](http://www.material-ui.com/v0.15.0-beta.2/#/customization/themes), which must have exactly one direct child and defined theme. Use the same pattern when you want to change theme for some children, see example app.
```clojure
(ui/mui-theme-provider
    {:mui-theme (ui/get-mui-theme)}
    (ui/paper "Hello world"))
    
(ui/mui-theme-provider 
    {:mui-theme (ui/get-mui-theme 
        {:palette                   ; You can use either camelCase or kebab-case
            {:primary1-color (ui/color :deep-orange-a100)} 
         :raised-button 
            {:primary-text-color (ui/color :light-black) 
             :font-weight 200}})}
    (ui/raised-button
        {:label   "Click me"
         :primary true}))
         
(ui/mui-theme-provider
    {:mui-theme (ui/get-mui-theme (aget js/MaterialUIStyles "DarkRawTheme"))}
    (ui/paper "Hello dark world"))
```

You can use all components (icons also) in their kebab-case form. Either with props or without.
```clojure
(ui/radio-button
    {:value          "some_val"
     :label          "Yes"
     :class-name     "my-radio-class"
     :checked-icon   (ic/action-favorite)
     :unchecked-icon (ic/action-favorite-border)})
     
 (ui/table-row
    (ui/table-header-column "Name")
    (ui/table-header-column "Date"))
```

##### Global objects
```clojure
js/MaterialUI ; Contains constructors to all components. No need to use directly.
js/MaterialUIStyles ; Contains everything from material-ui/src/styles/index.js
js/MaterialUISvgIcons ; Contains constructors to all icons. Exists only when you
                      ; include icons in your code. No need to use directly.
```

##### Using with Reagent
Works with `reagent "0.6.0-alpha"` and up. So dependency may be sth like this

`[reagent "0.6.0-alpha" :exclusions [org.clojure/tools.reader cljsjs/react]]`
```clojure
(ns crmui-reagent.core
  (:require
    [cljsjs.material-ui]
    [cljs-react-material-ui.core :as ui]
    [cljs-react-material-ui.reagent :as rui]
    [cljs-react-material-ui.icons :as ic]))
    
; Example with various components
(defn home-page []
  [rui/mui-theme-provider
   {:mui-theme (ui/get-mui-theme
                 {:palette {:text-color (ui/color :green600)}})}
   [:div
    [rui/app-bar {:title              "Title"
                  :icon-element-right (ui/icon-button
                                        (ic/action-account-balance-wallet))}]
    [rui/paper
     [:div "Hello"]
     [rui/mui-theme-provider
      {:mui-theme (ui/get-mui-theme {:palette {:text-color (ui/color :blue200)}})}
      [rui/raised-button {:label "Blue button"}]]
     (ic/action-home {:color (ui/color :grey600)})
     [rui/raised-button {:label        "Click me"
                         :icon         (ic/social-group)
                         :on-touch-tap #(println "clicked")}]]]])
    
```
&nbsp;
##### Using with Rum
&nbsp;
```clojure
(ns crmui-rum.core
  (:require
    [cljs-react-material-ui.core :as ui]
    [cljs-react-material-ui.icons :as ic]
    [cljs-react-material-ui.rum :as rui]
    [rum.core :as rum]))
    
(rum/defc thing1
          []
          [:div "content1"])

(defn home-page []
  (rui/mui-theme-provider
    {:mui-theme (ui/get-mui-theme)}
    [:div
     (rui/app-bar {:icon-element-right (rui/icon-button (ic/action-accessibility))})
     (rui/tabs
       (rui/tab {:label "one"}
                [:div ["hey"
                       (rui/paper "yes")]])
       (rui/tab {:label "two"} (thing1))
       (rui/tab {:label "drei"}
                [:div
                 (rui/paper {} "Ima paper")]))]))
    
```

