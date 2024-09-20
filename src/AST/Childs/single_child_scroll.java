package AST.Childs;

public class single_child_scroll extends  childTYPE{
    childrens child=new childrens();

    public single_child_scroll(childrens child) {
        this.child = child;
    }

    public single_child_scroll() {
    }

    @Override
    public String toString() {
        return ""+child;
//                "<div>" +
//                 child +
//                "</div>"

    }
}
