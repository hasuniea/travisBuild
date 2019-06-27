public class TestValue {
    public static void main(String[] args) {
        String value= "test build";
      //  String obj = new String();
        getName();
        int x=0;
        int y = x;
        System.out.println("value");



    }

    public static String getName() {
        String value = "generate name";
        return value;
    }

    public static void setName(String name) {
        System.out.println("name should be"+ name);
    }
}
