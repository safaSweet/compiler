package AST.Designes;

public class background_color extends design {
int num1;
int num2;
int num3;


    public background_color(){}

    public background_color(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public String toString() {
        return "background-color : rgb(" +
                num1+',' + num2 +','+num3 + ");";
    }

}
