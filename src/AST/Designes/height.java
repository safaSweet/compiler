package AST.Designes;

import AST.Designes.design;

public class height extends design {
    int number ;

    public height() {
    }

    public height(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String generateCode() {
        return "height : " + number + ';';
    }
}
