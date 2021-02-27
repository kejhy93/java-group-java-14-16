public class PersonLegacy {
    private final String name;
    private final String address;

    public PersonLegacy(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object object) {
        if (this==object){
            return true;
        }
        else if(!(object instanceof PersonLegacy)) {
            return false;
        } else {
            PersonLegacy other = (PersonLegacy) object;
            return Objects.equals(name, other.name) && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "PersonLegacy [name=" + name + ", address=" + address +"]";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}