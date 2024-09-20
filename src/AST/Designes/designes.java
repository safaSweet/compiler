package AST.Designes;

import AST.Designes.design;

import java.util.ArrayList;
//extend design
public class designes {

    ArrayList<design> ds;

    public designes() {
        this.ds = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (design d1 : this.ds) {
            st.append(d1);
            st.append("\n");
        }
        return st.toString();
    }

    public void addDesign(design d) {
        ds.add(d);
    }
}
