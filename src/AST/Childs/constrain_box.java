package AST.Childs;

public class constrain_box extends childTYPE{

childrens child=new childrens();


    public constrain_box(childrens child) {
        this.child = child;

    }

    @Override
    public String toString() {
        return
//                "<div style=\" min-height: 0px , box-sizing : border-box; \">" +
                 "\n"+child+"\n" ;
//                '}';
    }
}
