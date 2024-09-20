package AST;

public class element {
    String key;
    String value;

    public element(String key, String value
    ) {
        this.key = key;
        this.value = value;
    }
    public element(){}

    @Override
    public String toString() {
        return
               '\"'+  key +'\"' + ':' +'\"'+ value +'\"' ;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
