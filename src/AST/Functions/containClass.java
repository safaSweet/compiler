package AST.Functions;

import AST.Functions.bodyClass;
import AST.Functions.bodyMyApp;

import java.util.ArrayList;

public class containClass {

    StringBuilder st = new StringBuilder();
    bodyClass b=new bodyClass();
    bodyMyApp m=new bodyMyApp();

    ArrayList<bodyClass> classes;
ArrayList<bodyMyApp> myapp;

    public void addClass(bodyClass c) {
        st.append(c);

    }
    public void addApp(bodyMyApp c) {
      st.append(c);

    }


    public containClass() {
        ArrayList<bodyClass> classes = new ArrayList<>();
        ArrayList<bodyMyApp> myapp = new ArrayList<>();
    }


    @Override
    public String toString() {

            return st.toString();

    }
}
