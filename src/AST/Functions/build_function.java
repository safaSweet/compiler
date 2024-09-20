package AST.Functions;

import AST.short_condition;

public class build_function  {

short_condition condition =new short_condition();
String build;

    public build_function() {
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public build_function(short_condition condition, String build) {
        this.condition = condition;
        this.build=build;

    }
    @Override
    public String toString() {
        return "function "+build+"() {" +
                condition +
                "}  \n build();";
    }
}
