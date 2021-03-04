public class Main {
    
    public static void main (String[] args) throws InterruptedException {

        System.out.println("Hello World");
        int a = 0;

        while(a < 100) {
            System.out.println("a=" + a);
            a++;
            Thread.sleep(1000);
        }

    }

}
