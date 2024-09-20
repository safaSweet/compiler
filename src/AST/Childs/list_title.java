package AST.Childs;

import AST.Designes.text;
import AST.Designes.text11;

public class list_title extends childTYPE{

    text11 t11=new text11();
    text11 t22=new text11();
text t1=new text(t11);
text t2=new text(t11);


childrens child =new childrens();

    public list_title(text t1, text t2,childrens child) {
        this.t1 = t1;
        this.t2 = t2;
        this.child=child;
    }



    @Override
    public String toString() {
        return "<h2>"+t1+"</h2>"+
                "\n"+"<h4>"+t2+"</h4>"+
                "\n"+child;
    }
}
