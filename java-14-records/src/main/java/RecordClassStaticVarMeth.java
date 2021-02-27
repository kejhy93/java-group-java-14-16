public record PersonStat (String name, String address) {
    public static String UNKNOWN_ADDRESS = "Unknown";

    public static void PersonStat generateUnnamedPerson(String address) {
        return new PersonStat("Unnamed", address);
    }
}