package AST.Childs;
import AST.Designes.button;

import java.util.ArrayList;
public class childrens {
    ArrayList<childTYPE> children;
    button b=new button();
    container co=new container();

    public childrens( button b, container co) {

        this.b = b;
        this.co = co;
    }

    public childrens() {
        this.children = new ArrayList<>();
    }
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        for (childTYPE c : this.children) {
            s.append('\n');
                s.append(c);
                s.append('\n');


        }
        return s.toString();
    }
    public void add(childTYPE v) {
        children.add(v);
    }
}

