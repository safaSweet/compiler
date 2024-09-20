package AST;

import java.util.ArrayList;

public class functionAttribute {

    ArrayList<attribute> attributes;
    String type;
    String name;


    public functionAttribute() {

    }

    public functionAttribute(String type, String name) {
        this.type = type;
        this.attributes = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<attribute> attributes) {
        this.attributes = attributes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder strbul = new StringBuilder();
        if (attributes.size() != 0 && (type != null)) {
            for (attribute a : attributes) {
                strbul.append(a);
                strbul.append(",");
            }
            return type + " " + name + "," + strbul;
        } else return " ";
    }
    public void add(attribute a) {
        this.attributes.add(a);
    }

}
