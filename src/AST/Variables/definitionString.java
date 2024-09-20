package AST.Variables;

public class definitionString extends var{

    public String str1;
//    public String str;
    string str=new string();
string ss;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public string getStr() {
        return str;
    }

    public void setStr(string str) {
        this.ss = str;
    }


    public definitionString(String str1, string str) {
        this.str1 = str1;
        this.ss = str;
    }

    public definitionString() {
    }

    @Override
    public String toString() {

        return "let " + str1 + "=" + "\" " + ss + "\" " + ";";
    }
}
