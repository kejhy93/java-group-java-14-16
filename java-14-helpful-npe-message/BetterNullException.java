public class BetterNullException {
    public static void main(String[] args) {
        BetterNullException bne = new BetterNullException();
        bne.start();

    }

    public void start() {
            A a = new A();
            a.aString ="A";
        
            System.out.println("a.aString="+a.aString);
            System.out.println("a.aInteger="+a.aInteger);

            a.getB().run();
    }

    class A {
        String aString;
        Integer aInteger;
        B b;

        public B getB() {
            return b;
        }
    }

    class B {
        public void run(){}
    }
}