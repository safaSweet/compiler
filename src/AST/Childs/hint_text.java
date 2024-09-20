package AST.Childs;


import AST.Variables.string;

public class hint_text {
    string hint=new string();;

    public hint_text(string hint) {
        this.hint = hint;
    }

    public hint_text() {
    }

    @Override
    public String toString() {
        return "placeholder= \"" +
                 hint +"\"";
    }
}
