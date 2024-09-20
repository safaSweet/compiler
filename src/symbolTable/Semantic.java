package symbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Semantic {
    SymbolTable sT = new SymbolTable();


    public SymbolTable getsT() {
        return sT;
    }

    public void setsT(SymbolTable sT) {
        this.sT = sT;
    }


  public  boolean check(){
      if(!check_is_found(this.sT)){

          System.out.println("**************Exception The Name is found before **************");
          return false;
      }
//
    else    if(!String_is_found(this.sT)){
            System.out.println("*************Excerption Name must came first************");


     return false;

        }
      else    if(!values_variables(this.sT)){
          System.out.println("***********Excerption Invalid type*************** ");


          return false;

      }
      else    if(!values_variable(this.sT)){
          System.out.println("************Excerption this value not **************");


          return false;

      }
      else    if(!values_variabl(this.sT)){
          System.out.println("****************Excerption this value not ****************");


          return false;

      }
   else     return true;

    }

    boolean values_variabl (SymbolTable  Sy){
        for(int i =0;i<Sy.rows.size();i++)
        {
            if(Sy.rows.get(i)!=null)
            {

                if(Sy.rows.get(i).getType().contains("name_int")){Sy.rows.get(i).getValue().contains("value_int");return  true;}

            }

        }
        return  false;
    }

    boolean values_variables (SymbolTable  Sy){
        for(int i =0;i<Sy.rows.size();i++)
        {
            if(Sy.rows.get(i)!=null)
            {

       if(Sy.rows.get(i).getType().contains("text_dot")){

           Sy.rows.get(i).getValue().contains("valueText_dot");

           return  true;}

            }

        }
        return  false;
    }
    boolean values_variable (SymbolTable  Sy){
        for(int i =0;i<Sy.rows.size();i++)
        {
            if(Sy.rows.get(i)!=null)
            {

if(Sy.rows.get(i).getType().contains("name_bool")){
    Sy.rows.get(i).getValue().contains("value_bool");

    return  true;}

            }

        }
    return  false;
    }


    boolean String_is_found (SymbolTable  Sy){
        for(int i =0;i<Sy.rows.size();i++)
        {
            if(Sy.rows.get(i)!=null)
            {
                     if(!Sy.rows.get(0).getType().contains("function")&&
                        !Sy.rows.get(0).getType().contains("name_bool")&&
                        !Sy.rows.get(0).getType().contains("text_dot")&&
                        !Sy.rows.get(0).getType().contains("name_class")&&
                        !Sy.rows.get(0).getType().contains("name_list")&&
                        !Sy.rows.get(0).getType().contains("value_bool")&&
                             !Sy.rows.get(0).getType().contains("valueText_dot")&&
                !Sy.rows.get(0).getType().contains("container"))

                       {
//                           System.out.println(Sy.rows.get(i).getType());

                           return false; }
            }
        }
        return  true;
    }
    boolean check_is_found (SymbolTable  Sy){

        for(int i =0;i<Sy.rows.size();i++)
        {

            if(Sy.rows.get(i)!=null)
            {
                for(int j=Sy.rows.size()-1;j>i;j--)

                if(Sy.rows.get(j).getValue().equals(Sy.rows.get(i).getValue()))

                {

                    return false;
                }

            }
        }
        return  true;
    }




    public ArrayList<String> Errors=new ArrayList<>();

    public void checkErrors()  {
        if (!sT.hasSyntaxError) {
            check();
        }
        if (!Errors.isEmpty()){
           sT.hasSemanticError=true;
        }try{
        for (int i=0;i<Errors.size();i++){

            FileWriter test = new FileWriter("src//output//hjk.txt");
            test.write(Errors.get(i));
            test.close();}

        }
        catch (Exception e){
            System.out.println(e);}
    }





}
