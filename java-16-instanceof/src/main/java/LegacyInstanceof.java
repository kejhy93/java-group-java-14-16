public class LegacyInstanceof{
    public static void main(String[] args) {

        String text = "";
        Object o = text;

        if ( o instanceof String ) {
            String s = (String) o;
            System.out.println("o is String");
        }

    }
}