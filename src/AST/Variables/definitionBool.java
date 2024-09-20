package AST.Variables;

public class definitionBool extends var{


        public boolean str1;
        public String str;

    public boolean isStr1() {
        return str1;
    }

    public void setStr1(boolean str1) {
        this.str1 = str1;
    }

    public boolean getStr1() {
        return str1;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

        public definitionBool(String str, boolean str1) {
            this.str1 = str1;
            this.str = str;
        }

@Override
public String toString()  {
            return  "let "+str + " = " + str1 + ";";
        }
    }




