package AST.Childs;

import AST.Designes.mainAxis;

public class row extends childTYPE {

    childrens child=new childrens();
    mainAxis style=new mainAxis();


    public row() {}

    public row(childrens child, mainAxis style) {
        this.child=child;
        this.style = style;

    }


    @Override
    public String toString() {

        return "<div style=\""+style +"\" > " + child+"\n"+"</div>";


    }
    }


