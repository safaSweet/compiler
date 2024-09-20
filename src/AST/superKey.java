package AST;

public class superKey {
    String name1, name2, name3, name4;

    public superKey() {
    }

    public superKey(String name1, String name2, String name3, String name4) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }

    @Override
    public String toString() {
        return "const" + name1 + "( { key ?" +
                name2 + "} ) : super (" +
                name3 +
                ":" + name4 + ");";
    }
}
