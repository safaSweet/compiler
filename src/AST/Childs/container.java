package AST.Childs;

import AST.Designes.Clip;
import AST.Designes.button;

import AST.Designes.padding;

public class container extends childTYPE {

    button b;
    childrens c;
    Clip p;
    padding pd;
    public container() {}

    public container( childrens c, Clip p, padding pd) {

        this.c = c;
        this.p = p;
        this.pd = pd;
    }


    public childrens getC() {
        return c;
    }

    public void setC(childrens c) {
        this.c = c;
    }

    @Override
    public String toString() {
     if(p!=null)   {

                return //c+"\n";
                        "<div style=\" "  + pd + "\" >" + c+"\n"+"</div>";
        }
     else {
         return c+"\n";
//                     "<div style=\" "  + pd + "\" >" + c;

     }
    }
}