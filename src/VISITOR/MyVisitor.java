package VISITOR;

import AST.*;
import AST.Childs.*;
import AST.Designes.*;
import AST.Designes.text;
import AST.Functions.*;
import AST.Variables.*;
import lexarAndParser.parserD;
import lexarAndParser.parserDBaseVisitor;
//import symbolTable.SymbolTable;
import AST.Variables.var_list;
import symbolTable.Row;
import symbolTable.Semantic;
import symbolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;

public class MyVisitor extends parserDBaseVisitor {
    SymbolTable sT = new SymbolTable();

    @Override
    public main visitMain(parserD.MainContext ctx) {

        if(ctx.program().size()!=0) {
        main p = new main();
        for (int i = 0; i < ctx.program().size(); i++)
            p.addClass(visitProgram(ctx.program().get(i)));
//            System.out.println("<<-------------Symbol Table ---------------------->>");

        System.out.println("<<--------------- ---- ---------------------->>");
        try {
            FileWriter fileWriter = new FileWriter("src//output//outPut.html");
            fileWriter.write("<!DOCTYPE html>\n " +
                                  "<html>\n " +
                    "<head>\n  <title>NotesApp</title>  </head>\n " +
                    "<body>\n" +
                    " <div id=\"app\"></div>\n <script> \n" +

                    " const app = document.getElementById(\"app\"); "
        );
            fileWriter.write(p.toString());

            fileWriter.write("</script>\n  " +
                    " </body>\n " +
                    "</html>");

            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace(); }

//            this.sT.print();

//            Sem.checkErrors();
            Semantic Sem=new Semantic();
            Sem.setsT(this.sT);
            Sem.check();
        return p;
    }
   return null;
    }
    @Override
    public containClass visitContainClass(parserD.ContainClassContext ctx) {
        containClass cc= new containClass();
        if(ctx.bodyclass().size()!=0 &&ctx.bodyMyApp().size()==0) {
            for (int i = 0; i < ctx.bodyclass().size(); i++)
                cc.addClass(visitBodyclass(ctx.bodyclass().get(i)));

        }
        if(ctx.bodyclass().size()==0 &&ctx.bodyMyApp().size()!=0) {
            for (int i = 0; i < ctx.bodyMyApp().size(); i++)
                cc.addApp(visitBodyMyApp(ctx.bodyMyApp().get(i)));

        }
     return cc;
    }

    @Override
    public ClassArchitecture visitClass(parserD.ClassContext ctx) {

        ClassArchitecture c = new ClassArchitecture( visitContainClass(ctx.containClass()),ctx.NAME().getText());
        //اضافة ال symbolTable
        Row row = new Row();
        row.setType("name_class");
        row.setValue(c.getNAME());
//        Row row1 = new Row();
//        row1.setType("typeClass");
//        row1.setValue(""+c.getType());
        sT.getRows().add(row);
//        sT.getRows().add(row1);

        return c;
    }

    @Override
    public bodyMyApp visitBodyMyApp(parserD.BodyMyAppContext ctx) {
        bodyMyApp b = new bodyMyApp( (Function) visitFunction(ctx.function()));

        return b;
    }

    @Override
    public bodyClass visitBodyclass(parserD.BodyclassContext ctx) {
        bodyClass bodyClass = new bodyClass();

        if (ctx.list().size() != 0)
            for (int i = 0; i < ctx.list().size(); i++)
                bodyClass.addList(visitList(ctx.list().get(i)));

        if (ctx.array_variabels().size() != 0)
            for (int i = 0; i < ctx.array_variabels().size(); i++)
                bodyClass.addVariables(visitArray_variabels(ctx.array_variabels().get(i)));

        if (ctx.function().size() != 0) {
            for (int i = 0; i < ctx.function().size(); i++)
                bodyClass.addFunction((Function) visitFunction(ctx.function().get(i)));
        }

        return bodyClass;
    }

//
//    //****************************************************************************
//    //function


    @Override
    public programm visitProgram(parserD.ProgramContext ctx) {
        return new programm(visitClass(ctx.class_()));
    }

    @Override
    public build_function visitBuildFunction(parserD.BuildFunctionContext ctx) {

        build_function b=new build_function(visitShortConditionStatment(ctx.shortConditionStatment()),ctx.BUILD().getText());
        Row row = new Row();
        row.setType("build_function" );
        row.setValue(  b.getBuild());
        sT.getRows().add(row);
        return b;
    }




    @Override
    public Function visitFunction(parserD.FunctionContext ctx) {
     if(ctx.void_function()!=null&&ctx.buildFunction()==null)
        return new Function(visitVoid_function(ctx.void_function()),null);
     else if(ctx.buildFunction()!=null&&ctx.void_function()==null)
         return  new Function(null,visitBuildFunction(ctx.buildFunction()));
     else
         return  new Function();
    }

    @Override
    public void_function visitVoid_function(parserD.Void_functionContext ctx) {
      void_function n=  new void_function(ctx.NAME().getText(),visitItemBodyFunction(ctx.itemBodyFunction()));

        Row row = new Row();
        row.setType("void_function");
        row.setValue(n.getName());
        sT.getRows().add(row);

        return n;
    }

    @Override
    public item_body_function visitItemBodyFunction(parserD.ItemBodyFunctionContext ctx) {

        if(ctx.setState()!=null && ctx.if_condition()==null)
        return new item_body_function(visitVariables(ctx.variables()),null,visitSetState(ctx.setState()));

      else  if(ctx.setState()==null && ctx.if_condition()!=null)
            return  new item_body_function(visitVariables(ctx.variables()),visitIf_condition(ctx.if_condition()),null);

      else return  new item_body_function();
    }

    @Override
    public text_editor_controller visitTexteditingcontroller(parserD.TexteditingcontrollerContext ctx) {

        text_editor_controller p=new text_editor_controller(ctx.NAME().getText());

        Row row = new Row();
        row.setType("textEditor" );
        row.setValue( p.getName());
        sT.getRows().add(row);
        return p;
    }

    //    //****************************************************************************************
//    //child && children
//
    @Override
    public childrens visitWidget(parserD.WidgetContext ctx) {
        childrens c = new childrens();

           for (int i = 0; i < ctx.array_widget().size(); i++) {

               c.add(visitArray_widget(ctx.array_widget().get(i)));
           }

        return c;
    }

    @Override
    public childTYPE visitArray_widget(parserD.Array_widgetContext ctx) {

        return (childTYPE) visit(ctx.all_widget());
    }

    @Override
    public container visitContainer(parserD.ContainerContext ctx) {
        container c=new container();


if(ctx.clip_behavoir()!=null)

        return new container( visitWidget(ctx.widget()), visitClip_behavoir(ctx.clip_behavoir()), visitPadding_Style(ctx.padding_Style()));
else
       return new container( visitWidget(ctx.widget()), null, visitPadding_Style(ctx.padding_Style()));
    }

    @Override
    public row visitRow(parserD.RowContext ctx) {

        return new row(visitWidget(ctx.widget()),visitMainAxis(ctx.mainAxis()));
    }

    @Override
    public column visitColumn(parserD.ColumnContext ctx) {

if(ctx.crossAxis()!=null)
    return new column(visitWidget(ctx.widget()),visitCrossAxis(ctx.crossAxis()));
else if (ctx.crossAxis()==null) {
    return new column(visitWidget(ctx.widget()),null);
}
    return new column();
    }

    @Override
    public list_view visitListView(parserD.ListViewContext ctx) {
        return new list_view(visitWidget(ctx.widget()),visitList(ctx.list()));
    }

    @Override
    public card visitCard(parserD.CardContext ctx) {
        return new card((childrens) visitWidget(ctx.widget()));
    }

    @Override
    public list_title visitListTitle(parserD.ListTitleContext ctx) {

        return new list_title(visitText(ctx.text().get(0)),visitText(ctx.text(1)),visitWidget(ctx.widget()));
    }


    @Override
    public text_field visitText_field(parserD.Text_fieldContext ctx) {
        return new text_field(ctx.NAME().getText(),visitHintText(ctx.hintText()));
    }

    @Override
    public hint_text visitHintText(parserD.HintTextContext ctx) {
        return new hint_text( visitString(ctx.string()));
    }

    @Override
    public single_child_scroll visitSingle_child_scroll_view(parserD.Single_child_scroll_viewContext ctx) {
        return new single_child_scroll(visitWidget(ctx.widget()));
    }

    @Override
    public padding_widget visitPadding_widget(parserD.Padding_widgetContext ctx) {

        add_list_to_var add=new add_list_to_var();

        if(ctx.text()!=null&&ctx.widget()==null){
            return new padding_widget(visitPadding_Style(ctx.padding_Style()),visitText(ctx.text()),null,null);
        }
        else if (ctx.text()==null&&ctx.widget()!=null)

        return new padding_widget(visitPadding_Style(ctx.padding_Style()),null,visitWidget(ctx.widget()),add);

        else return  new padding_widget();
    }

    @Override
    public button visitButton(parserD.ButtonContext ctx) {

return   new button(visitCall_function(ctx.call_function()),(text) visitText(ctx.text()));


    }

    @Override
    public short_condition visitShortConditionStatment(parserD.ShortConditionStatmentContext ctx) {
        return new short_condition(ctx.NAME().getText(),visitWidget(ctx.widget().get(0)),visitWidget(ctx.widget().get(1)));
    }

    @Override
    public if_condition visitIf_condition(parserD.If_conditionContext ctx) {
if_condition if_=new if_condition(ctx.NAME().get(0).getText(),ctx.NAME().get(1).getText(),visitAdd_to_list(ctx.add_to_list()));

  for (int i = 0; i < ctx.call_function().size(); i++)

  if_.add(visitCall_function(ctx.call_function(i)));

            return if_;
    }

    @Override
    public add_to_list visitAdd_to_list(parserD.Add_to_listContext ctx) {
        return new add_to_list(ctx.NAME().getText(),visitCall_function(ctx.call_function()));
    }

    @Override
    public calling_function visitCall_function(parserD.Call_functionContext ctx) {


     if(ctx.OBC()!=null){

         calling_function fa = new calling_function(ctx.OBC().getText(),ctx.NAME().get(0).getText());
         for (int i = 0; i < ctx.object().size(); i++)
             fa.add(visitObject(ctx.object(i)));

         return fa;

        }
     else  if (ctx.OBC()==null) {
         calling_function n=new calling_function(null,ctx.NAME().get(0).getText());

//         Row row = new Row();
//         row.setType("call_function " );
//         row.setValue( "call" +n.getName1());
//         sT.getRows().add(row);

         return n;
     }

        return new calling_function();

    }
    @Override
    public objects visitObject(parserD.ObjectContext ctx) {
return  new objects( visitString(ctx.string()),ctx.NAME().getText());
    }

    @Override
    public setState visitSetState(parserD.SetStateContext ctx) {
        return new setState(visitBodySetState(ctx.bodySetState()));
    }

    @Override
    public body_setState visitBodySetState(parserD.BodySetStateContext ctx) {
        if(ctx.variables()!=null)
        return new body_setState(ctx.NAME().toString(),visitVariables(ctx.variables()),ctx.CLEAR().toString());

   else
       return new body_setState(ctx.NAME().toString(),null,ctx.CLEAR().toString());

    }


    //********************************************************************************************


    //design

//    @Override
//    public designes visitDesignes(parserD.DesignesContext ctx) {
//        designes d = new designes();
//        for (int i = 0; i < ctx.design().size(); i++)
//            d.addDesign(visitDesign(ctx.design().get(i)));
//
//        return d;
//    }
//
//    @Override
//    public design visitDesign(parserD.DesignContext ctx) {
//        return (design) visit(ctx.des());//
//    }

//    @Override
//    public background_color visitBackgroundColor(parserD.BackgroundColorContext ctx) {
//
//        String Num1 = ctx.NUMBER().get(0).getText();
//        int number = Integer.parseInt(Num1);
//        String Num2 = ctx.NUMBER().get(1).getText();
//        int number2 = Integer.parseInt(Num2);
//        String Num3 = ctx.NUMBER().get(2).getText();
//        int number3 = Integer.parseInt(Num3);
//        background_color bc= new background_color(number,number2,number3);
//
//        return bc;
//    }



    @Override
    public padding visitPadding_Style(parserD.Padding_StyleContext ctx) {
        padding p =new padding();
         String Num = ctx.NUMBER().getText();
        int number = Integer.parseInt(Num);
        if (ctx.ALL()!= null && ctx.ONLY() == null)
            return new padding(number,null,null);
        else if ( ctx.ONLY() != null &&ctx.ALL()== null ){
            if(ctx.TOP()!=null && ctx.BOTTON()==null)
                return new padding(number,ctx.TOP().getText(),null);

           else if(ctx.TOP()==null &&ctx.BOTTON()!=null)
               return new padding(number,null,ctx.BOTTON().getText());
        }
        return p;
    }

    @Override
    public fontSize visitFontSize(parserD.FontSizeContext ctx) {
        String Num1 = ctx.NUMBER().getText();
        float number = Integer.parseInt(Num1);
fontSize f=new fontSize(number);
        return f;
    }

    @Override
    public fontWeight visitFontWeight(parserD.FontWeightContext ctx) {
        fontWeight f=new fontWeight();
        return f;
    }

    @Override
    public text visitText(parserD.TextContext ctx) {
        text t=new text();

        if(ctx.type_text1()!=null && ctx.condition_in_text()==null){
            return new text(visitType_text1(ctx.type_text1()),null);
        }
        else if(ctx.condition_in_text()!=null && ctx.type_text1()==null){
            return new text(null,visitCondition_in_text(ctx.condition_in_text()));
        }

        return t;
    }





    @Override
    public text2 visitCondition_in_text(parserD.Condition_in_textContext ctx) {
        text2 t=new text2((var_list) visitValueList(ctx.valueList()));
        return t;
    }

    @Override
    public text11 visitType_text1(parserD.Type_text1Context ctx) {

        text11 t1=new text11(visitString(ctx.string()));

if(ctx.fontSize()!=null&&ctx.fontWeight()!=null) {

  return  new text11((fontSize) visitFontSize(ctx.fontSize()), (fontWeight) visitFontWeight(ctx.fontWeight()),  visitString(ctx.string()));
}
else if(ctx.fontSize()==null&&ctx.fontWeight()==null)

{return new text11(null,null, visitString(ctx.string()));}

return t1;
    }


    @Override
    public mainAxis visitMainAxis(parserD.MainAxisContext ctx) {

        mainAxis main_axis = new mainAxis();

        if(ctx.START()==null&&ctx.SPACE_AROUND()==null&&ctx.SPACE_EVENLY()==null&&ctx.CENTER()!=null)
        {return new mainAxis(ctx.CENTER().getText(),null,null,null);}

        if(ctx.START()==null&&ctx.SPACE_AROUND()!=null&&ctx.SPACE_EVENLY()==null&&ctx.CENTER()==null)
        {return new mainAxis(null,null,ctx.SPACE_AROUND().getText(),null);}

        if(ctx.START()==null&&ctx.SPACE_AROUND()==null&&ctx.SPACE_EVENLY()!=null&&ctx.CENTER()==null)
        {return new mainAxis(null,null,null,ctx.SPACE_EVENLY().getText());}

        if(ctx.START()==null&&ctx.SPACE_AROUND()==null&&ctx.SPACE_EVENLY()==null&&ctx.CENTER()!=null)
        {return new mainAxis(ctx.CENTER().getText(),null,null,null);}

        return main_axis;
    }

    @Override
    public crossAxis visitCrossAxis(parserD.CrossAxisContext ctx) {
        if(ctx.START()==null&&ctx.SPACE_AROUND()==null&&ctx.SPACE_EVENLY()==null&&ctx.CENTER()!=null)
        {return new crossAxis(ctx.CENTER().getText(),null,null,null);}

        if(ctx.START()!=null&&ctx.SPACE_AROUND()==null&&ctx.SPACE_EVENLY()==null&&ctx.CENTER()==null)
        {return new crossAxis(null,ctx.START().getText(),null,null);}

        if(ctx.START()==null&&ctx.SPACE_AROUND()!=null&&ctx.SPACE_EVENLY()==null&&ctx.CENTER()==null)
        {return new crossAxis(null,null,ctx.SPACE_AROUND().getText(),null);}

        if(ctx.START()==null&&ctx.SPACE_AROUND()==null&&ctx.SPACE_EVENLY()!=null&&ctx.CENTER()==null)
        {return new crossAxis(null,null,null,ctx.SPACE_EVENLY().getText());}

//        crossAxis c= new crossAxis();

        return null;
    }

    @Override
    public constrain_box visitContain_constrant(parserD.Contain_constrantContext ctx) {
        constrain_box c=new constrain_box(visitWidget(ctx.widget()));
        return c;
    }


    @Override
    public SizeBox visitSizebox(parserD.SizeboxContext ctx) {
        String Num1 = ctx.NUMBER().getText();
        float number = Integer.parseInt(Num1);
        SizeBox s=new SizeBox(number);
        return s;
    }

    @Override
    public Clip visitClip_behavoir(parserD.Clip_behavoirContext ctx) {
        Clip c=new Clip();

        return c;
    }
    //    @Override
//    public image visitImage(parserD.ImageContext ctx) {
//        if (ctx.DOLAR() != null && ctx.NAME() != null)
//            return new image(ctx.DOLAR().getText(), ctx.NAME().getText(), null);
//        else if (ctx.DOLAR() == null && ctx.NAME() != null)
//            return new image(null, ctx.NAME().getText(), null);
//        else if (ctx.DOLAR() != null && ctx.valueObject() != null)
//            return new image(ctx.DOLAR().getText(), null, (valueObject) visitValueObject(ctx.valueObject()));
//        else if (ctx.DOLAR() == null && ctx.valueObject() != null)
//            return new image(null, null, (valueObject) visitValueObject(ctx.valueObject()));
//        else
//            return new image(null, null, null);
//    }

//    @Override
//    public text visitText(parserD.TextContext ctx) {
//        if (ctx.DOLAR() != null && ctx.NAME() != null)
//            return new text(ctx.DOLAR().getText(), ctx.NAME().getText(), null);
//        else if (ctx.DOLAR() == null && ctx.NAME() != null)
//            return new text(null, ctx.NAME().getText(), null);
//        else if (ctx.DOLAR() != null && ctx.valueObject() != null)
//            return new text(ctx.DOLAR().getText(), null, (valueObject) visitValueObject(ctx.valueObject()));
//        else if (ctx.DOLAR() == null && ctx.valueObject() != null)
//            return new text(null, null, (valueObject) visitValueObject(ctx.valueObject()));
//        else
//            return new text(null, null, null);
//    }
//
//    @Override
//    public width visitW(parserD.WContext ctx) {
//        String Num = ctx.NUMBER().getText();
//        int number = Integer.parseInt(Num);
//        width w = new width(number);
//        return w;
//    }
//
//    @Override
//    public height visitH(parserD.HContext ctx) {
//        String Num = ctx.NUMBER().getText();
//        int number = Integer.parseInt(Num);
//        height h = new height(number);
//        return h;
//    }

    ////*************************************************************************************

    //list

    @Override
    public List_Map visitList(parserD.ListContext ctx) {
        if(ctx.typeMap()!=null&&ctx.assign_List_to_variable()==null)
        return new List_Map(visitTypeMap(ctx.typeMap()),null);
        else if (ctx.typeMap()==null&&ctx.assign_List_to_variable()!=null) {
        return new List_Map(null,visitAssign_List_to_variable(ctx.assign_List_to_variable()));
        }
        else return  new List_Map()
            ;
    }

    @Override
    public map visitTypeMap(parserD.TypeMapContext ctx) {

map mapp=new map(ctx.NAME().getText());

                Row row = new Row();
        row.setType("name_list" );//"valueInt " +
        row.setValue(mapp.getName());
        sT.getRows().add(row);

        return mapp;
    }

    @Override
    public add_list_to_var visitAssign_List_to_variable(parserD.Assign_List_to_variableContext ctx) {
        return new add_list_to_var(ctx.NAME().get(0).getText(),ctx.NAME().get(1).getText());//,ctx.INDEX().getText());
    }

    @Override
    public var_list visitValueList(parserD.ValueListContext ctx) {
        String name = ctx.NAME().toString();

        var_list list = new var_list(name,  visitString(ctx.string()));
//                Row row = new Row();
//        row.setType("name_varList" );//"valueInt " +
//        row.setValue(list.getStr());
//        sT.getRows().add(row);
        return list;
    }

//***************************************************************************
    //variables

    @Override
    public variables visitVariables(parserD.VariablesContext ctx) {
        variables var = new variables();
        for (int i = 0; i < ctx.array_variabels().size(); i++) {
            var.add(visitArray_variabels(ctx.array_variabels().get(i)));
        }

        return var;
    }



    @Override
    public var visitArray_variabels(parserD.Array_variabelsContext ctx) {
        return  (var) visit(ctx.valueVariables());       }


    @Override
    public Object visitVariableDot(parserD.VariableDotContext ctx) {
        return super.visitVariableDot(ctx);
    }

    @Override
    public num visitValueNumber(parserD.ValueNumberContext ctx) {
        String str = ctx.NAME().getText();
        String num = ctx.NUMBER().getText();
        int number = Integer.parseInt(num);
        num n = new num(number, str);
//        Row row = new Row();
//        row.setType("name_var2int" );//"valueInt " +
//        row.setValue(n.getStr());
//        sT.getRows().add(row);
        return n;
    }

    @Override
    public bool visitValueBoolean(parserD.ValueBooleanContext ctx) {
        boolean s2 = Boolean.parseBoolean(ctx.bool().getText());
        String s1 = ctx.NAME().toString();
        bool s = new bool(s1, s2);
//        Row row = new Row();
//        row.setType("name_var2bool" );//valueBoolean
//        row.setValue(s.getStr());
//        sT.getRows().add(row);
        return s;
    }

    @Override
    public str visitValueSTRING(parserD.ValueSTRINGContext ctx) {
        String name = ctx.NAME().toString();
//        String s=ctx.STRING().toString();
        str str = new str(name,  visitString(ctx.string()));
//        Row row = new Row();
//        Row row1=new Row();
//        row.setType( "name_var2str");//"valueString " +
//        row.setValue(""+str.getStr());
//        row1.setType();
//        row1.setValue("" + str.getStr1());
//        sT.getRows().add(row);
//        Semantic Sem=new Semantic();
//        Sem.setsT(this.sT);
//        Sem.check();
        return str;
    }



    @Override
    public definitionNumber visitDefinition_Nmber(parserD.Definition_NmberContext ctx) {
        String str = ctx.NAME().getText();
        String num = ctx.NUMBER().getText();
        int number = Integer.parseInt(num);
        definitionNumber n = new definitionNumber(number, str);
        Row row = new Row();

        Row row1=new Row();
        row.setType("name_int");
        row.setValue(n.getStr() );

        row1.setType("value_int");
        row1.setValue(""+n.getNum());
        sT.getRows().add(row);
//        this.sT.print();
        return n;
    }

    @Override
    public definitionBool visitDefinition_Boolean(parserD.Definition_BooleanContext ctx) {
        boolean s2 = Boolean.parseBoolean(ctx.bool().getText());
        String s1 = ctx.NAME().toString();
        definitionBool s = new definitionBool(s1, s2);
        Row row = new Row();
        Row row1=new Row();

        row.setType("name_bool");
        row.setValue(s.getStr());
        row1.setType("value_bool");
        row1.setValue(""+s.getStr1());
        sT.getRows().add(row);
        sT.getRows().add(row1);
//        this.sT.print();
        return s ;
    }

    @Override
    public definitionString visitDefinition_String(parserD.Definition_StringContext ctx) {
        String name = ctx.NAME().toString();

        definitionString str  = new definitionString(name, visitString(ctx.string()));
        Row row = new Row();
        Row row1=new Row();

        row.setType("name_string");
        row.setValue(str.getStr1());
//        row1.setType("value_var");
//        row1.setValue(str.getStr()+"");
        sT.getRows().add(row);
//      this.  sT.print();
        return str;
    }

    @Override
    public definition_DOT_text visitDefinition_DOT_String(parserD.Definition_DOT_StringContext ctx) {
       definition_DOT_text str=new definition_DOT_text(ctx.NAME().get(0).toString(),ctx.NAME().get(1).getText());
                Row row = new Row();
                Row row1=new Row();
        row.setType("text_dot");
        row.setValue( str.getStr1());
        row1.setType("valueText_dot");
        row1.setValue(str.getStr());
        sT.getRows().add(row);
        sT.getRows().add(row1);
//        sT.print();

        return str;
    }

    @Override
    public string visitString(parserD.StringContext ctx) {
      string str=  new string(ctx.NAME().getText());
//        Row row = new Row();
//        row.setType("bbbbbb");
//        row.setValue("" + str.getStr1());
//        sT.getRows().add(row);
//        sT.print();
        return str;
    }

}
