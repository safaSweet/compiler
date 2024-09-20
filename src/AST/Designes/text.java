package AST.Designes;
import AST.Variables.string;
import AST.Variables.var_list;

public class text {
   var_list v;
   float num;
   string str=new string();
   string str2=new string();
    fontSize fs = new fontSize(num);
    fontWeight fw=new fontWeight();

text11 t3=new text11(str2);
text11 t1=new text11(fs,fw,str);
text2 t2=new text2(v);
String s33;

public text(){}

    public text(text11 t3) {
        this.t3 = t3;
    }

    public text(text11 t1, text2 t2) {
        this.t1 = t1;
        this.t2 = t2;

    }

    @Override
    public String toString() {
        if(t1!=null&&t2==null){
            return ""+t1;
        }
        else if(t2!=null&&t1==null){
            return ""+t2;
        }

        return "";
    }
}
