package AST.Variables;

import AST.Functions.calling_function;

public class add_to_list {
String name;
calling_function call=new calling_function();

    public add_to_list(String name, calling_function call) {
        this.name = name;
        this.call = call;
    }

    public add_to_list() {
    }

    @Override
    public String toString()  {
        return name+'.'+call+';';
    }
}
