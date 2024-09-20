package AST.Childs;

public class text_field extends childTYPE{

    String id;
    hint_text hint=new hint_text();

    public text_field(String id, hint_text hint) {
        this.id = id;
        this.hint = hint;
    }

    @Override
    public String toString() {

        return   "<input type=\"text\" id=\"" +
                id +"\" "+
               hint +"style=\" margin-bottom:5px \""+
                "> " +
                "\n " +
                "<br>";
    }
}
