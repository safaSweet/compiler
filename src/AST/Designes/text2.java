package AST.Designes;

import AST.Variables.string;
import AST.Variables.var_list;

public class text2  {
String st1;
string st2=new string();

var_list v=new var_list(st1,st2);

    public text2(var_list v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "${" +
               v.str1+'.'+ v.str2 +
                "}";
    }
}
