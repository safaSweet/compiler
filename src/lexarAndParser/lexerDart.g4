lexer grammar lexerDart;
RUNAPP :'runApp';
DOLAR :'$';
AND:'&';
COMMA : ',';
OB: '[';
CB: ']';
OBC: '{';
CBC: '}';
OP: '(';
CP: ')';
COLON: ':';
DOT: '.';
EQUAL: '==';
EG :'=>';
ASSIGN: '=';
GT: '>';
LT: '<';
LTE: '<=';
MINUS_EQUAL: '-=';
MINUS: '-';
DECREAMENT: '--';
NOT_EQUAL: '!=';
NOT: '!';
BITOR: '|';
MOD: '%';
MOD_ASSIGN: '%=';
PLUS: '+';
PLUS_ASSIGN: '+=';
INCREAMENT: '++';
OR: '||';
QU: '?';
SEMI: ';';
DIV_ASSIGN: '/=';
MUL_ASSIGN: '*=';
DIV: '/';
MUL: '*';

CLASS_:'class';
OVERRIDE:'@override';
STATELESSWIDGET:'StatelessWidget';
STATEFULLWIDGET:'StatefulWidget';
FLOATINGACTIONBUTTON:'floatingActionButton';
FLATBUTTON:'FlatButton';
COLOR:'Color';
COLORS:'Colors';
COLOR_STYLE:'color';
//COLOR_NUMBER: NUMBER{1,19};
MAXLINE:'maxLines';
BACKGROUND_COLOR:'backgroundColor';
FILLED:'filled';
FILLCOLOR:'fillColor';
FOCUSCOLOR:'focusColor';
HOVERCOLOR:'hoverColor';
LABEL:'label';
ICON:'icon';
START:'start';
CONTROLLER:'controller';
DECORATION:'decoration';
INPUT_DECORATION:'InputDecoration';
HINTTEXT:'hintText';
BORDER:'border';
OUTLINEBORDER:'OutlineInputBorder';
ENABLE_BORDER:'enabledBorder';
BORDER_SIDE:'borderSide';
BORDERSIDE:'BorderSide';
CLIP_BEHAVOIR:'clipBehavior';
Page : 'page' ;
BODY :'body';
ROW :'Row';
COLUMN :'Column';
TEXT_FIELD:'TextField';
SINGLE_CHILD_SCROLL_VIEW:'SingleChildScrollView';
DOT_TEXT:'text';
CONSTRAIN_BOX:'ConstrainedBox';
BOX_CONSTRAINT:'BoxConstraints';
LISTVIEW:'ListView';
LIST_TITLE:'ListTile';
TITLE:'title';
CONSTRAINT:'constraints';

CARD:'Card';
PADDING_WIDGET:'Padding';
PADDING_style:'padding';
EDGEINSETES:'EdgeInsets';
ALL:'all';
ONLY:'only';
SPACE_AROUND :'spaceAround';
SPACE_EVENLY :'spaceEvenly';
CENTER :'center';
TOP:'top';
BOTTON:'bottom';
HOME :'home';
KEY :'key';
SET_STATE:'setState';
SET:'Set';
STATE:'State';
CHILD:'child';
CHILDREN:'children';
OVERFLOW:'overflow';
TEXT_OVER_FLOW:'TextOverflow';
SHRINK_WARP:'shrinkWrap';
PHYSICS:'physics';
SCRPLL_PYSIC:'NeverScrollableScrollPhysics';
SUBTITLE:'subtitle';
TRAILLING:'trailing';
CLIP:'Clip';
WIDGET:'Widget';
CONTAINER:'Container';
BUILDCONTEXT :'BuildContext';
CONTEXT:'context';
INDEX:'index';
BUILD:'build';
RGB:'Color.fromRGBO';
MATERIAL_APP:'MaterialApp';
DEBUG_SHOW_CHECKED_MODE_BANNER:'debugShowCheckedModeBanner';
ELEVATED_BUTTON:'ElevatedButton';
ITEM_COUNT:'itemCount';
ITEM_BUILDER:'itemBuilder';
GRIDVIEW:'GridView';
ABSTRACT_:'abstract';
LENGTH:'length';
AS_:'as';
BREAK_:'break';
CASE_:'case';
CATCH_:'catch';
CONST_:'const';
CONTINUE_:'continue';
DEFAULT_:'default';
DO_:'do';
DYNAMIC_:'dynamic';
ELSE_:'else';
ENUM_:'enum';
EXPORT_:'export';
EXTENDS_:'extends';
EXTENSION_:'extension';
EXTERNAL_:'external';
FACTORY_:'factory';
FALSE:'false';
FINAL_:'final';
FINALLY_:'finally';
FOR_:'for';
FUNCTION_:'Function';
MAP:'Map';
GET_:'get';
HIDE_:'hide';
IF:'if';
IMPLEMENTS_:'implements';
IMPORT:'import';
IN_:'in';
INTERFACE_:'interface';
LIST:'List';
IS_:'is';
NEW_:'new';
NULL_:'null';
OF_:'of';
ON_:'on';
SIZEBOX:'SizedBox';
OPERATOR_:'operator';
PART_:'part';
REQUIRED_:'required';
RETURN:'return';
SET_:'set';
SHOW_:'show';
STATIC_:'static';
SUPER_:'super';
SWITCH_:'switch';
THIS_:'this';
THROW_:'throw';
TRUE:'true';
TRY_:'try';
VAR_:'var';
VOID:'void';
WHILE_:'while';
WITH_:'with';
SCAFFOLD:'Scaffold';
SAFEAREA:'SafeArea';
WIDTH:'width';
HEIGHT:'height';
TEXT : 'Text';
TEXTSTYLE:'TextStyle';
FONT_SIZE:'fontSize';
FONT_WEIGHT:'fontWeight';
FONTWEIGHT:'FontWeight';
BOLD:'bold';
BUILER:'builder';
IMAGE:'Image';
ASSET:'asset';
PRINT:'print';
STYLE:'style';
ONTAP:'onTap';
ONPRESS:'onPressed';
GestureDetector:'GestureDetector';
MAINAXISALIGNMENT:'MainAxisAlignment';
TEXT_EDITING_CONTROLLER:'TextEditingController';
MAINAXIS:'mainAxisAlignment';
CROSSAXIS:'crossAxisAlignment';
CROSSAXISaLIGNMENT:'CrossAxisAlignment';
NONE:'none';

SIZE:'size';
TYPE_DEFINITION:'String'|'bool'|'int';
IS_NOT_EMPTY:'isNotEmpty';
CLEAR:'clear';
REMOVE_AT:'removeAt';
MAIN:'main';
// TYPEFUNC:'void'|BUILDCONTEXT|'Widget';
NUMBER : DIGIT+ ( '.' DIGIT+ )? EXPONENT? | '.' DIGIT+ EXPONENT? ;
fragment EXPONENT : ( 'e' | 'E' ) ( '+' | '-' )? DIGIT+ ;
fragment LETTER : 'a' .. 'z' | 'A' .. 'Z' ;
fragment DIGIT : '0' .. '9' ;
 SINGLEQUOTATION:'\'' ;
 DOUBLEQUOTATION:'"';

 NAME
  :NAMEStartChar NAMEChar*;
fragment NAMEChar
    : NAMEStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
     ;

fragment NAMEStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;
