package AST;

import java.util.ArrayList;

public class object {
    ArrayList<element> object;

    public object() {
        this.object = new ArrayList<>();
    }
    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < object.size(); i++) {
            st.append(object.get(i));
            if (i < object.size() - 1)
                st.append(" , ");

        }
        return "{ " + st.toString() + " }";
    }

    public void addElementToObj(element e) {
        this.object.add(e);

    }


}
