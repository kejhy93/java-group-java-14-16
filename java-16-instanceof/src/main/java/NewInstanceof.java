public class NewInstanceof{
    public static void main(String[] args) {

        String text = "";
        Object o = text;

        if ( o instanceof String s) {
            System.out.println("o is String");
        }

    }
}