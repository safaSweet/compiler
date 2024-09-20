package AST;

public class text_editor_controller {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public text_editor_controller(String name) {
        this.name = name;
    }

    public text_editor_controller() {
    }

    @Override
    public String toString() {
        return " const "+name+ "= document.getElementById(\""+name+"\").value.trim(); "
        ;
    }
}
