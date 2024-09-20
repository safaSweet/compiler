package AST.Variables;

public class List_Map {

    map m=new map();
add_list_to_var add=new add_list_to_var();

    public List_Map(map m, add_list_to_var add) {
        this.m = m;
        this.add = add;
    }

    public List_Map() {
    }
    @Override
    public String toString() {
        if(m!=null&&add==null)
        return ""+ m;
        else if (m==null&&add!=null) {
            return ""+add;
        }
        else  return "null__";
    }
}
