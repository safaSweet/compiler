package AST.Variables;

public class string {
    public String name;

    public string(String name) {
        this.name = name;
    }

    public string() {
    }
    public String getStr1() {
        return name;
    }

    public void setStr1(String str1) {
        this.name = str1;
    }

    @Override
    public String toString() {
        return name;
    }
}
