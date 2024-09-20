package AST;

public class attribute {
    String type ;
    String attribute;

    public attribute() {
    }

    public attribute(String type, String attribute) {
        this.type = type;
        this.attribute = attribute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return
                type +" "+
                        attribute ;
    }
}
