package AST.Variables;

public class map {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public map(String name) {
        this.name = name;
    }

    public map() {
    }

    @Override
    public String toString() {
        return "const "+
                 name  +'='+
                "[];";
    }
}
