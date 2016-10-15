(ns cljs-react-material-ui.elements
  (:require [cljs-react-material-ui.core :as m]))

; export (\w*) .*
; $1
(def tags
  '[
    AppBar
    AutoComplete
    Avatar
    Badge
    BottomNavigation
    BottomNavigationItem
    Card
    CardActions
    CardHeader
    CardMedia
    CardTitle
    CardText
    Checkbox
    Chip
    CircularProgress
    DatePicker
    Dialog
    Divider
    Drawer
    DropDownMenu
    FlatButton
    FloatingActionButton
    FontIcon
    GridList
    GridTile
    IconButton
    IconMenu
    LinearProgress
    List
    ListItem
    makeSelectable
    Menu
    MenuItem
    MuiThemeProvider
    Paper
    Popover
    RadioButton
    RadioButtonGroup
    RaisedButton
    RefreshIndicator
    SelectField
    Slider
    Subheader
    SvgIcon
    Step
    StepButton
    StepContent
    StepLabel
    Stepper
    Snackbar
    Tabs
    Tab
    Table
    TableBody
    TableFooter
    TableHeader
    TableHeaderColumn
    TableRow
    TableRowColumn
    TextField
    TimePicker
    Toggle
    Toolbar
    ToolbarGroup
    ToolbarSeparator
    ToolbarTitle
    ])

(defmacro generate-mui-el-fns [fname]
  `(m/generate-mui-dom-fns ~fname ~tags))

(defmacro generate-mui-reagent-fns [tags]
  `(do ~@(map m/generate-mui-reagent-fn tags)))

(defmacro generate-mui-rum-fns [tags]
  `(do ~@(map m/generate-mui-rum-fn tags)))

(comment
  (macroexpand `(generate-mui-el-fns "create-mui-el"))
  (macroexpand `(generate-mui-reagent-fns ~tags))
  (macroexpand `(generate-mui-rum-fns ~tags)))
