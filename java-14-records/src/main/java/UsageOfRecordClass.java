public class UsageOfRecordClass {
    public static void main(String[] args) {
        RecordClass a = new RecordClass("A", "B");

        System.out.println("====== RecordClass a ==========");
        System.out.println("a.firstName=" + a.firstName());
        System.out.println("a.firstName=" + a.lastName());
        System.out.println("a.toString \"" + a.toString() + "\"");

        RecordClass b = new RecordClass("C", "D");
        RecordClass c = new RecordClass("A", "B");
        
        System.out.println("====== RecordClass equals ==========");
        System.out.println("equals(a,b) = equals(\"" + a.toString() + "\", \"" + b.toString() +
                "\") = " + a.equals(b));
        System.out.println("equals(a,c) = equals(\"" + a.toString() + "\", \"" + c.toString() +
                "\") = " + a.equals(c));
    }
}
