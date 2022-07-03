import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private int id;
    private List<Address> addresses;

    public Employee(String name, int id, List<Address> addresses) {
        this.name = name;
        this.id = id;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                name.equals(employee.name) &&
                addresses.equals(employee.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, addresses);
    }
}
