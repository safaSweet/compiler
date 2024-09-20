package AST.Variables;

import java.util.ArrayList;

public class variables {
    ArrayList<var> children;

    public variables() {
        this.children = new ArrayList<>();

    }

    public ArrayList<var> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<var> children) {
        this.children = children;
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        if (children != null) {
            for (var c : this.children) {
                s.append(c);
                s.append('\n');
            }
            return s.toString();
        } else return " ";
    }

    public void add(var v) {
        children.add(v);
    }

}

