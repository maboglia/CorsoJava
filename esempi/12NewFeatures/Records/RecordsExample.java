package records;

import java.util.Arrays;
import java.util.List;

//Employee Record
record Employee1(String name, int id, List<Address1> addresses){
static  int sal;
}
//Address Record
record Address1(String street, String city){}

public class RecordsExample {

    public static void main(String[] args) {
        Address1 add1 = new Address1("s1", "Fazilka");
        Address1 add2 = new Address1("s2", "Delhi");
        Employee1 e1 = new Employee1("Ajay", 101, Arrays.asList(add1, add2));

        System.out.println("City name is -->" + e1.addresses().get(0).city());
    }
}
