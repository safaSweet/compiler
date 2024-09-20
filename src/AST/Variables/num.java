package AST.Variables;

public class num extends var {
    int num;
    public String str;

    public num(int num, String str) {
        this.num = num;
        this.str = str;
    }
public num(){}
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
    @Override
    public String toString() {return  str + "=" + num;
    }
}
