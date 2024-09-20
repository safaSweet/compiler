package AST.Functions;

import AST.Variables.variables;

public class body_setState  {
    String name;
    variables var=new variables();
    String clear;


    public body_setState(String name, variables var, String clear) {
        this.name = name;
        this.var = var;
        this.clear = clear;
    }

    public body_setState() {
    }

    @Override
    public String toString() {
        if(var!=null)
        return var+"\n build();" ;

        else
            return
            "\n build();";
    }
}
