package AST.Functions;

import AST.Variables.variables;

public class setState {
    String name;
    variables var=new variables();
    String clear;
    body_setState body=new body_setState(name,var,clear);

    public setState(body_setState body) {
        this.body = body;
    }

    public setState() {
    }

    @Override
    public String toString() {
        return
                 body +" \n"
                ;
    }
}
