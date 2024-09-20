package AST.Variables;

import AST.Childs.childrens;

public class add_list_to_var {
    public String name1;
    public String name2;

    childrens child =new childrens();

    public add_list_to_var(String name1, String name2){
        this.name1 = name1;
        this.name2 = name2;
    }

    public add_list_to_var() {
    }

    @Override
    public String toString() {
        return "const " +name1+'='+name2+".map(("+name1+",index)=> `"+child ;
    }
}
