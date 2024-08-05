class String {
    private String value;

    public String(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class str {
    public static void main(String args[]){
        String myString = new String("hgqjhwb");
        System.out.println(myString.getValue());
    }
}
