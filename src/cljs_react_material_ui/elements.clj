(ns cljs-react-material-ui.elements
  (:require [cljs-react-material-ui.core :as m]))

(def tags
  '[
    AppBar
    AutoComplete
    Avatar
    Badge
    Card
    CardActions
    CardHeader
    CardMedia
    CardTitle
    CardText
    Checkbox
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
    MakeSelectable
    Menu
    MenuItem
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

(comment
  (macroexpand `(generate-mui-el-fns "create-mui-el")))

(comment
  (macroexpand `(generate-mui-reagent-fns ~tags)))
