package AST.Functions;

import AST.Variables.variables;
import AST.if_condition;

public class item_body_function  {


    variables var=new variables();
    if_condition if_=new if_condition();
    setState set =new setState();

    public item_body_function(variables var, if_condition if_, setState set) {
        this.var = var;
        this.if_ = if_;
        this.set = set;
    }

    public item_body_function() {
    }

    @Override
    public String toString() {
        if(set!=null&&if_==null)
        return var+"\n"+set;
            else if(set==null&&if_!=null)
                return var+"\n"+if_;
                else return "__null_";
    }
}
