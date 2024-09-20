package AST;

import AST.Functions.calling_function;
import AST.Variables.add_to_list;

import java.util.ArrayList;

public class if_condition {

String name1;
    String name2;
    
    ArrayList<calling_function> call;
//    calling_function call=new calling_function();
    add_to_list add=new add_to_list();


    public if_condition(String name1, String name2,  add_to_list add) {
        this.name1 = name1;
        this.name2 = name2;
        this.call =new ArrayList<>();
        this.add = add;
    }

    public if_condition() {
    }

    public void add(calling_function a) {
        this.call.add(a);
    }

    @Override
    public String toString() {
        StringBuilder strbul = new StringBuilder();
        for (calling_function a : call) {
            strbul.append(a);

        }
        return "if(" +
                name1 + "!==\" \"" +
                "&&" + name2 + "!== \" \" ) {"+
                add +
                strbul +
                '}';
    }
}
