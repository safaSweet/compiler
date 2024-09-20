package AST.Designes;

import AST.Designes.design;

public class width extends design {
    int number ;

    public width() {
    }

    public width(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "width : " +
                 number +
                ';';
    }

}
