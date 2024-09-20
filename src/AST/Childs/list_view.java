package AST.Childs;

import AST.Variables.List_Map;

public class list_view extends childTYPE{

childrens child =new childrens();
List_Map list=new List_Map();

    public list_view(childrens child, List_Map list) {
        this.child = child;
        this.list = list;
    }

    @Override
    public String toString() {
        return list +""+ child +"`)\n" +" .join(\"\");";

    }
}
