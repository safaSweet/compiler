package AST;

import AST.Childs.childrens;

public class short_condition {
    String name;
    childrens child1=new childrens();
    childrens child2=new childrens();

    public short_condition(String name, childrens child1, childrens child2) {
        this.name = name;
        this.child1 = child1;
        this.child2 = child2;
    }

    public short_condition() {
    }
    @Override
    public String toString() {
        return "if(!"+name+") {"+
//                +" app.innerHTML = `"+

                 child1 +" } else {"+
                child2 +
                '}';
    }
}
