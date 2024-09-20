package AST;

import AST.Variables.string;

public class objects {
    string name1;
//            =new
//            string(name);
    String name2;
  public  String name;

    public objects(string name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return
                 name1+ " : " +
                 name2
                ;
    }
}
