package AST.Variables;

public class definitionNumber extends var{

    int num;
    public String str;

    public definitionNumber(int num, String str) {
        this.num = num;
        this.str = str;
    }
    public definitionNumber(){}
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    //    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    public String getStr() {
//        return str;
//    }
//
//    public void setStr(String str) {
//        this.str = str;
//    }
@Override
public String toString() {return  "let "+str + "=" + num;
    }
}

