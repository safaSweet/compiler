parser grammar parserD;
options { tokenVocab =lexerDart;}



main:( program| VOID MAIN OP CP OBC RUNAPP OP CONST_ NAME OP CP  CP SEMI CBC )* ;

program :class;

class:CLASS_ NAME EXTENDS_ class_extend OBC containClass CBC ;

bodyMyApp:super_key OVERRIDE  function;

class_extend:STATELESSWIDGET|STATEFULLWIDGET|(STATE  LT NAME GT);

containClass:(bodyMyApp|bodyclass)*;//()*

bodyclass:(OVERRIDE? function|list|array_variabels|texteditingcontroller)+ ;

super_key : CONST_ NAME OP OBC SUPER_ DOT KEY  CBC CP    SEMI;  //LINE SUPER AND KEY

constructor: NAME OP  CP SEMI;

////************************************************************************************************function
function:  (void_function | buildFunction |call_);

void_function: VOID? NAME OP  attributes? CP OBC itemBodyFunction CBC;

buildFunction:  WIDGET BUILD OP BUILDCONTEXT CONTEXT CP OBC RETURN  MATERIAL_APP OP DEBUG_SHOW_CHECKED_MODE_BANNER COLON FALSE COMMA variables  HOME COLON SCAFFOLD  OP BACKGROUND_COLOR COLON   rgb  COMMA BODY COLON (shortConditionStatment? | widget) CP SEMI;


call_:NAME NAME OP CP OBC constructor CBC;     //  @override  NotesAppState createState() => NotesAppState(); ثابتة


itemBodyFunction: variables (if_condition  | setState|constructor);


attributes: type (NAME|CONTEXT) (COMMA type (NAME|CONTEXT))* COMMA?; //(BuildContext context) ||(int index)*


call_function:NAME OP
       ( INDEX |CONTEXT| OBC object* CBC|NAME)? //OBC ( STRING COLON NAME COMMA?)* CBC//| NAME | INDEX |CONTEXT)? // name( ) || name( { 'str' : str , 'str2' : str2 } ) ||name(string) || name(index)||name(context)
        CP (SEMI|COMMA);
object:  string COLON NAME COMMA? ;

type:WIDGET|BUILDCONTEXT|TYPE_DEFINITION;

////**************************************************************************************//TextEditingController

texteditingcontroller:TEXT_EDITING_CONTROLLER NAME ASSIGN TEXT_EDITING_CONTROLLER OP CP SEMI;

 //TextEditingController titleController = TextEditingController();

////***************************************************************************************/child && children

widget: (array_widget)* ;

array_widget:all_widget  (COMMA)?;

all_widget:  container|row|column|text_field|padding_widget|listView|button|listTitle|contain_constrant|card|single_child_scroll_view;


single_child_scroll_view:SINGLE_CHILD_SCROLL_VIEW OP CHILD COLON  widget  CP;

container:  CONTAINER OP    (clip_behavoir? padding_Style?  CHILD COLON   widget  )?     CP;


row:  ROW OP mainAxis? CHILDREN COLON OB  widget CB COMMA? CP;


column:  COLUMN OP crossAxis?  CHILDREN COLON OB  widget  CB COMMA? CP;

    ////*********************************************************listview.builder

listView:LISTVIEW DOT BUILER OP

         SHRINK_WARP COLON TRUE COMMA //shrinkWarp

         PHYSICS COLON SCRPLL_PYSIC OP CP COMMA //physics

         ITEM_COUNT COLON NAME DOT LENGTH COMMA //itemCount

         ITEM_BUILDER COLON OP CONTEXT COMMA INDEX  CP OBC list? RETURN  widget  CBC//itemBuilder


          CP;

//*******************************************************card
card: CARD OP CHILD COLON  widget  CP;

////***********************************************************listTitle

 listTitle:LIST_TITLE OP
 (TITLE COLON text) //title
 (SUBTITLE COLON text)  //subTitle
  (TRAILLING COLON  widget ) CP; //trailling

    //************************************************************condition

shortConditionStatment:(NOT)? NAME QU widget COLON widget COMMA?;

if_condition:IF OP NAME DOT IS_NOT_EMPTY(AND AND NAME DOT IS_NOT_EMPTY)  CP OBC add_to_list call_function*  CBC;


////*************************************************Padding

padding_widget:PADDING_WIDGET  OP padding_Style? CHILD COLON  (text |widget)   CP;//

////********************************************************************************textField

text_field:TEXT_FIELD OP

CONTROLLER COLON NAME COMMA         //controller

DECORATION COLON  INPUT_DECORATION OP  hintText border enableBorder filled fillColor focusColor hoverColor   CP COMMA  //decoration

(MAXLINE COLON NULL_ COMMA )?        //maxline
 CP COMMA

sizebox?  // size box just in text field
 ;

  //style decoration for text field

hintText:HINTTEXT COLON string COMMA;

border:BORDER COLON OUTLINEBORDER OP CP COMMA;

enableBorder:ENABLE_BORDER COLON OUTLINEBORDER OP BORDER_SIDE COLON BORDERSIDE OP
  COLOR_STYLE COLON  rgb
  CP  COMMA? CP COMMA?;

filled:FILLED COLON TRUE COMMA;

fillColor: FILLCOLOR COLON  rgb COMMA;

focusColor:FOCUSCOLOR COLON  rgb COMMA;

hoverColor:HOVERCOLOR COLON  rgb COMMA;
//*****************************************************************constrant box
contain_constrant:CONSTRAIN_BOX OP CONSTRAINT COLON  BOX_CONSTRAINT OP (NAME COLON (NUMBER|NAME DOT NAME) COMMA)* CP COMMA CHILD COLON widget CP COMMA?;

//**********************************************************************button

button:ELEVATED_BUTTON  OP

 ONPRESS COLON (OP CP EG call_function | NAME ) COMMA? //onpress

 CHILD COLON  text   CP COMMA;

////************************************************************************************////variables
variables:(array_variabels)*;

array_variabels: valueVariables (SEMI|COMMA);

valueVariables:valueNumber|valueBoolean|valueSTRING | variableDot |definition_Nmber
                          |definition_Boolean|definition_DOT_String|definition_String;



 valueNumber:NAME  ASSIGN   NUMBER  ;

 valueBoolean:NAME  ASSIGN  bool ;

 valueSTRING:NAME  (ASSIGN|COLON)  string;

 variableDot:NAME  (ASSIGN|COLON)  NAME DOT NAME ;// no ast



 definition_Nmber:TYPE_DEFINITION NAME  ASSIGN   NUMBER;

 definition_Boolean:TYPE_DEFINITION NAME  ASSIGN  bool ;

 definition_String:TYPE_DEFINITION NAME  (ASSIGN|COLON)  string ;

 definition_DOT_String:TYPE_DEFINITION NAME  (ASSIGN|COLON)  NAME DOT (NAME|DOT_TEXT) ;

 bool:TRUE|FALSE;
////**************************************************************************************list

list:typeMap | assign_List_to_variable;

typeMap:LIST  LT  MAP LT  TYPE_DEFINITION COMMA TYPE_DEFINITION GT GT NAME ASSIGN OB CB SEMI ;

valueList:NAME OB string CB;

assign_List_to_variable:TYPE_DEFINITION NAME ASSIGN NAME OB (string|INDEX) CB SEMI?;
//String note = notes[index]; || String note = notes['str'];


add_to_list:NAME DOT call_function;         // notes . add({'title1': title1 , 'content': content});






////*****************************************************************************************SETSTATE

setState:SET_STATE OP OP CP OBC (bodySetState) CBC CP (COMMA|SEMI);
bodySetState:  variables (    NAME DOT (CLEAR OP  CP  | REMOVE_AT OP NAME CP )  SEMI  )* ;



////*************************************************************************************(design)


// style for widget

crossAxis:CROSSAXIS COLON CROSSAXISaLIGNMENT DOT  (SPACE_AROUND | CENTER | SPACE_EVENLY|START) COMMA; // cross Axis

mainAxis: MAINAXIS COLON MAINAXISALIGNMENT DOT (SPACE_AROUND | CENTER | SPACE_EVENLY|START) COMMA;  // main Axis

sizebox: SIZEBOX OP HEIGHT COLON NUMBER CP COMMA;

clip_behavoir:CLIP_BEHAVOIR COLON CLIP DOT NONE COMMA;

text: TEXT OP (type_text1 |condition_in_text) CP COMMA;

condition_in_text:valueList QU QU DOUBLEQUOTATION DOUBLEQUOTATION;

type_text1: string COMMA? (STYLE COLON TEXTSTYLE OP fontSize fontWeight CP COMMA)?;

fontSize: FONT_SIZE COLON NUMBER COMMA;

fontWeight:FONT_WEIGHT COLON FONTWEIGHT DOT BOLD COMMA;

padding_Style: PADDING_style COLON  EDGEINSETES DOT (ONLY OP ((TOP|BOTTON) COLON)|ALL OP)   NUMBER CP COMMA;

rgb: RGB OP NUMBER COMMA NUMBER COMMA NUMBER COMMA NUMBER  CP;

////**************************************************
string: SINGLEQUOTATION NAME SINGLEQUOTATION;