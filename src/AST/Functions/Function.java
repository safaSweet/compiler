package AST.Functions;


import sun.applet.Main;

public class Function {

    void_function v = new void_function();
    build_function b=new build_function();


    public Function(void_function v, build_function b) {
        this.v = v;
        this.b = b;
    }

    public Function() {
    }

    @Override
    public String toString() {
        if(v!=null&&b==null)
        return "\n" +
                 v;
        else if(v==null&&b!=null)
            return "\n"+b;

        return "nul--";
    }
}
