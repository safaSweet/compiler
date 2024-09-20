package AST.Childs;

import AST.Designes.button;
import AST.Designes.crossAxis;
import AST.attribute;

import java.util.ArrayList;


public class column extends childTYPE{

crossAxis cross=new crossAxis();
childrens child=new childrens();


    public column(childrens child,crossAxis cross){
        this.cross = cross;
        this.child=child;
    }

    public column() {}

    @Override
    public String toString() {
if(cross!=null)
           return
//                   "<div style=\""+cross +"\" > " +
                   child+"\n"
//                   +"</div>"
                   ;
else if (cross==null) {
    return " app.innerHTML = ` <div  > " + child+"\n"+"</div> `";

}
        return "";
    }

}
