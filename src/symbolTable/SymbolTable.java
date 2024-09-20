package symbolTable;



import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    List <Row> rows= new ArrayList<Row>();
    public boolean hasSyntaxError=false;
    public boolean hasSemanticError=false;
    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

  public void print(){
        for(int i =0;i<rows.size();i++)
        {
            if(rows.get(i)!=null)
            {
                System.out.println(rows.get(i).getType() + "\t\t\t\t"+rows.get(i).getValue());
            }
        }
  }




//getValue    public void error(){
//        for(int i =0;i<rows.size();i++)
//        {
//            if(rows.get(i)!=null)
//            {
//                if(rows.get(i).getType() && rows.get(i).getValue())
//                System.out.println(rows.get(i).getType() + "\t\t\t\t"+rows.get(i).getValue());
//            }
//        }
//    }
private static SymbolTable single_instance = null;
public static SymbolTable getInstance()
{
    if (single_instance == null)
        single_instance = new SymbolTable();

    return single_instance;
}




}
