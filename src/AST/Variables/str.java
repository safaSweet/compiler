package AST.Variables;

public class str extends var {
    public String str1;
     string str=new string();

    public str(String str1, string str) {
        this.str1 = str1;
        this.str = str;
    }

    public str() {}

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
        this.str = str;
    }

    @Override
    public String toString() {return  str1 + "=" + "\" " + str + "\" " + ";";
    }
}
