// Generated from java-escape by ANTLR 4.11.1
package lexarAndParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parserD}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parserDVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parserD#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(parserD.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(parserD.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(parserD.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#bodyMyApp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyMyApp(parserD.BodyMyAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#class_extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_extend(parserD.Class_extendContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#containClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainClass(parserD.ContainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#bodyclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyclass(parserD.BodyclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#super_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_key(parserD.Super_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(parserD.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(parserD.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#void_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_function(parserD.Void_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#buildFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildFunction(parserD.BuildFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#call_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_(parserD.Call_Context ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#itemBodyFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemBodyFunction(parserD.ItemBodyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(parserD.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(parserD.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(parserD.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(parserD.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#texteditingcontroller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexteditingcontroller(parserD.TexteditingcontrollerContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(parserD.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#array_widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_widget(parserD.Array_widgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#all_widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_widget(parserD.All_widgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#single_child_scroll_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_child_scroll_view(parserD.Single_child_scroll_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(parserD.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(parserD.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(parserD.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#listView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListView(parserD.ListViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#card}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard(parserD.CardContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#listTitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListTitle(parserD.ListTitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#shortConditionStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortConditionStatment(parserD.ShortConditionStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(parserD.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#padding_widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_widget(parserD.Padding_widgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#text_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_field(parserD.Text_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#hintText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintText(parserD.HintTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#border}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder(parserD.BorderContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#enableBorder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableBorder(parserD.EnableBorderContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#filled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilled(parserD.FilledContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#fillColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFillColor(parserD.FillColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#focusColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFocusColor(parserD.FocusColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#hoverColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoverColor(parserD.HoverColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#contain_constrant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContain_constrant(parserD.Contain_constrantContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(parserD.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(parserD.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#array_variabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_variabels(parserD.Array_variabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#valueVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVariables(parserD.ValueVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#valueNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueNumber(parserD.ValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#valueBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBoolean(parserD.ValueBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#valueSTRING}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueSTRING(parserD.ValueSTRINGContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#variableDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDot(parserD.VariableDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#definition_Nmber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_Nmber(parserD.Definition_NmberContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#definition_Boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_Boolean(parserD.Definition_BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#definition_String}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_String(parserD.Definition_StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#definition_DOT_String}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_DOT_String(parserD.Definition_DOT_StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(parserD.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(parserD.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#typeMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeMap(parserD.TypeMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(parserD.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#assign_List_to_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_List_to_variable(parserD.Assign_List_to_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#add_to_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_to_list(parserD.Add_to_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#setState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetState(parserD.SetStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#bodySetState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodySetState(parserD.BodySetStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#crossAxis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossAxis(parserD.CrossAxisContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#mainAxis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainAxis(parserD.MainAxisContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#sizebox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizebox(parserD.SizeboxContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#clip_behavoir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClip_behavoir(parserD.Clip_behavoirContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(parserD.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#condition_in_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_in_text(parserD.Condition_in_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#type_text1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_text1(parserD.Type_text1Context ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#fontSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontSize(parserD.FontSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#fontWeight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontWeight(parserD.FontWeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#padding_Style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_Style(parserD.Padding_StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#rgb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRgb(parserD.RgbContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserD#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(parserD.StringContext ctx);
}