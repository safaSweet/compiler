// Generated from java-escape by ANTLR 4.11.1
package lexarAndParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class parserD extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RUNAPP=1, DOLAR=2, AND=3, COMMA=4, OB=5, CB=6, OBC=7, CBC=8, OP=9, CP=10, 
		COLON=11, DOT=12, EQUAL=13, EG=14, ASSIGN=15, GT=16, LT=17, LTE=18, MINUS_EQUAL=19, 
		MINUS=20, DECREAMENT=21, NOT_EQUAL=22, NOT=23, BITOR=24, MOD=25, MOD_ASSIGN=26, 
		PLUS=27, PLUS_ASSIGN=28, INCREAMENT=29, OR=30, QU=31, SEMI=32, DIV_ASSIGN=33, 
		MUL_ASSIGN=34, DIV=35, MUL=36, CLASS_=37, OVERRIDE=38, STATELESSWIDGET=39, 
		STATEFULLWIDGET=40, FLOATINGACTIONBUTTON=41, FLATBUTTON=42, COLOR=43, 
		COLORS=44, COLOR_STYLE=45, MAXLINE=46, BACKGROUND_COLOR=47, FILLED=48, 
		FILLCOLOR=49, FOCUSCOLOR=50, HOVERCOLOR=51, LABEL=52, ICON=53, START=54, 
		CONTROLLER=55, DECORATION=56, INPUT_DECORATION=57, HINTTEXT=58, BORDER=59, 
		OUTLINEBORDER=60, ENABLE_BORDER=61, BORDER_SIDE=62, BORDERSIDE=63, CLIP_BEHAVOIR=64, 
		Page=65, BODY=66, ROW=67, COLUMN=68, TEXT_FIELD=69, SINGLE_CHILD_SCROLL_VIEW=70, 
		DOT_TEXT=71, CONSTRAIN_BOX=72, BOX_CONSTRAINT=73, LISTVIEW=74, LIST_TITLE=75, 
		TITLE=76, CONSTRAINT=77, CARD=78, PADDING_WIDGET=79, PADDING_style=80, 
		EDGEINSETES=81, ALL=82, ONLY=83, SPACE_AROUND=84, SPACE_EVENLY=85, CENTER=86, 
		TOP=87, BOTTON=88, HOME=89, KEY=90, SET_STATE=91, SET=92, STATE=93, CHILD=94, 
		CHILDREN=95, OVERFLOW=96, TEXT_OVER_FLOW=97, SHRINK_WARP=98, PHYSICS=99, 
		SCRPLL_PYSIC=100, SUBTITLE=101, TRAILLING=102, CLIP=103, WIDGET=104, CONTAINER=105, 
		BUILDCONTEXT=106, CONTEXT=107, INDEX=108, BUILD=109, RGB=110, MATERIAL_APP=111, 
		DEBUG_SHOW_CHECKED_MODE_BANNER=112, ELEVATED_BUTTON=113, ITEM_COUNT=114, 
		ITEM_BUILDER=115, GRIDVIEW=116, ABSTRACT_=117, LENGTH=118, AS_=119, BREAK_=120, 
		CASE_=121, CATCH_=122, CONST_=123, CONTINUE_=124, DEFAULT_=125, DO_=126, 
		DYNAMIC_=127, ELSE_=128, ENUM_=129, EXPORT_=130, EXTENDS_=131, EXTENSION_=132, 
		EXTERNAL_=133, FACTORY_=134, FALSE=135, FINAL_=136, FINALLY_=137, FOR_=138, 
		FUNCTION_=139, MAP=140, GET_=141, HIDE_=142, IF=143, IMPLEMENTS_=144, 
		IMPORT=145, IN_=146, INTERFACE_=147, LIST=148, IS_=149, NEW_=150, NULL_=151, 
		OF_=152, ON_=153, SIZEBOX=154, OPERATOR_=155, PART_=156, REQUIRED_=157, 
		RETURN=158, SET_=159, SHOW_=160, STATIC_=161, SUPER_=162, SWITCH_=163, 
		THIS_=164, THROW_=165, TRUE=166, TRY_=167, VAR_=168, VOID=169, WHILE_=170, 
		WITH_=171, SCAFFOLD=172, SAFEAREA=173, WIDTH=174, HEIGHT=175, TEXT=176, 
		TEXTSTYLE=177, FONT_SIZE=178, FONT_WEIGHT=179, FONTWEIGHT=180, BOLD=181, 
		BUILER=182, IMAGE=183, ASSET=184, PRINT=185, STYLE=186, ONTAP=187, ONPRESS=188, 
		GestureDetector=189, MAINAXISALIGNMENT=190, TEXT_EDITING_CONTROLLER=191, 
		MAINAXIS=192, CROSSAXIS=193, CROSSAXISaLIGNMENT=194, NONE=195, SIZE=196, 
		TYPE_DEFINITION=197, IS_NOT_EMPTY=198, CLEAR=199, REMOVE_AT=200, MAIN=201, 
		NUMBER=202, SINGLEQUOTATION=203, DOUBLEQUOTATION=204, NAME=205, TAG_WHITESPACE=206;
	public static final int
		RULE_main = 0, RULE_program = 1, RULE_class = 2, RULE_bodyMyApp = 3, RULE_class_extend = 4, 
		RULE_containClass = 5, RULE_bodyclass = 6, RULE_super_key = 7, RULE_constructor = 8, 
		RULE_function = 9, RULE_void_function = 10, RULE_buildFunction = 11, RULE_call_ = 12, 
		RULE_itemBodyFunction = 13, RULE_attributes = 14, RULE_call_function = 15, 
		RULE_object = 16, RULE_type = 17, RULE_texteditingcontroller = 18, RULE_widget = 19, 
		RULE_array_widget = 20, RULE_all_widget = 21, RULE_single_child_scroll_view = 22, 
		RULE_container = 23, RULE_row = 24, RULE_column = 25, RULE_listView = 26, 
		RULE_card = 27, RULE_listTitle = 28, RULE_shortConditionStatment = 29, 
		RULE_if_condition = 30, RULE_padding_widget = 31, RULE_text_field = 32, 
		RULE_hintText = 33, RULE_border = 34, RULE_enableBorder = 35, RULE_filled = 36, 
		RULE_fillColor = 37, RULE_focusColor = 38, RULE_hoverColor = 39, RULE_contain_constrant = 40, 
		RULE_button = 41, RULE_variables = 42, RULE_array_variabels = 43, RULE_valueVariables = 44, 
		RULE_valueNumber = 45, RULE_valueBoolean = 46, RULE_valueSTRING = 47, 
		RULE_variableDot = 48, RULE_definition_Nmber = 49, RULE_definition_Boolean = 50, 
		RULE_definition_String = 51, RULE_definition_DOT_String = 52, RULE_bool = 53, 
		RULE_list = 54, RULE_typeMap = 55, RULE_valueList = 56, RULE_assign_List_to_variable = 57, 
		RULE_add_to_list = 58, RULE_setState = 59, RULE_bodySetState = 60, RULE_crossAxis = 61, 
		RULE_mainAxis = 62, RULE_sizebox = 63, RULE_clip_behavoir = 64, RULE_text = 65, 
		RULE_condition_in_text = 66, RULE_type_text1 = 67, RULE_fontSize = 68, 
		RULE_fontWeight = 69, RULE_padding_Style = 70, RULE_rgb = 71, RULE_string = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "program", "class", "bodyMyApp", "class_extend", "containClass", 
			"bodyclass", "super_key", "constructor", "function", "void_function", 
			"buildFunction", "call_", "itemBodyFunction", "attributes", "call_function", 
			"object", "type", "texteditingcontroller", "widget", "array_widget", 
			"all_widget", "single_child_scroll_view", "container", "row", "column", 
			"listView", "card", "listTitle", "shortConditionStatment", "if_condition", 
			"padding_widget", "text_field", "hintText", "border", "enableBorder", 
			"filled", "fillColor", "focusColor", "hoverColor", "contain_constrant", 
			"button", "variables", "array_variabels", "valueVariables", "valueNumber", 
			"valueBoolean", "valueSTRING", "variableDot", "definition_Nmber", "definition_Boolean", 
			"definition_String", "definition_DOT_String", "bool", "list", "typeMap", 
			"valueList", "assign_List_to_variable", "add_to_list", "setState", "bodySetState", 
			"crossAxis", "mainAxis", "sizebox", "clip_behavoir", "text", "condition_in_text", 
			"type_text1", "fontSize", "fontWeight", "padding_Style", "rgb", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'runApp'", "'$'", "'&'", "','", "'['", "']'", "'{'", "'}'", "'('", 
			"')'", "':'", "'.'", "'=='", "'=>'", "'='", "'>'", "'<'", "'<='", "'-='", 
			"'-'", "'--'", "'!='", "'!'", "'|'", "'%'", "'%='", "'+'", "'+='", "'++'", 
			"'||'", "'?'", "';'", "'/='", "'*='", "'/'", "'*'", "'class'", "'@override'", 
			"'StatelessWidget'", "'StatefulWidget'", "'floatingActionButton'", "'FlatButton'", 
			"'Color'", "'Colors'", "'color'", "'maxLines'", "'backgroundColor'", 
			"'filled'", "'fillColor'", "'focusColor'", "'hoverColor'", "'label'", 
			"'icon'", "'start'", "'controller'", "'decoration'", "'InputDecoration'", 
			"'hintText'", "'border'", "'OutlineInputBorder'", "'enabledBorder'", 
			"'borderSide'", "'BorderSide'", "'clipBehavior'", "'page'", "'body'", 
			"'Row'", "'Column'", "'TextField'", "'SingleChildScrollView'", "'text'", 
			"'ConstrainedBox'", "'BoxConstraints'", "'ListView'", "'ListTile'", "'title'", 
			"'constraints'", "'Card'", "'Padding'", "'padding'", "'EdgeInsets'", 
			"'all'", "'only'", "'spaceAround'", "'spaceEvenly'", "'center'", "'top'", 
			"'bottom'", "'home'", "'key'", "'setState'", "'Set'", "'State'", "'child'", 
			"'children'", "'overflow'", "'TextOverflow'", "'shrinkWrap'", "'physics'", 
			"'NeverScrollableScrollPhysics'", "'subtitle'", "'trailing'", "'Clip'", 
			"'Widget'", "'Container'", "'BuildContext'", "'context'", "'index'", 
			"'build'", "'Color.fromRGBO'", "'MaterialApp'", "'debugShowCheckedModeBanner'", 
			"'ElevatedButton'", "'itemCount'", "'itemBuilder'", "'GridView'", "'abstract'", 
			"'length'", "'as'", "'break'", "'case'", "'catch'", "'const'", "'continue'", 
			"'default'", "'do'", "'dynamic'", "'else'", "'enum'", "'export'", "'extends'", 
			"'extension'", "'external'", "'factory'", "'false'", "'final'", "'finally'", 
			"'for'", "'Function'", "'Map'", "'get'", "'hide'", "'if'", "'implements'", 
			"'import'", "'in'", "'interface'", "'List'", "'is'", "'new'", "'null'", 
			"'of'", "'on'", "'SizedBox'", "'operator'", "'part'", "'required'", "'return'", 
			"'set'", "'show'", "'static'", "'super'", "'switch'", "'this'", "'throw'", 
			"'true'", "'try'", "'var'", "'void'", "'while'", "'with'", "'Scaffold'", 
			"'SafeArea'", "'width'", "'height'", "'Text'", "'TextStyle'", "'fontSize'", 
			"'fontWeight'", "'FontWeight'", "'bold'", "'builder'", "'Image'", "'asset'", 
			"'print'", "'style'", "'onTap'", "'onPressed'", "'GestureDetector'", 
			"'MainAxisAlignment'", "'TextEditingController'", "'mainAxisAlignment'", 
			"'crossAxisAlignment'", "'CrossAxisAlignment'", "'none'", "'size'", null, 
			"'isNotEmpty'", "'clear'", "'removeAt'", "'main'", null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RUNAPP", "DOLAR", "AND", "COMMA", "OB", "CB", "OBC", "CBC", "OP", 
			"CP", "COLON", "DOT", "EQUAL", "EG", "ASSIGN", "GT", "LT", "LTE", "MINUS_EQUAL", 
			"MINUS", "DECREAMENT", "NOT_EQUAL", "NOT", "BITOR", "MOD", "MOD_ASSIGN", 
			"PLUS", "PLUS_ASSIGN", "INCREAMENT", "OR", "QU", "SEMI", "DIV_ASSIGN", 
			"MUL_ASSIGN", "DIV", "MUL", "CLASS_", "OVERRIDE", "STATELESSWIDGET", 
			"STATEFULLWIDGET", "FLOATINGACTIONBUTTON", "FLATBUTTON", "COLOR", "COLORS", 
			"COLOR_STYLE", "MAXLINE", "BACKGROUND_COLOR", "FILLED", "FILLCOLOR", 
			"FOCUSCOLOR", "HOVERCOLOR", "LABEL", "ICON", "START", "CONTROLLER", "DECORATION", 
			"INPUT_DECORATION", "HINTTEXT", "BORDER", "OUTLINEBORDER", "ENABLE_BORDER", 
			"BORDER_SIDE", "BORDERSIDE", "CLIP_BEHAVOIR", "Page", "BODY", "ROW", 
			"COLUMN", "TEXT_FIELD", "SINGLE_CHILD_SCROLL_VIEW", "DOT_TEXT", "CONSTRAIN_BOX", 
			"BOX_CONSTRAINT", "LISTVIEW", "LIST_TITLE", "TITLE", "CONSTRAINT", "CARD", 
			"PADDING_WIDGET", "PADDING_style", "EDGEINSETES", "ALL", "ONLY", "SPACE_AROUND", 
			"SPACE_EVENLY", "CENTER", "TOP", "BOTTON", "HOME", "KEY", "SET_STATE", 
			"SET", "STATE", "CHILD", "CHILDREN", "OVERFLOW", "TEXT_OVER_FLOW", "SHRINK_WARP", 
			"PHYSICS", "SCRPLL_PYSIC", "SUBTITLE", "TRAILLING", "CLIP", "WIDGET", 
			"CONTAINER", "BUILDCONTEXT", "CONTEXT", "INDEX", "BUILD", "RGB", "MATERIAL_APP", 
			"DEBUG_SHOW_CHECKED_MODE_BANNER", "ELEVATED_BUTTON", "ITEM_COUNT", "ITEM_BUILDER", 
			"GRIDVIEW", "ABSTRACT_", "LENGTH", "AS_", "BREAK_", "CASE_", "CATCH_", 
			"CONST_", "CONTINUE_", "DEFAULT_", "DO_", "DYNAMIC_", "ELSE_", "ENUM_", 
			"EXPORT_", "EXTENDS_", "EXTENSION_", "EXTERNAL_", "FACTORY_", "FALSE", 
			"FINAL_", "FINALLY_", "FOR_", "FUNCTION_", "MAP", "GET_", "HIDE_", "IF", 
			"IMPLEMENTS_", "IMPORT", "IN_", "INTERFACE_", "LIST", "IS_", "NEW_", 
			"NULL_", "OF_", "ON_", "SIZEBOX", "OPERATOR_", "PART_", "REQUIRED_", 
			"RETURN", "SET_", "SHOW_", "STATIC_", "SUPER_", "SWITCH_", "THIS_", "THROW_", 
			"TRUE", "TRY_", "VAR_", "VOID", "WHILE_", "WITH_", "SCAFFOLD", "SAFEAREA", 
			"WIDTH", "HEIGHT", "TEXT", "TEXTSTYLE", "FONT_SIZE", "FONT_WEIGHT", "FONTWEIGHT", 
			"BOLD", "BUILER", "IMAGE", "ASSET", "PRINT", "STYLE", "ONTAP", "ONPRESS", 
			"GestureDetector", "MAINAXISALIGNMENT", "TEXT_EDITING_CONTROLLER", "MAINAXIS", 
			"CROSSAXIS", "CROSSAXISaLIGNMENT", "NONE", "SIZE", "TYPE_DEFINITION", 
			"IS_NOT_EMPTY", "CLEAR", "REMOVE_AT", "MAIN", "NUMBER", "SINGLEQUOTATION", 
			"DOUBLEQUOTATION", "NAME", "TAG_WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parserD(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public List<TerminalNode> VOID() { return getTokens(parserD.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(parserD.VOID, i);
		}
		public List<TerminalNode> MAIN() { return getTokens(parserD.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(parserD.MAIN, i);
		}
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public List<TerminalNode> OBC() { return getTokens(parserD.OBC); }
		public TerminalNode OBC(int i) {
			return getToken(parserD.OBC, i);
		}
		public List<TerminalNode> RUNAPP() { return getTokens(parserD.RUNAPP); }
		public TerminalNode RUNAPP(int i) {
			return getToken(parserD.RUNAPP, i);
		}
		public List<TerminalNode> CONST_() { return getTokens(parserD.CONST_); }
		public TerminalNode CONST_(int i) {
			return getToken(parserD.CONST_, i);
		}
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(parserD.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(parserD.SEMI, i);
		}
		public List<TerminalNode> CBC() { return getTokens(parserD.CBC); }
		public TerminalNode CBC(int i) {
			return getToken(parserD.CBC, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS_ || _la==VOID) {
				{
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS_:
					{
					setState(146);
					program();
					}
					break;
				case VOID:
					{
					setState(147);
					match(VOID);
					setState(148);
					match(MAIN);
					setState(149);
					match(OP);
					setState(150);
					match(CP);
					setState(151);
					match(OBC);
					setState(152);
					match(RUNAPP);
					setState(153);
					match(OP);
					setState(154);
					match(CONST_);
					setState(155);
					match(NAME);
					setState(156);
					match(OP);
					setState(157);
					match(CP);
					setState(158);
					match(CP);
					setState(159);
					match(SEMI);
					setState(160);
					match(CBC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			class_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS_() { return getToken(parserD.CLASS_, 0); }
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode EXTENDS_() { return getToken(parserD.EXTENDS_, 0); }
		public Class_extendContext class_extend() {
			return getRuleContext(Class_extendContext.class,0);
		}
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public ContainClassContext containClass() {
			return getRuleContext(ContainClassContext.class,0);
		}
		public TerminalNode CBC() { return getToken(parserD.CBC, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(CLASS_);
			setState(169);
			match(NAME);
			setState(170);
			match(EXTENDS_);
			setState(171);
			class_extend();
			setState(172);
			match(OBC);
			setState(173);
			containClass();
			setState(174);
			match(CBC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyMyAppContext extends ParserRuleContext {
		public Super_keyContext super_key() {
			return getRuleContext(Super_keyContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(parserD.OVERRIDE, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BodyMyAppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyMyApp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterBodyMyApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitBodyMyApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitBodyMyApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyMyAppContext bodyMyApp() throws RecognitionException {
		BodyMyAppContext _localctx = new BodyMyAppContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bodyMyApp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			super_key();
			setState(177);
			match(OVERRIDE);
			setState(178);
			function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_extendContext extends ParserRuleContext {
		public TerminalNode STATELESSWIDGET() { return getToken(parserD.STATELESSWIDGET, 0); }
		public TerminalNode STATEFULLWIDGET() { return getToken(parserD.STATEFULLWIDGET, 0); }
		public TerminalNode STATE() { return getToken(parserD.STATE, 0); }
		public TerminalNode LT() { return getToken(parserD.LT, 0); }
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode GT() { return getToken(parserD.GT, 0); }
		public Class_extendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_extend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterClass_extend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitClass_extend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitClass_extend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_extendContext class_extend() throws RecognitionException {
		Class_extendContext _localctx = new Class_extendContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_extend);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STATELESSWIDGET:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(STATELESSWIDGET);
				}
				break;
			case STATEFULLWIDGET:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(STATEFULLWIDGET);
				}
				break;
			case STATE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(182);
				match(STATE);
				setState(183);
				match(LT);
				setState(184);
				match(NAME);
				setState(185);
				match(GT);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainClassContext extends ParserRuleContext {
		public List<BodyMyAppContext> bodyMyApp() {
			return getRuleContexts(BodyMyAppContext.class);
		}
		public BodyMyAppContext bodyMyApp(int i) {
			return getRuleContext(BodyMyAppContext.class,i);
		}
		public List<BodyclassContext> bodyclass() {
			return getRuleContexts(BodyclassContext.class);
		}
		public BodyclassContext bodyclass(int i) {
			return getRuleContext(BodyclassContext.class,i);
		}
		public ContainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterContainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitContainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitContainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainClassContext containClass() throws RecognitionException {
		ContainClassContext _localctx = new ContainClassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_containClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OVERRIDE || (((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 17592186568705L) != 0 || (((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & 68992106497L) != 0) {
				{
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST_:
					{
					setState(188);
					bodyMyApp();
					}
					break;
				case OVERRIDE:
				case WIDGET:
				case LIST:
				case VOID:
				case TEXT_EDITING_CONTROLLER:
				case TYPE_DEFINITION:
				case NAME:
					{
					setState(189);
					bodyclass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyclassContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<Array_variabelsContext> array_variabels() {
			return getRuleContexts(Array_variabelsContext.class);
		}
		public Array_variabelsContext array_variabels(int i) {
			return getRuleContext(Array_variabelsContext.class,i);
		}
		public List<TexteditingcontrollerContext> texteditingcontroller() {
			return getRuleContexts(TexteditingcontrollerContext.class);
		}
		public TexteditingcontrollerContext texteditingcontroller(int i) {
			return getRuleContext(TexteditingcontrollerContext.class,i);
		}
		public List<TerminalNode> OVERRIDE() { return getTokens(parserD.OVERRIDE); }
		public TerminalNode OVERRIDE(int i) {
			return getToken(parserD.OVERRIDE, i);
		}
		public BodyclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterBodyclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitBodyclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitBodyclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyclassContext bodyclass() throws RecognitionException {
		BodyclassContext _localctx = new BodyclassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bodyclass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(196);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OVERRIDE) {
							{
							setState(195);
							match(OVERRIDE);
							}
						}

						setState(198);
						function();
						}
						break;
					case 2:
						{
						setState(199);
						list();
						}
						break;
					case 3:
						{
						setState(200);
						array_variabels();
						}
						break;
					case 4:
						{
						setState(201);
						texteditingcontroller();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(204); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Super_keyContext extends ParserRuleContext {
		public TerminalNode CONST_() { return getToken(parserD.CONST_, 0); }
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public TerminalNode SUPER_() { return getToken(parserD.SUPER_, 0); }
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public TerminalNode KEY() { return getToken(parserD.KEY, 0); }
		public TerminalNode CBC() { return getToken(parserD.CBC, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public Super_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterSuper_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitSuper_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitSuper_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Super_keyContext super_key() throws RecognitionException {
		Super_keyContext _localctx = new Super_keyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_super_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CONST_);
			setState(207);
			match(NAME);
			setState(208);
			match(OP);
			setState(209);
			match(OBC);
			setState(210);
			match(SUPER_);
			setState(211);
			match(DOT);
			setState(212);
			match(KEY);
			setState(213);
			match(CBC);
			setState(214);
			match(CP);
			setState(215);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(NAME);
			setState(218);
			match(OP);
			setState(219);
			match(CP);
			setState(220);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Void_functionContext void_function() {
			return getRuleContext(Void_functionContext.class,0);
		}
		public BuildFunctionContext buildFunction() {
			return getRuleContext(BuildFunctionContext.class,0);
		}
		public Call_Context call_() {
			return getRuleContext(Call_Context.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(222);
				void_function();
				}
				break;
			case 2:
				{
				setState(223);
				buildFunction();
				}
				break;
			case 3:
				{
				setState(224);
				call_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Void_functionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public ItemBodyFunctionContext itemBodyFunction() {
			return getRuleContext(ItemBodyFunctionContext.class,0);
		}
		public TerminalNode CBC() { return getToken(parserD.CBC, 0); }
		public TerminalNode VOID() { return getToken(parserD.VOID, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Void_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterVoid_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitVoid_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitVoid_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Void_functionContext void_function() throws RecognitionException {
		Void_functionContext _localctx = new Void_functionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_void_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOID) {
				{
				setState(227);
				match(VOID);
				}
			}

			setState(230);
			match(NAME);
			setState(231);
			match(OP);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WIDGET || _la==BUILDCONTEXT || _la==TYPE_DEFINITION) {
				{
				setState(232);
				attributes();
				}
			}

			setState(235);
			match(CP);
			setState(236);
			match(OBC);
			setState(237);
			itemBodyFunction();
			setState(238);
			match(CBC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuildFunctionContext extends ParserRuleContext {
		public TerminalNode WIDGET() { return getToken(parserD.WIDGET, 0); }
		public TerminalNode BUILD() { return getToken(parserD.BUILD, 0); }
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public TerminalNode BUILDCONTEXT() { return getToken(parserD.BUILDCONTEXT, 0); }
		public TerminalNode CONTEXT() { return getToken(parserD.CONTEXT, 0); }
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public TerminalNode RETURN() { return getToken(parserD.RETURN, 0); }
		public TerminalNode MATERIAL_APP() { return getToken(parserD.MATERIAL_APP, 0); }
		public TerminalNode DEBUG_SHOW_CHECKED_MODE_BANNER() { return getToken(parserD.DEBUG_SHOW_CHECKED_MODE_BANNER, 0); }
		public List<TerminalNode> COLON() { return getTokens(parserD.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserD.COLON, i);
		}
		public TerminalNode FALSE() { return getToken(parserD.FALSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode HOME() { return getToken(parserD.HOME, 0); }
		public TerminalNode SCAFFOLD() { return getToken(parserD.SCAFFOLD, 0); }
		public TerminalNode BACKGROUND_COLOR() { return getToken(parserD.BACKGROUND_COLOR, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public TerminalNode BODY() { return getToken(parserD.BODY, 0); }
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ShortConditionStatmentContext shortConditionStatment() {
			return getRuleContext(ShortConditionStatmentContext.class,0);
		}
		public BuildFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterBuildFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitBuildFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitBuildFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildFunctionContext buildFunction() throws RecognitionException {
		BuildFunctionContext _localctx = new BuildFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_buildFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WIDGET);
			setState(241);
			match(BUILD);
			setState(242);
			match(OP);
			setState(243);
			match(BUILDCONTEXT);
			setState(244);
			match(CONTEXT);
			setState(245);
			match(CP);
			setState(246);
			match(OBC);
			setState(247);
			match(RETURN);
			setState(248);
			match(MATERIAL_APP);
			setState(249);
			match(OP);
			setState(250);
			match(DEBUG_SHOW_CHECKED_MODE_BANNER);
			setState(251);
			match(COLON);
			setState(252);
			match(FALSE);
			setState(253);
			match(COMMA);
			setState(254);
			variables();
			setState(255);
			match(HOME);
			setState(256);
			match(COLON);
			setState(257);
			match(SCAFFOLD);
			setState(258);
			match(OP);
			setState(259);
			match(BACKGROUND_COLOR);
			setState(260);
			match(COLON);
			setState(261);
			rgb();
			setState(262);
			match(COMMA);
			setState(263);
			match(BODY);
			setState(264);
			match(COLON);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT || _la==NAME) {
					{
					setState(265);
					shortConditionStatment();
					}
				}

				}
				break;
			case 2:
				{
				setState(268);
				widget();
				}
				break;
			}
			setState(271);
			match(CP);
			setState(272);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_Context extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode CBC() { return getToken(parserD.CBC, 0); }
		public Call_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterCall_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitCall_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitCall_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_Context call_() throws RecognitionException {
		Call_Context _localctx = new Call_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_call_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(NAME);
			setState(275);
			match(NAME);
			setState(276);
			match(OP);
			setState(277);
			match(CP);
			setState(278);
			match(OBC);
			setState(279);
			constructor();
			setState(280);
			match(CBC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemBodyFunctionContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public SetStateContext setState() {
			return getRuleContext(SetStateContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ItemBodyFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemBodyFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterItemBodyFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitItemBodyFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitItemBodyFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemBodyFunctionContext itemBodyFunction() throws RecognitionException {
		ItemBodyFunctionContext _localctx = new ItemBodyFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_itemBodyFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			variables();
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(283);
				if_condition();
				}
				break;
			case SET_STATE:
				{
				setState(284);
				setState();
				}
				break;
			case NAME:
				{
				setState(285);
				constructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public List<TerminalNode> CONTEXT() { return getTokens(parserD.CONTEXT); }
		public TerminalNode CONTEXT(int i) {
			return getToken(parserD.CONTEXT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			type();
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==CONTEXT || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					match(COMMA);
					setState(291);
					type();
					setState(292);
					_la = _input.LA(1);
					if ( !(_la==CONTEXT || _la==NAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(299);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_functionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public TerminalNode INDEX() { return getToken(parserD.INDEX, 0); }
		public TerminalNode CONTEXT() { return getToken(parserD.CONTEXT, 0); }
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public TerminalNode CBC() { return getToken(parserD.CBC, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(NAME);
			setState(303);
			match(OP);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDEX:
				{
				setState(304);
				match(INDEX);
				}
				break;
			case CONTEXT:
				{
				setState(305);
				match(CONTEXT);
				}
				break;
			case OBC:
				{
				setState(306);
				match(OBC);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SINGLEQUOTATION) {
					{
					{
					setState(307);
					object();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				match(CBC);
				}
				break;
			case NAME:
				{
				setState(314);
				match(NAME);
				}
				break;
			case CP:
				break;
			default:
				break;
			}
			setState(317);
			match(CP);
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			string();
			setState(321);
			match(COLON);
			setState(322);
			match(NAME);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(323);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode WIDGET() { return getToken(parserD.WIDGET, 0); }
		public TerminalNode BUILDCONTEXT() { return getToken(parserD.BUILDCONTEXT, 0); }
		public TerminalNode TYPE_DEFINITION() { return getToken(parserD.TYPE_DEFINITION, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==WIDGET || _la==BUILDCONTEXT || _la==TYPE_DEFINITION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TexteditingcontrollerContext extends ParserRuleContext {
		public List<TerminalNode> TEXT_EDITING_CONTROLLER() { return getTokens(parserD.TEXT_EDITING_CONTROLLER); }
		public TerminalNode TEXT_EDITING_CONTROLLER(int i) {
			return getToken(parserD.TEXT_EDITING_CONTROLLER, i);
		}
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public TexteditingcontrollerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texteditingcontroller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterTexteditingcontroller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitTexteditingcontroller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitTexteditingcontroller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TexteditingcontrollerContext texteditingcontroller() throws RecognitionException {
		TexteditingcontrollerContext _localctx = new TexteditingcontrollerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_texteditingcontroller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(TEXT_EDITING_CONTROLLER);
			setState(329);
			match(NAME);
			setState(330);
			match(ASSIGN);
			setState(331);
			match(TEXT_EDITING_CONTROLLER);
			setState(332);
			match(OP);
			setState(333);
			match(CP);
			setState(334);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WidgetContext extends ParserRuleContext {
		public List<Array_widgetContext> array_widget() {
			return getRuleContexts(Array_widgetContext.class);
		}
		public Array_widgetContext array_widget(int i) {
			return getRuleContext(Array_widgetContext.class,i);
		}
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_widget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 70643622091183L) != 0) {
				{
				{
				setState(336);
				array_widget();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_widgetContext extends ParserRuleContext {
		public All_widgetContext all_widget() {
			return getRuleContext(All_widgetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public Array_widgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterArray_widget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitArray_widget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitArray_widget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_widgetContext array_widget() throws RecognitionException {
		Array_widgetContext _localctx = new Array_widgetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array_widget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			all_widget();
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(343);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class All_widgetContext extends ParserRuleContext {
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public Text_fieldContext text_field() {
			return getRuleContext(Text_fieldContext.class,0);
		}
		public Padding_widgetContext padding_widget() {
			return getRuleContext(Padding_widgetContext.class,0);
		}
		public ListViewContext listView() {
			return getRuleContext(ListViewContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public ListTitleContext listTitle() {
			return getRuleContext(ListTitleContext.class,0);
		}
		public Contain_constrantContext contain_constrant() {
			return getRuleContext(Contain_constrantContext.class,0);
		}
		public CardContext card() {
			return getRuleContext(CardContext.class,0);
		}
		public Single_child_scroll_viewContext single_child_scroll_view() {
			return getRuleContext(Single_child_scroll_viewContext.class,0);
		}
		public All_widgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterAll_widget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitAll_widget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitAll_widget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_widgetContext all_widget() throws RecognitionException {
		All_widgetContext _localctx = new All_widgetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_all_widget);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				container();
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				row();
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				column();
				}
				break;
			case TEXT_FIELD:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				text_field();
				}
				break;
			case PADDING_WIDGET:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				padding_widget();
				}
				break;
			case LISTVIEW:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				listView();
				}
				break;
			case ELEVATED_BUTTON:
				enterOuterAlt(_localctx, 7);
				{
				setState(352);
				button();
				}
				break;
			case LIST_TITLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(353);
				listTitle();
				}
				break;
			case CONSTRAIN_BOX:
				enterOuterAlt(_localctx, 9);
				{
				setState(354);
				contain_constrant();
				}
				break;
			case CARD:
				enterOuterAlt(_localctx, 10);
				{
				setState(355);
				card();
				}
				break;
			case SINGLE_CHILD_SCROLL_VIEW:
				enterOuterAlt(_localctx, 11);
				{
				setState(356);
				single_child_scroll_view();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Single_child_scroll_viewContext extends ParserRuleContext {
		public TerminalNode SINGLE_CHILD_SCROLL_VIEW() { return getToken(parserD.SINGLE_CHILD_SCROLL_VIEW, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CHILD() { return getToken(parserD.CHILD, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public Single_child_scroll_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_child_scroll_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterSingle_child_scroll_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitSingle_child_scroll_view(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitSingle_child_scroll_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_child_scroll_viewContext single_child_scroll_view() throws RecognitionException {
		Single_child_scroll_viewContext _localctx = new Single_child_scroll_viewContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_single_child_scroll_view);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(SINGLE_CHILD_SCROLL_VIEW);
			setState(360);
			match(OP);
			setState(361);
			match(CHILD);
			setState(362);
			match(COLON);
			setState(363);
			widget();
			setState(364);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(parserD.CONTAINER, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode CHILD() { return getToken(parserD.CHILD, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public Clip_behavoirContext clip_behavoir() {
			return getRuleContext(Clip_behavoirContext.class,0);
		}
		public Padding_StyleContext padding_Style() {
			return getRuleContext(Padding_StyleContext.class,0);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(CONTAINER);
			setState(367);
			match(OP);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1073807361L) != 0) {
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLIP_BEHAVOIR) {
					{
					setState(368);
					clip_behavoir();
					}
				}

				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PADDING_style) {
					{
					setState(371);
					padding_Style();
					}
				}

				setState(374);
				match(CHILD);
				setState(375);
				match(COLON);
				setState(376);
				widget();
				}
			}

			setState(379);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW() { return getToken(parserD.ROW, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CHILDREN() { return getToken(parserD.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode OB() { return getToken(parserD.OB, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode CB() { return getToken(parserD.CB, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public MainAxisContext mainAxis() {
			return getRuleContext(MainAxisContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ROW);
			setState(382);
			match(OP);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAINAXIS) {
				{
				setState(383);
				mainAxis();
				}
			}

			setState(386);
			match(CHILDREN);
			setState(387);
			match(COLON);
			setState(388);
			match(OB);
			setState(389);
			widget();
			setState(390);
			match(CB);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(391);
				match(COMMA);
				}
			}

			setState(394);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(parserD.COLUMN, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CHILDREN() { return getToken(parserD.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode OB() { return getToken(parserD.OB, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode CB() { return getToken(parserD.CB, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public CrossAxisContext crossAxis() {
			return getRuleContext(CrossAxisContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(COLUMN);
			setState(397);
			match(OP);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CROSSAXIS) {
				{
				setState(398);
				crossAxis();
				}
			}

			setState(401);
			match(CHILDREN);
			setState(402);
			match(COLON);
			setState(403);
			match(OB);
			setState(404);
			widget();
			setState(405);
			match(CB);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(406);
				match(COMMA);
				}
			}

			setState(409);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListViewContext extends ParserRuleContext {
		public TerminalNode LISTVIEW() { return getToken(parserD.LISTVIEW, 0); }
		public List<TerminalNode> DOT() { return getTokens(parserD.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(parserD.DOT, i);
		}
		public TerminalNode BUILER() { return getToken(parserD.BUILER, 0); }
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public TerminalNode SHRINK_WARP() { return getToken(parserD.SHRINK_WARP, 0); }
		public List<TerminalNode> COLON() { return getTokens(parserD.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserD.COLON, i);
		}
		public TerminalNode TRUE() { return getToken(parserD.TRUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public TerminalNode PHYSICS() { return getToken(parserD.PHYSICS, 0); }
		public TerminalNode SCRPLL_PYSIC() { return getToken(parserD.SCRPLL_PYSIC, 0); }
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public TerminalNode ITEM_COUNT() { return getToken(parserD.ITEM_COUNT, 0); }
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode LENGTH() { return getToken(parserD.LENGTH, 0); }
		public TerminalNode ITEM_BUILDER() { return getToken(parserD.ITEM_BUILDER, 0); }
		public TerminalNode CONTEXT() { return getToken(parserD.CONTEXT, 0); }
		public TerminalNode INDEX() { return getToken(parserD.INDEX, 0); }
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public TerminalNode RETURN() { return getToken(parserD.RETURN, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode CBC() { return getToken(parserD.CBC, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterListView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitListView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitListView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListViewContext listView() throws RecognitionException {
		ListViewContext _localctx = new ListViewContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listView);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(LISTVIEW);
			setState(412);
			match(DOT);
			setState(413);
			match(BUILER);
			setState(414);
			match(OP);
			setState(415);
			match(SHRINK_WARP);
			setState(416);
			match(COLON);
			setState(417);
			match(TRUE);
			setState(418);
			match(COMMA);
			setState(419);
			match(PHYSICS);
			setState(420);
			match(COLON);
			setState(421);
			match(SCRPLL_PYSIC);
			setState(422);
			match(OP);
			setState(423);
			match(CP);
			setState(424);
			match(COMMA);
			setState(425);
			match(ITEM_COUNT);
			setState(426);
			match(COLON);
			setState(427);
			match(NAME);
			setState(428);
			match(DOT);
			setState(429);
			match(LENGTH);
			setState(430);
			match(COMMA);
			setState(431);
			match(ITEM_BUILDER);
			setState(432);
			match(COLON);
			setState(433);
			match(OP);
			setState(434);
			match(CONTEXT);
			setState(435);
			match(COMMA);
			setState(436);
			match(INDEX);
			setState(437);
			match(CP);
			setState(438);
			match(OBC);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST || _la==TYPE_DEFINITION) {
				{
				setState(439);
				list();
				}
			}

			setState(442);
			match(RETURN);
			setState(443);
			widget();
			setState(444);
			match(CBC);
			setState(445);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CardContext extends ParserRuleContext {
		public TerminalNode CARD() { return getToken(parserD.CARD, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CHILD() { return getToken(parserD.CHILD, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitCard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitCard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_card);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(CARD);
			setState(448);
			match(OP);
			setState(449);
			match(CHILD);
			setState(450);
			match(COLON);
			setState(451);
			widget();
			setState(452);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListTitleContext extends ParserRuleContext {
		public TerminalNode LIST_TITLE() { return getToken(parserD.LIST_TITLE, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode TITLE() { return getToken(parserD.TITLE, 0); }
		public List<TerminalNode> COLON() { return getTokens(parserD.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserD.COLON, i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public TerminalNode SUBTITLE() { return getToken(parserD.SUBTITLE, 0); }
		public TerminalNode TRAILLING() { return getToken(parserD.TRAILLING, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public ListTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterListTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitListTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitListTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTitleContext listTitle() throws RecognitionException {
		ListTitleContext _localctx = new ListTitleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listTitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LIST_TITLE);
			setState(455);
			match(OP);
			{
			setState(456);
			match(TITLE);
			setState(457);
			match(COLON);
			setState(458);
			text();
			}
			{
			setState(460);
			match(SUBTITLE);
			setState(461);
			match(COLON);
			setState(462);
			text();
			}
			{
			setState(464);
			match(TRAILLING);
			setState(465);
			match(COLON);
			setState(466);
			widget();
			}
			setState(468);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortConditionStatmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode QU() { return getToken(parserD.QU, 0); }
		public List<WidgetContext> widget() {
			return getRuleContexts(WidgetContext.class);
		}
		public WidgetContext widget(int i) {
			return getRuleContext(WidgetContext.class,i);
		}
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode NOT() { return getToken(parserD.NOT, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public ShortConditionStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortConditionStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterShortConditionStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitShortConditionStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitShortConditionStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortConditionStatmentContext shortConditionStatment() throws RecognitionException {
		ShortConditionStatmentContext _localctx = new ShortConditionStatmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_shortConditionStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(470);
				match(NOT);
				}
			}

			setState(473);
			match(NAME);
			setState(474);
			match(QU);
			setState(475);
			widget();
			setState(476);
			match(COLON);
			setState(477);
			widget();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(478);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_conditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(parserD.IF, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(parserD.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(parserD.DOT, i);
		}
		public List<TerminalNode> IS_NOT_EMPTY() { return getTokens(parserD.IS_NOT_EMPTY); }
		public TerminalNode IS_NOT_EMPTY(int i) {
			return getToken(parserD.IS_NOT_EMPTY, i);
		}
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public Add_to_listContext add_to_list() {
			return getRuleContext(Add_to_listContext.class,0);
		}
		public TerminalNode CBC() { return getToken(parserD.CBC, 0); }
		public List<TerminalNode> AND() { return getTokens(parserD.AND); }
		public TerminalNode AND(int i) {
			return getToken(parserD.AND, i);
		}
		public List<Call_functionContext> call_function() {
			return getRuleContexts(Call_functionContext.class);
		}
		public Call_functionContext call_function(int i) {
			return getRuleContext(Call_functionContext.class,i);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(IF);
			setState(482);
			match(OP);
			setState(483);
			match(NAME);
			setState(484);
			match(DOT);
			setState(485);
			match(IS_NOT_EMPTY);
			{
			setState(486);
			match(AND);
			setState(487);
			match(AND);
			setState(488);
			match(NAME);
			setState(489);
			match(DOT);
			setState(490);
			match(IS_NOT_EMPTY);
			}
			setState(492);
			match(CP);
			setState(493);
			match(OBC);
			setState(494);
			add_to_list();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(495);
				call_function();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(CBC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Padding_widgetContext extends ParserRuleContext {
		public TerminalNode PADDING_WIDGET() { return getToken(parserD.PADDING_WIDGET, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CHILD() { return getToken(parserD.CHILD, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public Padding_StyleContext padding_Style() {
			return getRuleContext(Padding_StyleContext.class,0);
		}
		public Padding_widgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterPadding_widget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitPadding_widget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitPadding_widget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Padding_widgetContext padding_widget() throws RecognitionException {
		Padding_widgetContext _localctx = new Padding_widgetContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_padding_widget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(PADDING_WIDGET);
			setState(504);
			match(OP);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PADDING_style) {
				{
				setState(505);
				padding_Style();
				}
			}

			setState(508);
			match(CHILD);
			setState(509);
			match(COLON);
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(510);
				text();
				}
				break;
			case CP:
			case ROW:
			case COLUMN:
			case TEXT_FIELD:
			case SINGLE_CHILD_SCROLL_VIEW:
			case CONSTRAIN_BOX:
			case LISTVIEW:
			case LIST_TITLE:
			case CARD:
			case PADDING_WIDGET:
			case CONTAINER:
			case ELEVATED_BUTTON:
				{
				setState(511);
				widget();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(514);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Text_fieldContext extends ParserRuleContext {
		public TerminalNode TEXT_FIELD() { return getToken(parserD.TEXT_FIELD, 0); }
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public TerminalNode CONTROLLER() { return getToken(parserD.CONTROLLER, 0); }
		public List<TerminalNode> COLON() { return getTokens(parserD.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserD.COLON, i);
		}
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public TerminalNode DECORATION() { return getToken(parserD.DECORATION, 0); }
		public TerminalNode INPUT_DECORATION() { return getToken(parserD.INPUT_DECORATION, 0); }
		public HintTextContext hintText() {
			return getRuleContext(HintTextContext.class,0);
		}
		public BorderContext border() {
			return getRuleContext(BorderContext.class,0);
		}
		public EnableBorderContext enableBorder() {
			return getRuleContext(EnableBorderContext.class,0);
		}
		public FilledContext filled() {
			return getRuleContext(FilledContext.class,0);
		}
		public FillColorContext fillColor() {
			return getRuleContext(FillColorContext.class,0);
		}
		public FocusColorContext focusColor() {
			return getRuleContext(FocusColorContext.class,0);
		}
		public HoverColorContext hoverColor() {
			return getRuleContext(HoverColorContext.class,0);
		}
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public TerminalNode MAXLINE() { return getToken(parserD.MAXLINE, 0); }
		public TerminalNode NULL_() { return getToken(parserD.NULL_, 0); }
		public SizeboxContext sizebox() {
			return getRuleContext(SizeboxContext.class,0);
		}
		public Text_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterText_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitText_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitText_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_fieldContext text_field() throws RecognitionException {
		Text_fieldContext _localctx = new Text_fieldContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_text_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(TEXT_FIELD);
			setState(517);
			match(OP);
			setState(518);
			match(CONTROLLER);
			setState(519);
			match(COLON);
			setState(520);
			match(NAME);
			setState(521);
			match(COMMA);
			setState(522);
			match(DECORATION);
			setState(523);
			match(COLON);
			setState(524);
			match(INPUT_DECORATION);
			setState(525);
			match(OP);
			setState(526);
			hintText();
			setState(527);
			border();
			setState(528);
			enableBorder();
			setState(529);
			filled();
			setState(530);
			fillColor();
			setState(531);
			focusColor();
			setState(532);
			hoverColor();
			setState(533);
			match(CP);
			setState(534);
			match(COMMA);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAXLINE) {
				{
				setState(535);
				match(MAXLINE);
				setState(536);
				match(COLON);
				setState(537);
				match(NULL_);
				setState(538);
				match(COMMA);
				}
			}

			setState(541);
			match(CP);
			setState(542);
			match(COMMA);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIZEBOX) {
				{
				setState(543);
				sizebox();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HintTextContext extends ParserRuleContext {
		public TerminalNode HINTTEXT() { return getToken(parserD.HINTTEXT, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public HintTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterHintText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitHintText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitHintText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintTextContext hintText() throws RecognitionException {
		HintTextContext _localctx = new HintTextContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_hintText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(HINTTEXT);
			setState(547);
			match(COLON);
			setState(548);
			string();
			setState(549);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderContext extends ParserRuleContext {
		public TerminalNode BORDER() { return getToken(parserD.BORDER, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode OUTLINEBORDER() { return getToken(parserD.OUTLINEBORDER, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public BorderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterBorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitBorder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitBorder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderContext border() throws RecognitionException {
		BorderContext _localctx = new BorderContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_border);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(BORDER);
			setState(552);
			match(COLON);
			setState(553);
			match(OUTLINEBORDER);
			setState(554);
			match(OP);
			setState(555);
			match(CP);
			setState(556);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnableBorderContext extends ParserRuleContext {
		public TerminalNode ENABLE_BORDER() { return getToken(parserD.ENABLE_BORDER, 0); }
		public List<TerminalNode> COLON() { return getTokens(parserD.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserD.COLON, i);
		}
		public TerminalNode OUTLINEBORDER() { return getToken(parserD.OUTLINEBORDER, 0); }
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public TerminalNode BORDER_SIDE() { return getToken(parserD.BORDER_SIDE, 0); }
		public TerminalNode BORDERSIDE() { return getToken(parserD.BORDERSIDE, 0); }
		public TerminalNode COLOR_STYLE() { return getToken(parserD.COLOR_STYLE, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public EnableBorderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enableBorder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterEnableBorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitEnableBorder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitEnableBorder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnableBorderContext enableBorder() throws RecognitionException {
		EnableBorderContext _localctx = new EnableBorderContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_enableBorder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(ENABLE_BORDER);
			setState(559);
			match(COLON);
			setState(560);
			match(OUTLINEBORDER);
			setState(561);
			match(OP);
			setState(562);
			match(BORDER_SIDE);
			setState(563);
			match(COLON);
			setState(564);
			match(BORDERSIDE);
			setState(565);
			match(OP);
			setState(566);
			match(COLOR_STYLE);
			setState(567);
			match(COLON);
			setState(568);
			rgb();
			setState(569);
			match(CP);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(570);
				match(COMMA);
				}
			}

			setState(573);
			match(CP);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(574);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilledContext extends ParserRuleContext {
		public TerminalNode FILLED() { return getToken(parserD.FILLED, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode TRUE() { return getToken(parserD.TRUE, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public FilledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filled; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterFilled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitFilled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitFilled(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilledContext filled() throws RecognitionException {
		FilledContext _localctx = new FilledContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_filled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(FILLED);
			setState(578);
			match(COLON);
			setState(579);
			match(TRUE);
			setState(580);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FillColorContext extends ParserRuleContext {
		public TerminalNode FILLCOLOR() { return getToken(parserD.FILLCOLOR, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public FillColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fillColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterFillColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitFillColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitFillColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillColorContext fillColor() throws RecognitionException {
		FillColorContext _localctx = new FillColorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fillColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(FILLCOLOR);
			setState(583);
			match(COLON);
			setState(584);
			rgb();
			setState(585);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FocusColorContext extends ParserRuleContext {
		public TerminalNode FOCUSCOLOR() { return getToken(parserD.FOCUSCOLOR, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public FocusColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_focusColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterFocusColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitFocusColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitFocusColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FocusColorContext focusColor() throws RecognitionException {
		FocusColorContext _localctx = new FocusColorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_focusColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(FOCUSCOLOR);
			setState(588);
			match(COLON);
			setState(589);
			rgb();
			setState(590);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HoverColorContext extends ParserRuleContext {
		public TerminalNode HOVERCOLOR() { return getToken(parserD.HOVERCOLOR, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public RgbContext rgb() {
			return getRuleContext(RgbContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public HoverColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hoverColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterHoverColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitHoverColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitHoverColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoverColorContext hoverColor() throws RecognitionException {
		HoverColorContext _localctx = new HoverColorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hoverColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(HOVERCOLOR);
			setState(593);
			match(COLON);
			setState(594);
			rgb();
			setState(595);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Contain_constrantContext extends ParserRuleContext {
		public TerminalNode CONSTRAIN_BOX() { return getToken(parserD.CONSTRAIN_BOX, 0); }
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public TerminalNode CONSTRAINT() { return getToken(parserD.CONSTRAINT, 0); }
		public List<TerminalNode> COLON() { return getTokens(parserD.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserD.COLON, i);
		}
		public TerminalNode BOX_CONSTRAINT() { return getToken(parserD.BOX_CONSTRAINT, 0); }
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public TerminalNode CHILD() { return getToken(parserD.CHILD, 0); }
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(parserD.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(parserD.NUMBER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(parserD.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(parserD.DOT, i);
		}
		public Contain_constrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contain_constrant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterContain_constrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitContain_constrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitContain_constrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contain_constrantContext contain_constrant() throws RecognitionException {
		Contain_constrantContext _localctx = new Contain_constrantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_contain_constrant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(CONSTRAIN_BOX);
			setState(598);
			match(OP);
			setState(599);
			match(CONSTRAINT);
			setState(600);
			match(COLON);
			setState(601);
			match(BOX_CONSTRAINT);
			setState(602);
			match(OP);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(603);
				match(NAME);
				setState(604);
				match(COLON);
				setState(609);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(605);
					match(NUMBER);
					}
					break;
				case NAME:
					{
					setState(606);
					match(NAME);
					setState(607);
					match(DOT);
					setState(608);
					match(NAME);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(611);
				match(COMMA);
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			match(CP);
			setState(618);
			match(COMMA);
			setState(619);
			match(CHILD);
			setState(620);
			match(COLON);
			setState(621);
			widget();
			setState(622);
			match(CP);
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(623);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ButtonContext extends ParserRuleContext {
		public TerminalNode ELEVATED_BUTTON() { return getToken(parserD.ELEVATED_BUTTON, 0); }
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public TerminalNode ONPRESS() { return getToken(parserD.ONPRESS, 0); }
		public List<TerminalNode> COLON() { return getTokens(parserD.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserD.COLON, i);
		}
		public TerminalNode CHILD() { return getToken(parserD.CHILD, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public TerminalNode EG() { return getToken(parserD.EG, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_button);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(ELEVATED_BUTTON);
			setState(627);
			match(OP);
			setState(628);
			match(ONPRESS);
			setState(629);
			match(COLON);
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				{
				setState(630);
				match(OP);
				setState(631);
				match(CP);
				setState(632);
				match(EG);
				setState(633);
				call_function();
				}
				break;
			case NAME:
				{
				setState(634);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(637);
				match(COMMA);
				}
			}

			setState(640);
			match(CHILD);
			setState(641);
			match(COLON);
			setState(642);
			text();
			setState(643);
			match(CP);
			setState(644);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public List<Array_variabelsContext> array_variabels() {
			return getRuleContexts(Array_variabelsContext.class);
		}
		public Array_variabelsContext array_variabels(int i) {
			return getRuleContext(Array_variabelsContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(646);
					array_variabels();
					}
					} 
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_variabelsContext extends ParserRuleContext {
		public ValueVariablesContext valueVariables() {
			return getRuleContext(ValueVariablesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public Array_variabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_variabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterArray_variabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitArray_variabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitArray_variabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_variabelsContext array_variabels() throws RecognitionException {
		Array_variabelsContext _localctx = new Array_variabelsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_array_variabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			valueVariables();
			setState(653);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueVariablesContext extends ParserRuleContext {
		public ValueNumberContext valueNumber() {
			return getRuleContext(ValueNumberContext.class,0);
		}
		public ValueBooleanContext valueBoolean() {
			return getRuleContext(ValueBooleanContext.class,0);
		}
		public ValueSTRINGContext valueSTRING() {
			return getRuleContext(ValueSTRINGContext.class,0);
		}
		public VariableDotContext variableDot() {
			return getRuleContext(VariableDotContext.class,0);
		}
		public Definition_NmberContext definition_Nmber() {
			return getRuleContext(Definition_NmberContext.class,0);
		}
		public Definition_BooleanContext definition_Boolean() {
			return getRuleContext(Definition_BooleanContext.class,0);
		}
		public Definition_DOT_StringContext definition_DOT_String() {
			return getRuleContext(Definition_DOT_StringContext.class,0);
		}
		public Definition_StringContext definition_String() {
			return getRuleContext(Definition_StringContext.class,0);
		}
		public ValueVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterValueVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitValueVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitValueVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueVariablesContext valueVariables() throws RecognitionException {
		ValueVariablesContext _localctx = new ValueVariablesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_valueVariables);
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				valueNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				valueBoolean();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(657);
				valueSTRING();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(658);
				variableDot();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(659);
				definition_Nmber();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(660);
				definition_Boolean();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(661);
				definition_DOT_String();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(662);
				definition_String();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueNumberContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(parserD.NUMBER, 0); }
		public ValueNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterValueNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitValueNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitValueNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueNumberContext valueNumber() throws RecognitionException {
		ValueNumberContext _localctx = new ValueNumberContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_valueNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(NAME);
			setState(666);
			match(ASSIGN);
			setState(667);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueBooleanContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterValueBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitValueBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitValueBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueBooleanContext valueBoolean() throws RecognitionException {
		ValueBooleanContext _localctx = new ValueBooleanContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_valueBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(NAME);
			setState(670);
			match(ASSIGN);
			setState(671);
			bool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueSTRINGContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public ValueSTRINGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSTRING; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterValueSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitValueSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitValueSTRING(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueSTRINGContext valueSTRING() throws RecognitionException {
		ValueSTRINGContext _localctx = new ValueSTRINGContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_valueSTRING);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(NAME);
			setState(674);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(675);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDotContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public VariableDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterVariableDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitVariableDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitVariableDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDotContext variableDot() throws RecognitionException {
		VariableDotContext _localctx = new VariableDotContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(NAME);
			setState(678);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(679);
			match(NAME);
			setState(680);
			match(DOT);
			setState(681);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Definition_NmberContext extends ParserRuleContext {
		public TerminalNode TYPE_DEFINITION() { return getToken(parserD.TYPE_DEFINITION, 0); }
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(parserD.NUMBER, 0); }
		public Definition_NmberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_Nmber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterDefinition_Nmber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitDefinition_Nmber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitDefinition_Nmber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_NmberContext definition_Nmber() throws RecognitionException {
		Definition_NmberContext _localctx = new Definition_NmberContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_definition_Nmber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(TYPE_DEFINITION);
			setState(684);
			match(NAME);
			setState(685);
			match(ASSIGN);
			setState(686);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Definition_BooleanContext extends ParserRuleContext {
		public TerminalNode TYPE_DEFINITION() { return getToken(parserD.TYPE_DEFINITION, 0); }
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Definition_BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_Boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterDefinition_Boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitDefinition_Boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitDefinition_Boolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_BooleanContext definition_Boolean() throws RecognitionException {
		Definition_BooleanContext _localctx = new Definition_BooleanContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_definition_Boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(TYPE_DEFINITION);
			setState(689);
			match(NAME);
			setState(690);
			match(ASSIGN);
			setState(691);
			bool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Definition_StringContext extends ParserRuleContext {
		public TerminalNode TYPE_DEFINITION() { return getToken(parserD.TYPE_DEFINITION, 0); }
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public Definition_StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_String; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterDefinition_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitDefinition_String(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitDefinition_String(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_StringContext definition_String() throws RecognitionException {
		Definition_StringContext _localctx = new Definition_StringContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_definition_String);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(TYPE_DEFINITION);
			setState(694);
			match(NAME);
			setState(695);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(696);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Definition_DOT_StringContext extends ParserRuleContext {
		public TerminalNode TYPE_DEFINITION() { return getToken(parserD.TYPE_DEFINITION, 0); }
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode DOT_TEXT() { return getToken(parserD.DOT_TEXT, 0); }
		public Definition_DOT_StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_DOT_String; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterDefinition_DOT_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitDefinition_DOT_String(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitDefinition_DOT_String(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_DOT_StringContext definition_DOT_String() throws RecognitionException {
		Definition_DOT_StringContext _localctx = new Definition_DOT_StringContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_definition_DOT_String);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(TYPE_DEFINITION);
			setState(699);
			match(NAME);
			setState(700);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(701);
			match(NAME);
			setState(702);
			match(DOT);
			setState(703);
			_la = _input.LA(1);
			if ( !(_la==DOT_TEXT || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(parserD.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(parserD.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TypeMapContext typeMap() {
			return getRuleContext(TypeMapContext.class,0);
		}
		public Assign_List_to_variableContext assign_List_to_variable() {
			return getRuleContext(Assign_List_to_variableContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_list);
		try {
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				typeMap();
				}
				break;
			case TYPE_DEFINITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				assign_List_to_variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeMapContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(parserD.LIST, 0); }
		public List<TerminalNode> LT() { return getTokens(parserD.LT); }
		public TerminalNode LT(int i) {
			return getToken(parserD.LT, i);
		}
		public TerminalNode MAP() { return getToken(parserD.MAP, 0); }
		public List<TerminalNode> TYPE_DEFINITION() { return getTokens(parserD.TYPE_DEFINITION); }
		public TerminalNode TYPE_DEFINITION(int i) {
			return getToken(parserD.TYPE_DEFINITION, i);
		}
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public List<TerminalNode> GT() { return getTokens(parserD.GT); }
		public TerminalNode GT(int i) {
			return getToken(parserD.GT, i);
		}
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode OB() { return getToken(parserD.OB, 0); }
		public TerminalNode CB() { return getToken(parserD.CB, 0); }
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public TypeMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterTypeMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitTypeMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitTypeMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeMapContext typeMap() throws RecognitionException {
		TypeMapContext _localctx = new TypeMapContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(LIST);
			setState(712);
			match(LT);
			setState(713);
			match(MAP);
			setState(714);
			match(LT);
			setState(715);
			match(TYPE_DEFINITION);
			setState(716);
			match(COMMA);
			setState(717);
			match(TYPE_DEFINITION);
			setState(718);
			match(GT);
			setState(719);
			match(GT);
			setState(720);
			match(NAME);
			setState(721);
			match(ASSIGN);
			setState(722);
			match(OB);
			setState(723);
			match(CB);
			setState(724);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode OB() { return getToken(parserD.OB, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CB() { return getToken(parserD.CB, 0); }
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_valueList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(NAME);
			setState(727);
			match(OB);
			setState(728);
			string();
			setState(729);
			match(CB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_List_to_variableContext extends ParserRuleContext {
		public TerminalNode TYPE_DEFINITION() { return getToken(parserD.TYPE_DEFINITION, 0); }
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public TerminalNode ASSIGN() { return getToken(parserD.ASSIGN, 0); }
		public TerminalNode OB() { return getToken(parserD.OB, 0); }
		public TerminalNode CB() { return getToken(parserD.CB, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(parserD.INDEX, 0); }
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public Assign_List_to_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_List_to_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterAssign_List_to_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitAssign_List_to_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitAssign_List_to_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_List_to_variableContext assign_List_to_variable() throws RecognitionException {
		Assign_List_to_variableContext _localctx = new Assign_List_to_variableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_assign_List_to_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(TYPE_DEFINITION);
			setState(732);
			match(NAME);
			setState(733);
			match(ASSIGN);
			setState(734);
			match(NAME);
			setState(735);
			match(OB);
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEQUOTATION:
				{
				setState(736);
				string();
				}
				break;
			case INDEX:
				{
				setState(737);
				match(INDEX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(740);
			match(CB);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(741);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Add_to_listContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Add_to_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_to_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterAdd_to_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitAdd_to_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitAdd_to_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_to_listContext add_to_list() throws RecognitionException {
		Add_to_listContext _localctx = new Add_to_listContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_add_to_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(NAME);
			setState(745);
			match(DOT);
			setState(746);
			call_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetStateContext extends ParserRuleContext {
		public TerminalNode SET_STATE() { return getToken(parserD.SET_STATE, 0); }
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public TerminalNode OBC() { return getToken(parserD.OBC, 0); }
		public TerminalNode CBC() { return getToken(parserD.CBC, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(parserD.SEMI, 0); }
		public BodySetStateContext bodySetState() {
			return getRuleContext(BodySetStateContext.class,0);
		}
		public SetStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterSetState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitSetState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitSetState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStateContext setState() throws RecognitionException {
		SetStateContext _localctx = new SetStateContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_setState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(SET_STATE);
			setState(749);
			match(OP);
			setState(750);
			match(OP);
			setState(751);
			match(CP);
			setState(752);
			match(OBC);
			{
			setState(753);
			bodySetState();
			}
			setState(754);
			match(CBC);
			setState(755);
			match(CP);
			setState(756);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodySetStateContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(parserD.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(parserD.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(parserD.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(parserD.DOT, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(parserD.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(parserD.SEMI, i);
		}
		public List<TerminalNode> CLEAR() { return getTokens(parserD.CLEAR); }
		public TerminalNode CLEAR(int i) {
			return getToken(parserD.CLEAR, i);
		}
		public List<TerminalNode> OP() { return getTokens(parserD.OP); }
		public TerminalNode OP(int i) {
			return getToken(parserD.OP, i);
		}
		public List<TerminalNode> CP() { return getTokens(parserD.CP); }
		public TerminalNode CP(int i) {
			return getToken(parserD.CP, i);
		}
		public List<TerminalNode> REMOVE_AT() { return getTokens(parserD.REMOVE_AT); }
		public TerminalNode REMOVE_AT(int i) {
			return getToken(parserD.REMOVE_AT, i);
		}
		public BodySetStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodySetState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterBodySetState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitBodySetState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitBodySetState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodySetStateContext bodySetState() throws RecognitionException {
		BodySetStateContext _localctx = new BodySetStateContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_bodySetState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			variables();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(759);
				match(NAME);
				setState(760);
				match(DOT);
				setState(768);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLEAR:
					{
					setState(761);
					match(CLEAR);
					setState(762);
					match(OP);
					setState(763);
					match(CP);
					}
					break;
				case REMOVE_AT:
					{
					setState(764);
					match(REMOVE_AT);
					setState(765);
					match(OP);
					setState(766);
					match(NAME);
					setState(767);
					match(CP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(770);
				match(SEMI);
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossAxisContext extends ParserRuleContext {
		public TerminalNode CROSSAXIS() { return getToken(parserD.CROSSAXIS, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode CROSSAXISaLIGNMENT() { return getToken(parserD.CROSSAXISaLIGNMENT, 0); }
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public TerminalNode SPACE_AROUND() { return getToken(parserD.SPACE_AROUND, 0); }
		public TerminalNode CENTER() { return getToken(parserD.CENTER, 0); }
		public TerminalNode SPACE_EVENLY() { return getToken(parserD.SPACE_EVENLY, 0); }
		public TerminalNode START() { return getToken(parserD.START, 0); }
		public CrossAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossAxis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterCrossAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitCrossAxis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitCrossAxis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossAxisContext crossAxis() throws RecognitionException {
		CrossAxisContext _localctx = new CrossAxisContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_crossAxis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(CROSSAXIS);
			setState(777);
			match(COLON);
			setState(778);
			match(CROSSAXISaLIGNMENT);
			setState(779);
			match(DOT);
			setState(780);
			_la = _input.LA(1);
			if ( !((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 7516192769L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(781);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainAxisContext extends ParserRuleContext {
		public TerminalNode MAINAXIS() { return getToken(parserD.MAINAXIS, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode MAINAXISALIGNMENT() { return getToken(parserD.MAINAXISALIGNMENT, 0); }
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public TerminalNode SPACE_AROUND() { return getToken(parserD.SPACE_AROUND, 0); }
		public TerminalNode CENTER() { return getToken(parserD.CENTER, 0); }
		public TerminalNode SPACE_EVENLY() { return getToken(parserD.SPACE_EVENLY, 0); }
		public TerminalNode START() { return getToken(parserD.START, 0); }
		public MainAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainAxis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterMainAxis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitMainAxis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitMainAxis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainAxisContext mainAxis() throws RecognitionException {
		MainAxisContext _localctx = new MainAxisContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mainAxis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(MAINAXIS);
			setState(784);
			match(COLON);
			setState(785);
			match(MAINAXISALIGNMENT);
			setState(786);
			match(DOT);
			setState(787);
			_la = _input.LA(1);
			if ( !((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 7516192769L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(788);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SizeboxContext extends ParserRuleContext {
		public TerminalNode SIZEBOX() { return getToken(parserD.SIZEBOX, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode HEIGHT() { return getToken(parserD.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(parserD.NUMBER, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public SizeboxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizebox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterSizebox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitSizebox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitSizebox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeboxContext sizebox() throws RecognitionException {
		SizeboxContext _localctx = new SizeboxContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sizebox);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(SIZEBOX);
			setState(791);
			match(OP);
			setState(792);
			match(HEIGHT);
			setState(793);
			match(COLON);
			setState(794);
			match(NUMBER);
			setState(795);
			match(CP);
			setState(796);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Clip_behavoirContext extends ParserRuleContext {
		public TerminalNode CLIP_BEHAVOIR() { return getToken(parserD.CLIP_BEHAVOIR, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode CLIP() { return getToken(parserD.CLIP, 0); }
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public TerminalNode NONE() { return getToken(parserD.NONE, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public Clip_behavoirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clip_behavoir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterClip_behavoir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitClip_behavoir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitClip_behavoir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clip_behavoirContext clip_behavoir() throws RecognitionException {
		Clip_behavoirContext _localctx = new Clip_behavoirContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_clip_behavoir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(CLIP_BEHAVOIR);
			setState(799);
			match(COLON);
			setState(800);
			match(CLIP);
			setState(801);
			match(DOT);
			setState(802);
			match(NONE);
			setState(803);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(parserD.TEXT, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public Type_text1Context type_text1() {
			return getRuleContext(Type_text1Context.class,0);
		}
		public Condition_in_textContext condition_in_text() {
			return getRuleContext(Condition_in_textContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(TEXT);
			setState(806);
			match(OP);
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEQUOTATION:
				{
				setState(807);
				type_text1();
				}
				break;
			case NAME:
				{
				setState(808);
				condition_in_text();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(811);
			match(CP);
			setState(812);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_in_textContext extends ParserRuleContext {
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public List<TerminalNode> QU() { return getTokens(parserD.QU); }
		public TerminalNode QU(int i) {
			return getToken(parserD.QU, i);
		}
		public List<TerminalNode> DOUBLEQUOTATION() { return getTokens(parserD.DOUBLEQUOTATION); }
		public TerminalNode DOUBLEQUOTATION(int i) {
			return getToken(parserD.DOUBLEQUOTATION, i);
		}
		public Condition_in_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_in_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterCondition_in_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitCondition_in_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitCondition_in_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_in_textContext condition_in_text() throws RecognitionException {
		Condition_in_textContext _localctx = new Condition_in_textContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_condition_in_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			valueList();
			setState(815);
			match(QU);
			setState(816);
			match(QU);
			setState(817);
			match(DOUBLEQUOTATION);
			setState(818);
			match(DOUBLEQUOTATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_text1Context extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public TerminalNode STYLE() { return getToken(parserD.STYLE, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode TEXTSTYLE() { return getToken(parserD.TEXTSTYLE, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public FontSizeContext fontSize() {
			return getRuleContext(FontSizeContext.class,0);
		}
		public FontWeightContext fontWeight() {
			return getRuleContext(FontWeightContext.class,0);
		}
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public Type_text1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_text1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterType_text1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitType_text1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitType_text1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_text1Context type_text1() throws RecognitionException {
		Type_text1Context _localctx = new Type_text1Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_type_text1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			string();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(821);
				match(COMMA);
				}
			}

			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLE) {
				{
				setState(824);
				match(STYLE);
				setState(825);
				match(COLON);
				setState(826);
				match(TEXTSTYLE);
				setState(827);
				match(OP);
				setState(828);
				fontSize();
				setState(829);
				fontWeight();
				setState(830);
				match(CP);
				setState(831);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontSizeContext extends ParserRuleContext {
		public TerminalNode FONT_SIZE() { return getToken(parserD.FONT_SIZE, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(parserD.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public FontSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterFontSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitFontSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitFontSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontSizeContext fontSize() throws RecognitionException {
		FontSizeContext _localctx = new FontSizeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_fontSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(FONT_SIZE);
			setState(836);
			match(COLON);
			setState(837);
			match(NUMBER);
			setState(838);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontWeightContext extends ParserRuleContext {
		public TerminalNode FONT_WEIGHT() { return getToken(parserD.FONT_WEIGHT, 0); }
		public TerminalNode COLON() { return getToken(parserD.COLON, 0); }
		public TerminalNode FONTWEIGHT() { return getToken(parserD.FONTWEIGHT, 0); }
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public TerminalNode BOLD() { return getToken(parserD.BOLD, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public FontWeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontWeight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterFontWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitFontWeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitFontWeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontWeightContext fontWeight() throws RecognitionException {
		FontWeightContext _localctx = new FontWeightContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_fontWeight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(FONT_WEIGHT);
			setState(841);
			match(COLON);
			setState(842);
			match(FONTWEIGHT);
			setState(843);
			match(DOT);
			setState(844);
			match(BOLD);
			setState(845);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Padding_StyleContext extends ParserRuleContext {
		public TerminalNode PADDING_style() { return getToken(parserD.PADDING_style, 0); }
		public List<TerminalNode> COLON() { return getTokens(parserD.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserD.COLON, i);
		}
		public TerminalNode EDGEINSETES() { return getToken(parserD.EDGEINSETES, 0); }
		public TerminalNode DOT() { return getToken(parserD.DOT, 0); }
		public TerminalNode NUMBER() { return getToken(parserD.NUMBER, 0); }
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public TerminalNode COMMA() { return getToken(parserD.COMMA, 0); }
		public TerminalNode ONLY() { return getToken(parserD.ONLY, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public TerminalNode ALL() { return getToken(parserD.ALL, 0); }
		public TerminalNode TOP() { return getToken(parserD.TOP, 0); }
		public TerminalNode BOTTON() { return getToken(parserD.BOTTON, 0); }
		public Padding_StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding_Style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterPadding_Style(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitPadding_Style(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitPadding_Style(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Padding_StyleContext padding_Style() throws RecognitionException {
		Padding_StyleContext _localctx = new Padding_StyleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_padding_Style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(PADDING_style);
			setState(848);
			match(COLON);
			setState(849);
			match(EDGEINSETES);
			setState(850);
			match(DOT);
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONLY:
				{
				setState(851);
				match(ONLY);
				setState(852);
				match(OP);
				{
				setState(853);
				_la = _input.LA(1);
				if ( !(_la==TOP || _la==BOTTON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(854);
				match(COLON);
				}
				}
				break;
			case ALL:
				{
				setState(855);
				match(ALL);
				setState(856);
				match(OP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(859);
			match(NUMBER);
			setState(860);
			match(CP);
			setState(861);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RgbContext extends ParserRuleContext {
		public TerminalNode RGB() { return getToken(parserD.RGB, 0); }
		public TerminalNode OP() { return getToken(parserD.OP, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(parserD.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(parserD.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserD.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserD.COMMA, i);
		}
		public TerminalNode CP() { return getToken(parserD.CP, 0); }
		public RgbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterRgb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitRgb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitRgb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RgbContext rgb() throws RecognitionException {
		RgbContext _localctx = new RgbContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_rgb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(RGB);
			setState(864);
			match(OP);
			setState(865);
			match(NUMBER);
			setState(866);
			match(COMMA);
			setState(867);
			match(NUMBER);
			setState(868);
			match(COMMA);
			setState(869);
			match(NUMBER);
			setState(870);
			match(COMMA);
			setState(871);
			match(NUMBER);
			setState(872);
			match(CP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> SINGLEQUOTATION() { return getTokens(parserD.SINGLEQUOTATION); }
		public TerminalNode SINGLEQUOTATION(int i) {
			return getToken(parserD.SINGLEQUOTATION, i);
		}
		public TerminalNode NAME() { return getToken(parserD.NAME, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserDListener ) ((parserDListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserDVisitor ) return ((parserDVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(SINGLEQUOTATION);
			setState(875);
			match(NAME);
			setState(876);
			match(SINGLEQUOTATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00ce\u036f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u00a2\b\u0000\n\u0000\f\u0000\u00a5\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00bb\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00bf\b\u0005\n\u0005\f\u0005\u00c2\t\u0005\u0001\u0006\u0003\u0006\u00c5"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00cb"+
		"\b\u0006\u000b\u0006\f\u0006\u00cc\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00e2\b\t\u0001\n\u0003\n\u00e5\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u00ea\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u010b\b\u000b\u0001\u000b\u0003\u000b"+
		"\u010e\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u011f\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0127\b\u000e\n\u000e\f\u000e\u012a\t\u000e"+
		"\u0001\u000e\u0003\u000e\u012d\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0135\b\u000f\n\u000f"+
		"\f\u000f\u0138\t\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u013c\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0145\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0005\u0013\u0152\b\u0013\n\u0013\f\u0013\u0155"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0159\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0166\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0172\b\u0017"+
		"\u0001\u0017\u0003\u0017\u0175\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u017a\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0181\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0189\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0190\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0198\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01b9\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d\u01d8\b\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01e0\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u01f1\b\u001e\n\u001e\f\u001e\u01f4\t\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01fb\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0201\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u021c\b \u0001 \u0001 \u0001 \u0003"+
		" \u0221\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u023c\b#\u0001"+
		"#\u0001#\u0003#\u0240\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0262\b(\u0001(\u0005(\u0265"+
		"\b(\n(\f(\u0268\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0271\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u027c\b)\u0001)\u0003)\u027f\b)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0005*\u0288\b*\n*\f*\u028b\t*\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u0298\b,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"5\u00015\u00016\u00016\u00036\u02c6\b6\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00039\u02e3\b9\u00019\u00019\u00039\u02e7\b9\u0001:\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u0301\b<\u0001<\u0005<\u0304\b<\n<\f<\u0307\t<"+
		"\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u032a\bA\u0001A\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0003C\u0337\bC\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u0342\bC\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0003F\u035a\bF\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0000\u0000I\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0000\b\u0002\u0000kk\u00cd\u00cd\u0002\u0000\u0004\u0004"+
		"  \u0003\u0000hhjj\u00c5\u00c5\u0002\u0000\u000b\u000b\u000f\u000f\u0002"+
		"\u0000GG\u00cd\u00cd\u0002\u0000\u0087\u0087\u00a6\u00a6\u0002\u00006"+
		"6TV\u0001\u0000WX\u0373\u0000\u00a3\u0001\u0000\u0000\u0000\u0002\u00a6"+
		"\u0001\u0000\u0000\u0000\u0004\u00a8\u0001\u0000\u0000\u0000\u0006\u00b0"+
		"\u0001\u0000\u0000\u0000\b\u00ba\u0001\u0000\u0000\u0000\n\u00c0\u0001"+
		"\u0000\u0000\u0000\f\u00ca\u0001\u0000\u0000\u0000\u000e\u00ce\u0001\u0000"+
		"\u0000\u0000\u0010\u00d9\u0001\u0000\u0000\u0000\u0012\u00e1\u0001\u0000"+
		"\u0000\u0000\u0014\u00e4\u0001\u0000\u0000\u0000\u0016\u00f0\u0001\u0000"+
		"\u0000\u0000\u0018\u0112\u0001\u0000\u0000\u0000\u001a\u011a\u0001\u0000"+
		"\u0000\u0000\u001c\u0120\u0001\u0000\u0000\u0000\u001e\u012e\u0001\u0000"+
		"\u0000\u0000 \u0140\u0001\u0000\u0000\u0000\"\u0146\u0001\u0000\u0000"+
		"\u0000$\u0148\u0001\u0000\u0000\u0000&\u0153\u0001\u0000\u0000\u0000("+
		"\u0156\u0001\u0000\u0000\u0000*\u0165\u0001\u0000\u0000\u0000,\u0167\u0001"+
		"\u0000\u0000\u0000.\u016e\u0001\u0000\u0000\u00000\u017d\u0001\u0000\u0000"+
		"\u00002\u018c\u0001\u0000\u0000\u00004\u019b\u0001\u0000\u0000\u00006"+
		"\u01bf\u0001\u0000\u0000\u00008\u01c6\u0001\u0000\u0000\u0000:\u01d7\u0001"+
		"\u0000\u0000\u0000<\u01e1\u0001\u0000\u0000\u0000>\u01f7\u0001\u0000\u0000"+
		"\u0000@\u0204\u0001\u0000\u0000\u0000B\u0222\u0001\u0000\u0000\u0000D"+
		"\u0227\u0001\u0000\u0000\u0000F\u022e\u0001\u0000\u0000\u0000H\u0241\u0001"+
		"\u0000\u0000\u0000J\u0246\u0001\u0000\u0000\u0000L\u024b\u0001\u0000\u0000"+
		"\u0000N\u0250\u0001\u0000\u0000\u0000P\u0255\u0001\u0000\u0000\u0000R"+
		"\u0272\u0001\u0000\u0000\u0000T\u0289\u0001\u0000\u0000\u0000V\u028c\u0001"+
		"\u0000\u0000\u0000X\u0297\u0001\u0000\u0000\u0000Z\u0299\u0001\u0000\u0000"+
		"\u0000\\\u029d\u0001\u0000\u0000\u0000^\u02a1\u0001\u0000\u0000\u0000"+
		"`\u02a5\u0001\u0000\u0000\u0000b\u02ab\u0001\u0000\u0000\u0000d\u02b0"+
		"\u0001\u0000\u0000\u0000f\u02b5\u0001\u0000\u0000\u0000h\u02ba\u0001\u0000"+
		"\u0000\u0000j\u02c1\u0001\u0000\u0000\u0000l\u02c5\u0001\u0000\u0000\u0000"+
		"n\u02c7\u0001\u0000\u0000\u0000p\u02d6\u0001\u0000\u0000\u0000r\u02db"+
		"\u0001\u0000\u0000\u0000t\u02e8\u0001\u0000\u0000\u0000v\u02ec\u0001\u0000"+
		"\u0000\u0000x\u02f6\u0001\u0000\u0000\u0000z\u0308\u0001\u0000\u0000\u0000"+
		"|\u030f\u0001\u0000\u0000\u0000~\u0316\u0001\u0000\u0000\u0000\u0080\u031e"+
		"\u0001\u0000\u0000\u0000\u0082\u0325\u0001\u0000\u0000\u0000\u0084\u032e"+
		"\u0001\u0000\u0000\u0000\u0086\u0334\u0001\u0000\u0000\u0000\u0088\u0343"+
		"\u0001\u0000\u0000\u0000\u008a\u0348\u0001\u0000\u0000\u0000\u008c\u034f"+
		"\u0001\u0000\u0000\u0000\u008e\u035f\u0001\u0000\u0000\u0000\u0090\u036a"+
		"\u0001\u0000\u0000\u0000\u0092\u00a2\u0003\u0002\u0001\u0000\u0093\u0094"+
		"\u0005\u00a9\u0000\u0000\u0094\u0095\u0005\u00c9\u0000\u0000\u0095\u0096"+
		"\u0005\t\u0000\u0000\u0096\u0097\u0005\n\u0000\u0000\u0097\u0098\u0005"+
		"\u0007\u0000\u0000\u0098\u0099\u0005\u0001\u0000\u0000\u0099\u009a\u0005"+
		"\t\u0000\u0000\u009a\u009b\u0005{\u0000\u0000\u009b\u009c\u0005\u00cd"+
		"\u0000\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d\u009e\u0005\n\u0000"+
		"\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0\u0005 \u0000\u0000"+
		"\u00a0\u00a2\u0005\b\u0000\u0000\u00a1\u0092\u0001\u0000\u0000\u0000\u00a1"+
		"\u0093\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u0001\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0003\u0004\u0002\u0000\u00a7\u0003\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005%\u0000\u0000\u00a9\u00aa\u0005\u00cd\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0083\u0000\u0000\u00ab\u00ac\u0003\b\u0004\u0000\u00ac\u00ad\u0005"+
		"\u0007\u0000\u0000\u00ad\u00ae\u0003\n\u0005\u0000\u00ae\u00af\u0005\b"+
		"\u0000\u0000\u00af\u0005\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u000e"+
		"\u0007\u0000\u00b1\u00b2\u0005&\u0000\u0000\u00b2\u00b3\u0003\u0012\t"+
		"\u0000\u00b3\u0007\u0001\u0000\u0000\u0000\u00b4\u00bb\u0005\'\u0000\u0000"+
		"\u00b5\u00bb\u0005(\u0000\u0000\u00b6\u00b7\u0005]\u0000\u0000\u00b7\u00b8"+
		"\u0005\u0011\u0000\u0000\u00b8\u00b9\u0005\u00cd\u0000\u0000\u00b9\u00bb"+
		"\u0005\u0010\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b5"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00bb\t\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bf\u0003\u0006\u0003\u0000\u00bd\u00bf\u0003"+
		"\f\u0006\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u000b\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005&\u0000"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00cb\u0003\u0012\t\u0000"+
		"\u00c7\u00cb\u0003l6\u0000\u00c8\u00cb\u0003V+\u0000\u00c9\u00cb\u0003"+
		"$\u0012\u0000\u00ca\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\r\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005{\u0000\u0000\u00cf\u00d0\u0005\u00cd\u0000\u0000"+
		"\u00d0\u00d1\u0005\t\u0000\u0000\u00d1\u00d2\u0005\u0007\u0000\u0000\u00d2"+
		"\u00d3\u0005\u00a2\u0000\u0000\u00d3\u00d4\u0005\f\u0000\u0000\u00d4\u00d5"+
		"\u0005Z\u0000\u0000\u00d5\u00d6\u0005\b\u0000\u0000\u00d6\u00d7\u0005"+
		"\n\u0000\u0000\u00d7\u00d8\u0005 \u0000\u0000\u00d8\u000f\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005\u00cd\u0000\u0000\u00da\u00db\u0005\t\u0000"+
		"\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc\u00dd\u0005 \u0000\u0000"+
		"\u00dd\u0011\u0001\u0000\u0000\u0000\u00de\u00e2\u0003\u0014\n\u0000\u00df"+
		"\u00e2\u0003\u0016\u000b\u0000\u00e0\u00e2\u0003\u0018\f\u0000\u00e1\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u0013\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u0005\u00a9\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005\u00cd\u0000\u0000\u00e7\u00e9\u0005\t\u0000\u0000\u00e8\u00ea\u0003"+
		"\u001c\u000e\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"\n\u0000\u0000\u00ec\u00ed\u0005\u0007\u0000\u0000\u00ed\u00ee\u0003\u001a"+
		"\r\u0000\u00ee\u00ef\u0005\b\u0000\u0000\u00ef\u0015\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0005h\u0000\u0000\u00f1\u00f2\u0005m\u0000\u0000\u00f2"+
		"\u00f3\u0005\t\u0000\u0000\u00f3\u00f4\u0005j\u0000\u0000\u00f4\u00f5"+
		"\u0005k\u0000\u0000\u00f5\u00f6\u0005\n\u0000\u0000\u00f6\u00f7\u0005"+
		"\u0007\u0000\u0000\u00f7\u00f8\u0005\u009e\u0000\u0000\u00f8\u00f9\u0005"+
		"o\u0000\u0000\u00f9\u00fa\u0005\t\u0000\u0000\u00fa\u00fb\u0005p\u0000"+
		"\u0000\u00fb\u00fc\u0005\u000b\u0000\u0000\u00fc\u00fd\u0005\u0087\u0000"+
		"\u0000\u00fd\u00fe\u0005\u0004\u0000\u0000\u00fe\u00ff\u0003T*\u0000\u00ff"+
		"\u0100\u0005Y\u0000\u0000\u0100\u0101\u0005\u000b\u0000\u0000\u0101\u0102"+
		"\u0005\u00ac\u0000\u0000\u0102\u0103\u0005\t\u0000\u0000\u0103\u0104\u0005"+
		"/\u0000\u0000\u0104\u0105\u0005\u000b\u0000\u0000\u0105\u0106\u0003\u008e"+
		"G\u0000\u0106\u0107\u0005\u0004\u0000\u0000\u0107\u0108\u0005B\u0000\u0000"+
		"\u0108\u010d\u0005\u000b\u0000\u0000\u0109\u010b\u0003:\u001d\u0000\u010a"+
		"\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b"+
		"\u010e\u0001\u0000\u0000\u0000\u010c\u010e\u0003&\u0013\u0000\u010d\u010a"+
		"\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005\n\u0000\u0000\u0110\u0111\u0005"+
		" \u0000\u0000\u0111\u0017\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u00cd"+
		"\u0000\u0000\u0113\u0114\u0005\u00cd\u0000\u0000\u0114\u0115\u0005\t\u0000"+
		"\u0000\u0115\u0116\u0005\n\u0000\u0000\u0116\u0117\u0005\u0007\u0000\u0000"+
		"\u0117\u0118\u0003\u0010\b\u0000\u0118\u0119\u0005\b\u0000\u0000\u0119"+
		"\u0019\u0001\u0000\u0000\u0000\u011a\u011e\u0003T*\u0000\u011b\u011f\u0003"+
		"<\u001e\u0000\u011c\u011f\u0003v;\u0000\u011d\u011f\u0003\u0010\b\u0000"+
		"\u011e\u011b\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u001b\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0003\"\u0011\u0000\u0121\u0128\u0007\u0000\u0000\u0000\u0122"+
		"\u0123\u0005\u0004\u0000\u0000\u0123\u0124\u0003\"\u0011\u0000\u0124\u0125"+
		"\u0007\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0122"+
		"\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012c"+
		"\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012d"+
		"\u0005\u0004\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0001\u0000\u0000\u0000\u012d\u001d\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0005\u00cd\u0000\u0000\u012f\u013b\u0005\t\u0000\u0000\u0130\u013c\u0005"+
		"l\u0000\u0000\u0131\u013c\u0005k\u0000\u0000\u0132\u0136\u0005\u0007\u0000"+
		"\u0000\u0133\u0135\u0003 \u0010\u0000\u0134\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013c\u0005\b\u0000\u0000\u013a"+
		"\u013c\u0005\u00cd\u0000\u0000\u013b\u0130\u0001\u0000\u0000\u0000\u013b"+
		"\u0131\u0001\u0000\u0000\u0000\u013b\u0132\u0001\u0000\u0000\u0000\u013b"+
		"\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005\n\u0000\u0000\u013e\u013f"+
		"\u0007\u0001\u0000\u0000\u013f\u001f\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0003\u0090H\u0000\u0141\u0142\u0005\u000b\u0000\u0000\u0142\u0144\u0005"+
		"\u00cd\u0000\u0000\u0143\u0145\u0005\u0004\u0000\u0000\u0144\u0143\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145!\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0007\u0002\u0000\u0000\u0147#\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0005\u00bf\u0000\u0000\u0149\u014a\u0005\u00cd\u0000"+
		"\u0000\u014a\u014b\u0005\u000f\u0000\u0000\u014b\u014c\u0005\u00bf\u0000"+
		"\u0000\u014c\u014d\u0005\t\u0000\u0000\u014d\u014e\u0005\n\u0000\u0000"+
		"\u014e\u014f\u0005 \u0000\u0000\u014f%\u0001\u0000\u0000\u0000\u0150\u0152"+
		"\u0003(\u0014\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\'\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0156\u0158\u0003*\u0015\u0000\u0157\u0159\u0005\u0004\u0000"+
		"\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159)\u0001\u0000\u0000\u0000\u015a\u0166\u0003.\u0017\u0000\u015b"+
		"\u0166\u00030\u0018\u0000\u015c\u0166\u00032\u0019\u0000\u015d\u0166\u0003"+
		"@ \u0000\u015e\u0166\u0003>\u001f\u0000\u015f\u0166\u00034\u001a\u0000"+
		"\u0160\u0166\u0003R)\u0000\u0161\u0166\u00038\u001c\u0000\u0162\u0166"+
		"\u0003P(\u0000\u0163\u0166\u00036\u001b\u0000\u0164\u0166\u0003,\u0016"+
		"\u0000\u0165\u015a\u0001\u0000\u0000\u0000\u0165\u015b\u0001\u0000\u0000"+
		"\u0000\u0165\u015c\u0001\u0000\u0000\u0000\u0165\u015d\u0001\u0000\u0000"+
		"\u0000\u0165\u015e\u0001\u0000\u0000\u0000\u0165\u015f\u0001\u0000\u0000"+
		"\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0165\u0161\u0001\u0000\u0000"+
		"\u0000\u0165\u0162\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166+\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0005F\u0000\u0000\u0168\u0169\u0005\t\u0000\u0000\u0169"+
		"\u016a\u0005^\u0000\u0000\u016a\u016b\u0005\u000b\u0000\u0000\u016b\u016c"+
		"\u0003&\u0013\u0000\u016c\u016d\u0005\n\u0000\u0000\u016d-\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005i\u0000\u0000\u016f\u0179\u0005\t\u0000"+
		"\u0000\u0170\u0172\u0003\u0080@\u0000\u0171\u0170\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000"+
		"\u0173\u0175\u0003\u008cF\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0005^\u0000\u0000\u0177\u0178\u0005\u000b\u0000\u0000\u0178\u017a"+
		"\u0003&\u0013\u0000\u0179\u0171\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0005"+
		"\n\u0000\u0000\u017c/\u0001\u0000\u0000\u0000\u017d\u017e\u0005C\u0000"+
		"\u0000\u017e\u0180\u0005\t\u0000\u0000\u017f\u0181\u0003|>\u0000\u0180"+
		"\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0005_\u0000\u0000\u0183\u0184"+
		"\u0005\u000b\u0000\u0000\u0184\u0185\u0005\u0005\u0000\u0000\u0185\u0186"+
		"\u0003&\u0013\u0000\u0186\u0188\u0005\u0006\u0000\u0000\u0187\u0189\u0005"+
		"\u0004\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0005"+
		"\n\u0000\u0000\u018b1\u0001\u0000\u0000\u0000\u018c\u018d\u0005D\u0000"+
		"\u0000\u018d\u018f\u0005\t\u0000\u0000\u018e\u0190\u0003z=\u0000\u018f"+
		"\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0005_\u0000\u0000\u0192\u0193"+
		"\u0005\u000b\u0000\u0000\u0193\u0194\u0005\u0005\u0000\u0000\u0194\u0195"+
		"\u0003&\u0013\u0000\u0195\u0197\u0005\u0006\u0000\u0000\u0196\u0198\u0005"+
		"\u0004\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0005"+
		"\n\u0000\u0000\u019a3\u0001\u0000\u0000\u0000\u019b\u019c\u0005J\u0000"+
		"\u0000\u019c\u019d\u0005\f\u0000\u0000\u019d\u019e\u0005\u00b6\u0000\u0000"+
		"\u019e\u019f\u0005\t\u0000\u0000\u019f\u01a0\u0005b\u0000\u0000\u01a0"+
		"\u01a1\u0005\u000b\u0000\u0000\u01a1\u01a2\u0005\u00a6\u0000\u0000\u01a2"+
		"\u01a3\u0005\u0004\u0000\u0000\u01a3\u01a4\u0005c\u0000\u0000\u01a4\u01a5"+
		"\u0005\u000b\u0000\u0000\u01a5\u01a6\u0005d\u0000\u0000\u01a6\u01a7\u0005"+
		"\t\u0000\u0000\u01a7\u01a8\u0005\n\u0000\u0000\u01a8\u01a9\u0005\u0004"+
		"\u0000\u0000\u01a9\u01aa\u0005r\u0000\u0000\u01aa\u01ab\u0005\u000b\u0000"+
		"\u0000\u01ab\u01ac\u0005\u00cd\u0000\u0000\u01ac\u01ad\u0005\f\u0000\u0000"+
		"\u01ad\u01ae\u0005v\u0000\u0000\u01ae\u01af\u0005\u0004\u0000\u0000\u01af"+
		"\u01b0\u0005s\u0000\u0000\u01b0\u01b1\u0005\u000b\u0000\u0000\u01b1\u01b2"+
		"\u0005\t\u0000\u0000\u01b2\u01b3\u0005k\u0000\u0000\u01b3\u01b4\u0005"+
		"\u0004\u0000\u0000\u01b4\u01b5\u0005l\u0000\u0000\u01b5\u01b6\u0005\n"+
		"\u0000\u0000\u01b6\u01b8\u0005\u0007\u0000\u0000\u01b7\u01b9\u0003l6\u0000"+
		"\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u009e\u0000\u0000"+
		"\u01bb\u01bc\u0003&\u0013\u0000\u01bc\u01bd\u0005\b\u0000\u0000\u01bd"+
		"\u01be\u0005\n\u0000\u0000\u01be5\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0005N\u0000\u0000\u01c0\u01c1\u0005\t\u0000\u0000\u01c1\u01c2\u0005"+
		"^\u0000\u0000\u01c2\u01c3\u0005\u000b\u0000\u0000\u01c3\u01c4\u0003&\u0013"+
		"\u0000\u01c4\u01c5\u0005\n\u0000\u0000\u01c57\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0005K\u0000\u0000\u01c7\u01c8\u0005\t\u0000\u0000\u01c8"+
		"\u01c9\u0005L\u0000\u0000\u01c9\u01ca\u0005\u000b\u0000\u0000\u01ca\u01cb"+
		"\u0003\u0082A\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005"+
		"e\u0000\u0000\u01cd\u01ce\u0005\u000b\u0000\u0000\u01ce\u01cf\u0003\u0082"+
		"A\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005f\u0000\u0000"+
		"\u01d1\u01d2\u0005\u000b\u0000\u0000\u01d2\u01d3\u0003&\u0013\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\n\u0000\u0000\u01d59"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005\u0017\u0000\u0000\u01d7\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\u00cd\u0000\u0000\u01da\u01db"+
		"\u0005\u001f\u0000\u0000\u01db\u01dc\u0003&\u0013\u0000\u01dc\u01dd\u0005"+
		"\u000b\u0000\u0000\u01dd\u01df\u0003&\u0013\u0000\u01de\u01e0\u0005\u0004"+
		"\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0;\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\u008f\u0000"+
		"\u0000\u01e2\u01e3\u0005\t\u0000\u0000\u01e3\u01e4\u0005\u00cd\u0000\u0000"+
		"\u01e4\u01e5\u0005\f\u0000\u0000\u01e5\u01e6\u0005\u00c6\u0000\u0000\u01e6"+
		"\u01e7\u0005\u0003\u0000\u0000\u01e7\u01e8\u0005\u0003\u0000\u0000\u01e8"+
		"\u01e9\u0005\u00cd\u0000\u0000\u01e9\u01ea\u0005\f\u0000\u0000\u01ea\u01eb"+
		"\u0005\u00c6\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0005\n\u0000\u0000\u01ed\u01ee\u0005\u0007\u0000\u0000\u01ee\u01f2\u0003"+
		"t:\u0000\u01ef\u01f1\u0003\u001e\u000f\u0000\u01f0\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\b\u0000\u0000"+
		"\u01f6=\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005O\u0000\u0000\u01f8\u01fa"+
		"\u0005\t\u0000\u0000\u01f9\u01fb\u0003\u008cF\u0000\u01fa\u01f9\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0005^\u0000\u0000\u01fd\u0200\u0005\u000b"+
		"\u0000\u0000\u01fe\u0201\u0003\u0082A\u0000\u01ff\u0201\u0003&\u0013\u0000"+
		"\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000\u0000\u0000"+
		"\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0005\n\u0000\u0000\u0203"+
		"?\u0001\u0000\u0000\u0000\u0204\u0205\u0005E\u0000\u0000\u0205\u0206\u0005"+
		"\t\u0000\u0000\u0206\u0207\u00057\u0000\u0000\u0207\u0208\u0005\u000b"+
		"\u0000\u0000\u0208\u0209\u0005\u00cd\u0000\u0000\u0209\u020a\u0005\u0004"+
		"\u0000\u0000\u020a\u020b\u00058\u0000\u0000\u020b\u020c\u0005\u000b\u0000"+
		"\u0000\u020c\u020d\u00059\u0000\u0000\u020d\u020e\u0005\t\u0000\u0000"+
		"\u020e\u020f\u0003B!\u0000\u020f\u0210\u0003D\"\u0000\u0210\u0211\u0003"+
		"F#\u0000\u0211\u0212\u0003H$\u0000\u0212\u0213\u0003J%\u0000\u0213\u0214"+
		"\u0003L&\u0000\u0214\u0215\u0003N\'\u0000\u0215\u0216\u0005\n\u0000\u0000"+
		"\u0216\u021b\u0005\u0004\u0000\u0000\u0217\u0218\u0005.\u0000\u0000\u0218"+
		"\u0219\u0005\u000b\u0000\u0000\u0219\u021a\u0005\u0097\u0000\u0000\u021a"+
		"\u021c\u0005\u0004\u0000\u0000\u021b\u0217\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0005\n\u0000\u0000\u021e\u0220\u0005\u0004\u0000\u0000\u021f\u0221"+
		"\u0003~?\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000"+
		"\u0000\u0000\u0221A\u0001\u0000\u0000\u0000\u0222\u0223\u0005:\u0000\u0000"+
		"\u0223\u0224\u0005\u000b\u0000\u0000\u0224\u0225\u0003\u0090H\u0000\u0225"+
		"\u0226\u0005\u0004\u0000\u0000\u0226C\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0005;\u0000\u0000\u0228\u0229\u0005\u000b\u0000\u0000\u0229\u022a\u0005"+
		"<\u0000\u0000\u022a\u022b\u0005\t\u0000\u0000\u022b\u022c\u0005\n\u0000"+
		"\u0000\u022c\u022d\u0005\u0004\u0000\u0000\u022dE\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0005=\u0000\u0000\u022f\u0230\u0005\u000b\u0000\u0000\u0230"+
		"\u0231\u0005<\u0000\u0000\u0231\u0232\u0005\t\u0000\u0000\u0232\u0233"+
		"\u0005>\u0000\u0000\u0233\u0234\u0005\u000b\u0000\u0000\u0234\u0235\u0005"+
		"?\u0000\u0000\u0235\u0236\u0005\t\u0000\u0000\u0236\u0237\u0005-\u0000"+
		"\u0000\u0237\u0238\u0005\u000b\u0000\u0000\u0238\u0239\u0003\u008eG\u0000"+
		"\u0239\u023b\u0005\n\u0000\u0000\u023a\u023c\u0005\u0004\u0000\u0000\u023b"+
		"\u023a\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0001\u0000\u0000\u0000\u023d\u023f\u0005\n\u0000\u0000\u023e\u0240"+
		"\u0005\u0004\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0001\u0000\u0000\u0000\u0240G\u0001\u0000\u0000\u0000\u0241\u0242\u0005"+
		"0\u0000\u0000\u0242\u0243\u0005\u000b\u0000\u0000\u0243\u0244\u0005\u00a6"+
		"\u0000\u0000\u0244\u0245\u0005\u0004\u0000\u0000\u0245I\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u00051\u0000\u0000\u0247\u0248\u0005\u000b\u0000\u0000"+
		"\u0248\u0249\u0003\u008eG\u0000\u0249\u024a\u0005\u0004\u0000\u0000\u024a"+
		"K\u0001\u0000\u0000\u0000\u024b\u024c\u00052\u0000\u0000\u024c\u024d\u0005"+
		"\u000b\u0000\u0000\u024d\u024e\u0003\u008eG\u0000\u024e\u024f\u0005\u0004"+
		"\u0000\u0000\u024fM\u0001\u0000\u0000\u0000\u0250\u0251\u00053\u0000\u0000"+
		"\u0251\u0252\u0005\u000b\u0000\u0000\u0252\u0253\u0003\u008eG\u0000\u0253"+
		"\u0254\u0005\u0004\u0000\u0000\u0254O\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0005H\u0000\u0000\u0256\u0257\u0005\t\u0000\u0000\u0257\u0258\u0005"+
		"M\u0000\u0000\u0258\u0259\u0005\u000b\u0000\u0000\u0259\u025a\u0005I\u0000"+
		"\u0000\u025a\u0266\u0005\t\u0000\u0000\u025b\u025c\u0005\u00cd\u0000\u0000"+
		"\u025c\u0261\u0005\u000b\u0000\u0000\u025d\u0262\u0005\u00ca\u0000\u0000"+
		"\u025e\u025f\u0005\u00cd\u0000\u0000\u025f\u0260\u0005\f\u0000\u0000\u0260"+
		"\u0262\u0005\u00cd\u0000\u0000\u0261\u025d\u0001\u0000\u0000\u0000\u0261"+
		"\u025e\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263"+
		"\u0265\u0005\u0004\u0000\u0000\u0264\u025b\u0001\u0000\u0000\u0000\u0265"+
		"\u0268\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\u0001\u0000\u0000\u0000\u0267\u0269\u0001\u0000\u0000\u0000\u0268"+
		"\u0266\u0001\u0000\u0000\u0000\u0269\u026a\u0005\n\u0000\u0000\u026a\u026b"+
		"\u0005\u0004\u0000\u0000\u026b\u026c\u0005^\u0000\u0000\u026c\u026d\u0005"+
		"\u000b\u0000\u0000\u026d\u026e\u0003&\u0013\u0000\u026e\u0270\u0005\n"+
		"\u0000\u0000\u026f\u0271\u0005\u0004\u0000\u0000\u0270\u026f\u0001\u0000"+
		"\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271Q\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0005q\u0000\u0000\u0273\u0274\u0005\t\u0000\u0000"+
		"\u0274\u0275\u0005\u00bc\u0000\u0000\u0275\u027b\u0005\u000b\u0000\u0000"+
		"\u0276\u0277\u0005\t\u0000\u0000\u0277\u0278\u0005\n\u0000\u0000\u0278"+
		"\u0279\u0005\u000e\u0000\u0000\u0279\u027c\u0003\u001e\u000f\u0000\u027a"+
		"\u027c\u0005\u00cd\u0000\u0000\u027b\u0276\u0001\u0000\u0000\u0000\u027b"+
		"\u027a\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000\u0000\u027d"+
		"\u027f\u0005\u0004\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027e"+
		"\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280"+
		"\u0281\u0005^\u0000\u0000\u0281\u0282\u0005\u000b\u0000\u0000\u0282\u0283"+
		"\u0003\u0082A\u0000\u0283\u0284\u0005\n\u0000\u0000\u0284\u0285\u0005"+
		"\u0004\u0000\u0000\u0285S\u0001\u0000\u0000\u0000\u0286\u0288\u0003V+"+
		"\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000"+
		"\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000"+
		"\u0000\u028aU\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000"+
		"\u028c\u028d\u0003X,\u0000\u028d\u028e\u0007\u0001\u0000\u0000\u028eW"+
		"\u0001\u0000\u0000\u0000\u028f\u0298\u0003Z-\u0000\u0290\u0298\u0003\\"+
		".\u0000\u0291\u0298\u0003^/\u0000\u0292\u0298\u0003`0\u0000\u0293\u0298"+
		"\u0003b1\u0000\u0294\u0298\u0003d2\u0000\u0295\u0298\u0003h4\u0000\u0296"+
		"\u0298\u0003f3\u0000\u0297\u028f\u0001\u0000\u0000\u0000\u0297\u0290\u0001"+
		"\u0000\u0000\u0000\u0297\u0291\u0001\u0000\u0000\u0000\u0297\u0292\u0001"+
		"\u0000\u0000\u0000\u0297\u0293\u0001\u0000\u0000\u0000\u0297\u0294\u0001"+
		"\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0296\u0001"+
		"\u0000\u0000\u0000\u0298Y\u0001\u0000\u0000\u0000\u0299\u029a\u0005\u00cd"+
		"\u0000\u0000\u029a\u029b\u0005\u000f\u0000\u0000\u029b\u029c\u0005\u00ca"+
		"\u0000\u0000\u029c[\u0001\u0000\u0000\u0000\u029d\u029e\u0005\u00cd\u0000"+
		"\u0000\u029e\u029f\u0005\u000f\u0000\u0000\u029f\u02a0\u0003j5\u0000\u02a0"+
		"]\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005\u00cd\u0000\u0000\u02a2\u02a3"+
		"\u0007\u0003\u0000\u0000\u02a3\u02a4\u0003\u0090H\u0000\u02a4_\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a6\u0005\u00cd\u0000\u0000\u02a6\u02a7\u0007\u0003"+
		"\u0000\u0000\u02a7\u02a8\u0005\u00cd\u0000\u0000\u02a8\u02a9\u0005\f\u0000"+
		"\u0000\u02a9\u02aa\u0005\u00cd\u0000\u0000\u02aaa\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ac\u0005\u00c5\u0000\u0000\u02ac\u02ad\u0005\u00cd\u0000\u0000"+
		"\u02ad\u02ae\u0005\u000f\u0000\u0000\u02ae\u02af\u0005\u00ca\u0000\u0000"+
		"\u02afc\u0001\u0000\u0000\u0000\u02b0\u02b1\u0005\u00c5\u0000\u0000\u02b1"+
		"\u02b2\u0005\u00cd\u0000\u0000\u02b2\u02b3\u0005\u000f\u0000\u0000\u02b3"+
		"\u02b4\u0003j5\u0000\u02b4e\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005"+
		"\u00c5\u0000\u0000\u02b6\u02b7\u0005\u00cd\u0000\u0000\u02b7\u02b8\u0007"+
		"\u0003\u0000\u0000\u02b8\u02b9\u0003\u0090H\u0000\u02b9g\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bb\u0005\u00c5\u0000\u0000\u02bb\u02bc\u0005\u00cd\u0000"+
		"\u0000\u02bc\u02bd\u0007\u0003\u0000\u0000\u02bd\u02be\u0005\u00cd\u0000"+
		"\u0000\u02be\u02bf\u0005\f\u0000\u0000\u02bf\u02c0\u0007\u0004\u0000\u0000"+
		"\u02c0i\u0001\u0000\u0000\u0000\u02c1\u02c2\u0007\u0005\u0000\u0000\u02c2"+
		"k\u0001\u0000\u0000\u0000\u02c3\u02c6\u0003n7\u0000\u02c4\u02c6\u0003"+
		"r9\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c6m\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005\u0094\u0000\u0000"+
		"\u02c8\u02c9\u0005\u0011\u0000\u0000\u02c9\u02ca\u0005\u008c\u0000\u0000"+
		"\u02ca\u02cb\u0005\u0011\u0000\u0000\u02cb\u02cc\u0005\u00c5\u0000\u0000"+
		"\u02cc\u02cd\u0005\u0004\u0000\u0000\u02cd\u02ce\u0005\u00c5\u0000\u0000"+
		"\u02ce\u02cf\u0005\u0010\u0000\u0000\u02cf\u02d0\u0005\u0010\u0000\u0000"+
		"\u02d0\u02d1\u0005\u00cd\u0000\u0000\u02d1\u02d2\u0005\u000f\u0000\u0000"+
		"\u02d2\u02d3\u0005\u0005\u0000\u0000\u02d3\u02d4\u0005\u0006\u0000\u0000"+
		"\u02d4\u02d5\u0005 \u0000\u0000\u02d5o\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u0005\u00cd\u0000\u0000\u02d7\u02d8\u0005\u0005\u0000\u0000\u02d8\u02d9"+
		"\u0003\u0090H\u0000\u02d9\u02da\u0005\u0006\u0000\u0000\u02daq\u0001\u0000"+
		"\u0000\u0000\u02db\u02dc\u0005\u00c5\u0000\u0000\u02dc\u02dd\u0005\u00cd"+
		"\u0000\u0000\u02dd\u02de\u0005\u000f\u0000\u0000\u02de\u02df\u0005\u00cd"+
		"\u0000\u0000\u02df\u02e2\u0005\u0005\u0000\u0000\u02e0\u02e3\u0003\u0090"+
		"H\u0000\u02e1\u02e3\u0005l\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e6\u0005\u0006\u0000\u0000\u02e5\u02e7\u0005 \u0000\u0000\u02e6"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7"+
		"s\u0001\u0000\u0000\u0000\u02e8\u02e9\u0005\u00cd\u0000\u0000\u02e9\u02ea"+
		"\u0005\f\u0000\u0000\u02ea\u02eb\u0003\u001e\u000f\u0000\u02ebu\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ed\u0005[\u0000\u0000\u02ed\u02ee\u0005\t"+
		"\u0000\u0000\u02ee\u02ef\u0005\t\u0000\u0000\u02ef\u02f0\u0005\n\u0000"+
		"\u0000\u02f0\u02f1\u0005\u0007\u0000\u0000\u02f1\u02f2\u0003x<\u0000\u02f2"+
		"\u02f3\u0005\b\u0000\u0000\u02f3\u02f4\u0005\n\u0000\u0000\u02f4\u02f5"+
		"\u0007\u0001\u0000\u0000\u02f5w\u0001\u0000\u0000\u0000\u02f6\u0305\u0003"+
		"T*\u0000\u02f7\u02f8\u0005\u00cd\u0000\u0000\u02f8\u0300\u0005\f\u0000"+
		"\u0000\u02f9\u02fa\u0005\u00c7\u0000\u0000\u02fa\u02fb\u0005\t\u0000\u0000"+
		"\u02fb\u0301\u0005\n\u0000\u0000\u02fc\u02fd\u0005\u00c8\u0000\u0000\u02fd"+
		"\u02fe\u0005\t\u0000\u0000\u02fe\u02ff\u0005\u00cd\u0000\u0000\u02ff\u0301"+
		"\u0005\n\u0000\u0000\u0300\u02f9\u0001\u0000\u0000\u0000\u0300\u02fc\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0304\u0005"+
		" \u0000\u0000\u0303\u02f7\u0001\u0000\u0000\u0000\u0304\u0307\u0001\u0000"+
		"\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000"+
		"\u0000\u0000\u0306y\u0001\u0000\u0000\u0000\u0307\u0305\u0001\u0000\u0000"+
		"\u0000\u0308\u0309\u0005\u00c1\u0000\u0000\u0309\u030a\u0005\u000b\u0000"+
		"\u0000\u030a\u030b\u0005\u00c2\u0000\u0000\u030b\u030c\u0005\f\u0000\u0000"+
		"\u030c\u030d\u0007\u0006\u0000\u0000\u030d\u030e\u0005\u0004\u0000\u0000"+
		"\u030e{\u0001\u0000\u0000\u0000\u030f\u0310\u0005\u00c0\u0000\u0000\u0310"+
		"\u0311\u0005\u000b\u0000\u0000\u0311\u0312\u0005\u00be\u0000\u0000\u0312"+
		"\u0313\u0005\f\u0000\u0000\u0313\u0314\u0007\u0006\u0000\u0000\u0314\u0315"+
		"\u0005\u0004\u0000\u0000\u0315}\u0001\u0000\u0000\u0000\u0316\u0317\u0005"+
		"\u009a\u0000\u0000\u0317\u0318\u0005\t\u0000\u0000\u0318\u0319\u0005\u00af"+
		"\u0000\u0000\u0319\u031a\u0005\u000b\u0000\u0000\u031a\u031b\u0005\u00ca"+
		"\u0000\u0000\u031b\u031c\u0005\n\u0000\u0000\u031c\u031d\u0005\u0004\u0000"+
		"\u0000\u031d\u007f\u0001\u0000\u0000\u0000\u031e\u031f\u0005@\u0000\u0000"+
		"\u031f\u0320\u0005\u000b\u0000\u0000\u0320\u0321\u0005g\u0000\u0000\u0321"+
		"\u0322\u0005\f\u0000\u0000\u0322\u0323\u0005\u00c3\u0000\u0000\u0323\u0324"+
		"\u0005\u0004\u0000\u0000\u0324\u0081\u0001\u0000\u0000\u0000\u0325\u0326"+
		"\u0005\u00b0\u0000\u0000\u0326\u0329\u0005\t\u0000\u0000\u0327\u032a\u0003"+
		"\u0086C\u0000\u0328\u032a\u0003\u0084B\u0000\u0329\u0327\u0001\u0000\u0000"+
		"\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000"+
		"\u0000\u032b\u032c\u0005\n\u0000\u0000\u032c\u032d\u0005\u0004\u0000\u0000"+
		"\u032d\u0083\u0001\u0000\u0000\u0000\u032e\u032f\u0003p8\u0000\u032f\u0330"+
		"\u0005\u001f\u0000\u0000\u0330\u0331\u0005\u001f\u0000\u0000\u0331\u0332"+
		"\u0005\u00cc\u0000\u0000\u0332\u0333\u0005\u00cc\u0000\u0000\u0333\u0085"+
		"\u0001\u0000\u0000\u0000\u0334\u0336\u0003\u0090H\u0000\u0335\u0337\u0005"+
		"\u0004\u0000\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0336\u0337\u0001"+
		"\u0000\u0000\u0000\u0337\u0341\u0001\u0000\u0000\u0000\u0338\u0339\u0005"+
		"\u00ba\u0000\u0000\u0339\u033a\u0005\u000b\u0000\u0000\u033a\u033b\u0005"+
		"\u00b1\u0000\u0000\u033b\u033c\u0005\t\u0000\u0000\u033c\u033d\u0003\u0088"+
		"D\u0000\u033d\u033e\u0003\u008aE\u0000\u033e\u033f\u0005\n\u0000\u0000"+
		"\u033f\u0340\u0005\u0004\u0000\u0000\u0340\u0342\u0001\u0000\u0000\u0000"+
		"\u0341\u0338\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000"+
		"\u0342\u0087\u0001\u0000\u0000\u0000\u0343\u0344\u0005\u00b2\u0000\u0000"+
		"\u0344\u0345\u0005\u000b\u0000\u0000\u0345\u0346\u0005\u00ca\u0000\u0000"+
		"\u0346\u0347\u0005\u0004\u0000\u0000\u0347\u0089\u0001\u0000\u0000\u0000"+
		"\u0348\u0349\u0005\u00b3\u0000\u0000\u0349\u034a\u0005\u000b\u0000\u0000"+
		"\u034a\u034b\u0005\u00b4\u0000\u0000\u034b\u034c\u0005\f\u0000\u0000\u034c"+
		"\u034d\u0005\u00b5\u0000\u0000\u034d\u034e\u0005\u0004\u0000\u0000\u034e"+
		"\u008b\u0001\u0000\u0000\u0000\u034f\u0350\u0005P\u0000\u0000\u0350\u0351"+
		"\u0005\u000b\u0000\u0000\u0351\u0352\u0005Q\u0000\u0000\u0352\u0359\u0005"+
		"\f\u0000\u0000\u0353\u0354\u0005S\u0000\u0000\u0354\u0355\u0005\t\u0000"+
		"\u0000\u0355\u0356\u0007\u0007\u0000\u0000\u0356\u035a\u0005\u000b\u0000"+
		"\u0000\u0357\u0358\u0005R\u0000\u0000\u0358\u035a\u0005\t\u0000\u0000"+
		"\u0359\u0353\u0001\u0000\u0000\u0000\u0359\u0357\u0001\u0000\u0000\u0000"+
		"\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035c\u0005\u00ca\u0000\u0000"+
		"\u035c\u035d\u0005\n\u0000\u0000\u035d\u035e\u0005\u0004\u0000\u0000\u035e"+
		"\u008d\u0001\u0000\u0000\u0000\u035f\u0360\u0005n\u0000\u0000\u0360\u0361"+
		"\u0005\t\u0000\u0000\u0361\u0362\u0005\u00ca\u0000\u0000\u0362\u0363\u0005"+
		"\u0004\u0000\u0000\u0363\u0364\u0005\u00ca\u0000\u0000\u0364\u0365\u0005"+
		"\u0004\u0000\u0000\u0365\u0366\u0005\u00ca\u0000\u0000\u0366\u0367\u0005"+
		"\u0004\u0000\u0000\u0367\u0368\u0005\u00ca\u0000\u0000\u0368\u0369\u0005"+
		"\n\u0000\u0000\u0369\u008f\u0001\u0000\u0000\u0000\u036a\u036b\u0005\u00cb"+
		"\u0000\u0000\u036b\u036c\u0005\u00cd\u0000\u0000\u036c\u036d\u0005\u00cb"+
		"\u0000\u0000\u036d\u0091\u0001\u0000\u0000\u00007\u00a1\u00a3\u00ba\u00be"+
		"\u00c0\u00c4\u00ca\u00cc\u00e1\u00e4\u00e9\u010a\u010d\u011e\u0128\u012c"+
		"\u0136\u013b\u0144\u0153\u0158\u0165\u0171\u0174\u0179\u0180\u0188\u018f"+
		"\u0197\u01b8\u01d7\u01df\u01f2\u01fa\u0200\u021b\u0220\u023b\u023f\u0261"+
		"\u0266\u0270\u027b\u027e\u0289\u0297\u02c5\u02e2\u02e6\u0300\u0305\u0329"+
		"\u0336\u0341\u0359";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}