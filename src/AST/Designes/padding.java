package AST.Designes;

public class padding extends design{
   int num;
String str1;
String str2;

    public padding(int num, String str1, String str2) {
        this.num = num;
        this.str1 = str1;
        this.str2 = str2;
    }

    public padding(){}
    @Override
    public String toString() {
        if(str1==null &&str2==null){
            return "padding :"+num+"px ";
        }
        else if(str1!=null&&str2==null){
        return "padding-top : "+num+"px ";
        }
        else if(str2!=null &&str1==null)
            return "padding-bottom : "+num+"px ";
else
    return "";



    }
}
