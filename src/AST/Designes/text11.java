package AST.Designes;


import AST.Variables.string;

public class text11  {
    int n;
fontSize fs = new fontSize(n);
fontWeight fw=new fontWeight();
string str=new string();

    public text11(fontSize fs, fontWeight fw, string str) {
        this.fs = fs;
        this.fw = fw;
        this.str = str;
    }
    public text11(string str){this.str=str;}

    public text11() {
    }

    @Override
    public String toString() {
        if(fs!=null&&fw!=null)
        return "<p "+"style = "+"\"  "+fs+fw +"\"  "+">" +str+
                "</p>";
        else if (fs==null&&fw==null) {
            return str+"";

        }
        return "text1 null";
    }
}