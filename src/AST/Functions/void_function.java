package AST.Functions;


public class void_function  {

String name;
item_body_function item =new item_body_function();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void_function(String name, item_body_function item) {
        this.name = name;
        this.item = item;
    }
    public void_function() {}
    @Override
    public String toString() {
        return "function " + name + "(){" +
                 item +
                '}';
    }
}
