package AST.Variables;

public class valueObject extends variables {//extends variables
    public String str1;
    public String str2;



    public valueObject() {
    }

    public valueObject(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;

    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

@Override
public String toString() {

        return str1+':'+str2;

    }


}
