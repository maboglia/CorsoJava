package esempio;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setNome("Mario Rossi");
		e1.setStipendio(1500.0);
		System.out.println("Nome: " + e1.getNome());
		System.out.println("Stipendio: " + e1.getStipendio());
		System.out.println(); // stampa riga vuota
		
		Employee e2 = new Employee("Mario Verdi", 1000.0);
		System.out.println("Nome: " + e2.getNome());
		System.out.println("Stipendio: " + e2.getStipendio());
		e2.aumentaStipendio(20);
		System.out.println("Nuovo stipendio: " + e2.getStipendio());
	}

}
