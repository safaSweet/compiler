package AST.Variables;

public class definition_DOT_text extends var{
String name;
String name2;

    public String getStr1() {
        return name;
    }

    public void setStr1(String str1) {
        this.name = str1;
    }

    public String getStr() {
        return name2;
    }

    public void setStr(String str) {
        this.name2 = str;
    }

    public definition_DOT_text(String name,String name2) {
        this.name = name;
        this.name2=name2;
    }
    @Override
    public String toString() {
        return
                 "\n const "+name + " = document.getElementById(\""+name2+"\").value.trim();"
                ;
    }
}
