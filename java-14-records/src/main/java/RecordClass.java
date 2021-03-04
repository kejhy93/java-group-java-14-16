public record RecordClass(String firstName, String lastName) {
    public RecordClass {
        Objects.requireNonNull(firstName, "First name is empty");
        Objects.requireNonNull(lastName, "Last name is empty");
    }

    public RecordClass(String firstName) {
        this(firstName, "Unnamed");
    }

    public RecordClass() {
        this("Unnamed");
    }
}
