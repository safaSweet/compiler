package AST.Functions;

import AST.Variables.List_Map;
import AST.Variables.var;
import AST.Variables.variables;

import java.util.ArrayList;

public class bodyClass  {//extends containClass

    StringBuilder st = new StringBuilder();
    public bodyClass() {
        ArrayList<Function> functions = new ArrayList<>();
        ArrayList<List_Map> list = new ArrayList<>();
        ArrayList<variables> variables = new ArrayList<>();

    }

    public void addList(List_Map l) {

        st.append(l.toString());
        st.append('\n');
    }

    public void addFunction(Function f) {

//        st.append("@Override ");
//        st.append('\n');
        st.append(f.toString());
        st.append('\n');
    }

    public void addVariables(var v) {

        st.append(v.toString());
        st.append('\n');
    }

@Override
public String toString() {

        return st.toString();
    }
}
