package AST.Designes;

import AST.Childs.childTYPE;
import AST.Functions.calling_function;
import AST.Variables.string;

public class button extends childTYPE {
// String str;
string str2=new string();
text11 t5=new text11(str2);

text t=new text(t5);
//calling_function cc=new calling_function(str);
calling_function c=new calling_function();

    public button() {
    }
    public button(calling_function c,text t) {
        this.c = c;
        this.t=t;

    }

    @Override
    public String toString() {

        return "<button style=\" background-color:deepskyblue; padding:8px; color:white;border:none;border-radius: 5px \" onclick=\""+c+ "\">"+t+"</button>";
    }

}

