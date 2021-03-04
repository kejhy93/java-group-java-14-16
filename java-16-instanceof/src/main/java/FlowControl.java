public class FlowControl {

    static String s ="a";

    public static void main(String[] args) {
        
        Object o = "A";

        System.out.println("isString1()");
        isString1(o);
        System.out.println("isString2()");
        isString2(o);
        System.out.println("isString3()");
        isString3(o);
        isString3(new java.util.ArrayList());
    }

    public static void isString1(Object o) {
        if (!(o instanceof String s)){
            throw new RuntimeException();
        }
        // s is in scope
        System.out.println(s);
    }

    public static void isString2(Object o) {
        if (o instanceof String s){
            System.out.println("s in instaceof block = " + s);
        }
        // s is not in scope
        System.out.println("s outside of instaceof block = " + s);
    }
    public static void isString3(Object o) {
        if (o instanceof String s){
            System.out.println("s in instaceof block = " + s);
        } else {
            System.out.println("s in instaceof block = " + s);
        }
    }

}
