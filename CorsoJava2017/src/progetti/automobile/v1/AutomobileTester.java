package progetti.automobile.v1;

public class AutomobileTester {

	public static void main(String[] args) {
		Automobile a = new Automobile("Fiat", "500", 1.4);
		a.setVelocitaMassima(180);
		// passo il nome e l'automobile creata in precedenza
		Guidatore g = new Guidatore("Mario Rossi", a);
		Scanner sc = new Scanner(System.in);
		boolean devoUscire = false;

		while (devoUscire != true) { // eseguito fino a comando q
			System.out.println("Inserisci comando:");
			String cmd = sc.next();

			if (cmd.equals("q")) {
				devoUscire = true;
			} else if (cmd.equals("sali")) {
				// verifico se in auto
				if (g.isInAuto() && a.getVelocita() == 0) {
					System.out.println("Sei già in auto!");
				} else { // salgo
					g.sali();
					System.out.println("Sei salito.");
				}
			} else if (cmd.equals("scendi")) {
				// verifico se sono in auto
				if (g.isInAuto() && a.getVelocita() == 0) {
					g.scendi();
					System.out.println("Sei sceso.");
				} else {
					System.out.println("Devi essere in auto per scendere");
				}
			} else if (cmd.equals("accendi")) {
				if (g.isInAuto() && a.getVelocita() == 0) {
					g.accendiAuto();
					System.out.println("Hai acceso l'auto");
				} else {
					System.out.println("Devi salire per accendere");
				}
			} else if (cmd.equals("spegni")) {
				if (g.isInAuto() && a.isAccesa() && a.getVelocita() == 0) {
					g.spegniAuto();
					System.out.println("Hai spento l'auto");
				} else {
					System.out.println("Non puoi spegnere se non in auto e non accesa");
				}
			} else if (cmd.equals("accelera")) {
				if (g.isInAuto() && a.isAccesa()) {
					System.out.println("Inserisci di quanto accelerare:");
					int kmh = sc.nextInt();
					g.acceleraAuto(kmh); // accelero
					System.out.println("Hai accelerato di " + kmh + "km/h");
					System.out.println("Stai viaggiando a " + a.getVelocita() + "km/h");
				} else {
					System.out.println("Devi essere in auto e deve essere accesa");
				}
			} else if (cmd.equals("frena")) {
				if (g.isInAuto() && a.isAccesa()) {
					System.out.println("Inserisci di quanto frenare:");
					int kmh = sc.nextInt();
					g.frenaAuto(kmh);
					System.out.println("Hai frenato di " + kmh + "km/h");
					System.out.println("Stai viaggiando a " + a.getVelocita() + "km/h");
				} else {
					System.out.println("Devi essere in auto e deve essere accesa");
				}
			} else if (cmd.equals("stato")) {
				System.out.println("Nome: " + g.getNome());
				System.out.println("Auto: " + a.getMarca() + " " 
									+ a.getModello() + " " + a.getCilindrata());
				System.out.println("Velocità corrente: " + a.getVelocita() + " km/h");
			}
		}

		sc.close();


	}

}
