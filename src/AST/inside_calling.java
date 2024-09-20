package AST;

import AST.Variables.valueObject;

public class inside_calling {
    valueObject v=new valueObject();
//    num n=new num();
String str;

    public inside_calling(valueObject v, String str) {
        this.v = v;
//        this.n = n;
        this.str = str;
    }

    public inside_calling() {
    }

    @Override
    public String toString() {

        if(v!=null&&str==null){
            return "{"+v+"}";
        }

        return "inside_calling{" +
                "v=" + v +

                ", str='" + str + '\'' +
                '}';
    }
}
