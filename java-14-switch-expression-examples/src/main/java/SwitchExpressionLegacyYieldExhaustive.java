public class SwitchExpressionLegacyYieldExhaustive {

    public static void main(String[] args) {
        String s = "FooBar";
        int result = switch (s) {
            case "Foo"-> { 
                yield 1;
            }
            case "Bar"-> {
                throw new RuntimeException();
            }
            default -> {
                System.out.println("Neither Foo nor Bar, hmmm...");
                yield 0;
            }
        };
        System.out.println("result=" + result);
    }
}