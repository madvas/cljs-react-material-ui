(ns cljs-react-material-ui.rum
  (:refer-clojure :exclude [list stepper])
  (:require-macros [cljs-react-material-ui.core])
  (:require [rum.core]
            [cljs-react-material-ui.core]))

(def css-transition-group (cljs-react-material-ui.core/adapt-rum-class (aget js/React.addons "CSSTransitionGroup")))
(def transition-group (cljs-react-material-ui.core/adapt-rum-class (aget js/React.addons "TransitionGroup")))
(def selectable-list (cljs-react-material-ui.core/adapt-rum-class ((aget js/MaterialUI "makeSelectable") (aget js/MaterialUI "List"))))

(def app-bar (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "AppBar")))
(def auto-complete (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "AutoComplete")))
(def avatar (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Avatar")))
(def badge (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Badge")))
(def bottom-navigation (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "BottomNavigation")))
(def bottom-navigation-item (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "BottomNavigationItem")))
(def card (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Card")))
(def card-actions (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "CardActions")))
(def card-header (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "CardHeader")))
(def card-media (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "CardMedia")))
(def card-title (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "CardTitle")))
(def card-text (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "CardText")))
(def checkbox (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Checkbox")))
(def chip (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Chip")))
(def circular-progress (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "CircularProgress")))
(def date-picker (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "DatePicker")))
(def dialog (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Dialog")))
(def divider (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Divider")))
(def drawer (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Drawer")))
(def drop-down-menu (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "DropDownMenu")))
(def flat-button (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "FlatButton")))
(def floating-action-button (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "FloatingActionButton")))
(def font-icon (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "FontIcon")))
(def grid-list (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "GridList")))
(def grid-tile (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "GridTile")))
(def icon-button (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "IconButton")))
(def icon-menu (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "IconMenu")))
(def linear-progress (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "LinearProgress")))
(def list (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "List")))
(def list-item (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "ListItem")))
(def menu (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Menu")))
(def menu-item (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "MenuItem")))
(def mui-theme-provider (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "MuiThemeProvider")))
(def paper (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Paper")))
(def popover (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Popover")))
(def radio-button (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "RadioButton")))
(def radio-button-group (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "RadioButtonGroup")))
(def raised-button (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "RaisedButton")))
(def refresh-indicator (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "RefreshIndicator")))
(def select-field (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "SelectField")))
(def slider (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Slider")))
(def subheader (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Subheader")))
(def svg-icon (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "SvgIcon")))
(def step (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Step")))
(def step-button (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "StepButton")))
(def step-content (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "StepContent")))
(def step-label (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "StepLabel")))
(def stepper (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Stepper")))
(def snackbar (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Snackbar")))
(def tabs (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Tabs")))
(def tab (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Tab")))
(def table (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Table")))
(def table-body (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "TableBody")))
(def table-footer (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "TableFooter")))
(def table-header (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "TableHeader")))
(def table-header-column (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "TableHeaderColumn")))
(def table-row (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "TableRow")))
(def table-row-column (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "TableRowColumn")))
(def text-field (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "TextField")))
(def time-picker (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "TimePicker")))
(def toggle (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Toggle")))
(def toolbar (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "Toolbar")))
(def toolbar-group (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "ToolbarGroup")))
(def toolbar-separator (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "ToolbarSeparator")))
(def toolbar-title (cljs-react-material-ui.core/adapt-rum-class (aget js/MaterialUI "ToolbarTitle")))