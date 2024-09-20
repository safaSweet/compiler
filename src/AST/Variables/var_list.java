package AST.Variables;
import AST.Variables.string;
public class var_list extends var {
    public String str1;
    public String ss;
   public string str2=new string(ss);

    public var_list() {}
    public var_list(String str1, string str2) {
        this.str1 = str1;

        this.str2=str2;
    }
//String m=;
    @Override
    public String toString() {
        return str1 + '[' +"'"+str2.name+ "'"+']';
    }
}
