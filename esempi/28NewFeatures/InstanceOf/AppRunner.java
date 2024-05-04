import java.util.Arrays;

public class AppRunner {

    public static void main(String[] args) {
        Address homeAddress = new Address("s1", null);
        Address officeAddress = new Address("s2", "Delhi");
        Employee employee = new Employee("Ajay", 101, Arrays.asList(homeAddress, officeAddress));

        Object obj = employee.getAddresses().get(0);
        //Using pattern Variable for instanceof
        if(obj instanceof Address address && address.getCity().equals("Delhi")){
        }
    }
}
