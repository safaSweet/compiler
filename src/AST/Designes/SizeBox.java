package AST.Designes;

public class SizeBox extends design{
float  num;

    public SizeBox(float num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "height : " +
                 num +
                ';';
    }
}
