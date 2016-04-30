# cljs-react-material-ui

This library is interop to get [Material-UI](http://www.material-ui.com/#/) working in Clojurescript.

Current Material-UI version: `0.15.0-beta.2`

###### See Om.Next example app here 
https://github.com/madvas/cljs-react-material-ui-example

## Installation
- Add `[cljs-react-material-ui "0.1.9"]` to your dependencies
- Exclude `cljsjs/react` and `cljsjs/react-dom` from Om or other React library.
This is because currently material-ui has to be built together with react to get [onTouchTap](http://www.material-ui.com/#/get-started/installation) event [working](http://stackoverflow.com/questions/29881439/react-tap-events-and-material-ui). This will not be needed in future.
for example: `[org.omcljs/om "1.0.0-alpha34" :exclusions [cljsjs/react cljsjs/react-dom]]`

## Usage

  ```clojure
  (ns cljs-react-material-ui-example.core
    (:require [cljsjs.material-ui]  ; I recommend adding this at the beginning of core file
                                    ;  so React is always loaded first. It's not always needed
              [cljs-react-material-ui.core :as ui]
              [cljs-react-material-ui.icons :as ic]))   ; SVG icons that comes with MaterialUI
                                                        ; Including icons is not required
  ```

U must start your MaterialUI component tree with [ui/mui-theme-provider](http://www.material-ui.com/v0.15.0-beta.2/#/customization/themes), which must have exactly one direct child and defined theme. Use the same pattern when u want to change theme for some children, see example app.
```clojure
(ui/mui-theme-provider
    {:mui-theme (ui/get-mui-theme)}
    (ui/paper "Hello world"))
    
(ui/mui-theme-provider 
    {:mui-theme (ui/get-mui-theme 
        {:palette                       ; U can use either camelCase or kebab-case
            {:primary1-color (ui/color :deep-orange-a100)} 
         :raised-button 
            {:primary-text-color (ui/color :light-black) 
             :font-weight 200}})}
    (ui/raised-button
        {:label   "Click me"
         :primary true}))
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

