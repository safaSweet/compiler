package AST;

import java.util.ArrayList;

public class List {
    ArrayList<object> list;
    String name;

    public List() {
    }

    public List(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public ArrayList<object> getList() {
        return list;
    }

    public void setList(ArrayList<object> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            st.append(list.get(i));
            if (i < list.size() - 1) {
                st.append(",");
            }
            if (i < list.size() - 1)
                st.append("\n");
        }
        return " list " + name + " = [ " + st.toString() + "]; ";
    }

    public void addObjectToList(object o) {
        this.list.add(o);

    }
}
