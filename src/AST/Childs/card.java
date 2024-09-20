package AST.Childs;

public class card extends  childTYPE{
    childrens child=new childrens();

    public card(childrens child) {
        this.child = child;
    }

@Override
    public String toString() {
        return "<div class=\"card\" " +
                "style=\"  border: 2px solid #020303;\n \" >" +
                 child
                +"\n"+
                "</div>";
    }
}
