package AST.Designes;

public class fontSize extends design{
float num;

    public fontSize(float num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "font-size:" +
                 num +
                "px ;"; }
}
