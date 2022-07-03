import java.util.Arrays;

public class AppRunner {

    public static void main(String[] args) {
        Address homeAddress = new Address("s1", null);
        Address officeAddress = new Address("s2", "Delhi");
        Employee employee = new Employee("Ajay", 101, Arrays.asList(homeAddress, officeAddress));

        String city = employee.getAddresses().get(0).getCity().toUpperCase();
        System.out.println(city);
    }
}
