public class UsageOfRecordClass {
    public static void main(String[] args) {
        RecordClass a = new RecordClass("A", "B");

        System.out.println("====== RecordClass a ==========");
        System.out.println("a.firstName=" + a.firstName());
        System.out.println("a.firstName=" + a.lastName());
        System.out.println("a.toString \"" + a.toString() + "\"");
    }
}
