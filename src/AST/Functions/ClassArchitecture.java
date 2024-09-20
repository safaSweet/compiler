package AST.Functions;

import AST.Functions.containClass;

public class ClassArchitecture {
    String name;
    String type;
    containClass c = new containClass();

    public ClassArchitecture() {
    }

    public ClassArchitecture( containClass c,String name) {
         this.name=name;
        this.c = c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public containClass getC() {
        return c;
    }

    public void setC(containClass c) {
        this.c = c;
    }

    public String getNAME()  {
        return name;
    }

    @Override
    public String toString() {
        return c+"";}

}
