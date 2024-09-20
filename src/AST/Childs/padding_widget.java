package AST.Childs;

import AST.Designes.padding;
import AST.Designes.text;
import AST.Designes.text11;
import AST.Variables.add_list_to_var;

public class padding_widget extends childTYPE{
    String name1;
    String name2;
padding p=new padding();
    text11 t22=new text11();
text t=new text(t22);
childrens child =new childrens();
    add_list_to_var add=new add_list_to_var(name1,name2);

    public padding_widget(padding p, text t, childrens child,add_list_to_var add) {
        this.p = p;
        this.t = t;
        this.child = child;
        this.add=add;
    }

    public padding_widget() {
    }

    @Override
    public String toString() {

        if(t!=null&&child==null){
            return
                    " app.innerHTML = ` <div>"+
                    t+"\n"

                    +"</div>"
                    ;
        }




        else if(child!=null&&t==null){
            return "<div>"+"\n "+" ${"+"note"+"}" +"\n"+child+"</div> `";
        }
        return "" ;
    }
}
