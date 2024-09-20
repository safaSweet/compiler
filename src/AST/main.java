package AST;

import AST.Functions.programm;

import java.util.ArrayList;

public class main {
        ArrayList<programm> classes;
        String str;

    public main(String str) {
        classes = new ArrayList<>();
        this.str=str;
    }

    public void addClass(programm c) {
        classes.add(c);

    }

    public main() {
        classes = new ArrayList<>();
    }

    @Override
    public String toString() {
        if(str==null&&classes.size()!=0) {
            StringBuilder st = new StringBuilder();
            for (programm c : classes) {
                st.append(c);
                st.append('\n');

            }
            return st.toString();
//        String string =new String();
//        for ( int i=0 ; i<this.classes.size() ; i++)
//            this.classes.get(i).toString() ;
//        return string.toString();
        }
        else{return " ";}
    }
}
