package AST.Functions;

import AST.objects;

import java.util.ArrayList;

public class calling_function{
    String name1;
    String name;
    String string;
    ArrayList<objects> obj;

String obc;
    public calling_function() {  }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public calling_function(String obc, String name1){
        this.name1 = name1;
        this.obj=new ArrayList<>();
    this.obc=obc;
    }

    @Override
    public String toString() {

            StringBuilder strbul = new StringBuilder();

            if (obj.size() != 0 && (obc != null)) {

                for (objects a : obj) {
                    strbul.append(a);
                    strbul.append(",");
                }
                return "push"+"({"+ strbul+"})";
            }


         else if (obc==null) {
            return name1+ "()"   ;
        }
        return ""   ;
    }
    public void add(objects a) {
        this.obj.add(a);
    }

}
