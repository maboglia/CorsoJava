package esempio;

public class Oggetto implements Comparable {
	private int i = 100;

	public String toString() {
		// return "Il mio oggetto. " + super.toString();
		return "Il mio oggetto contiene " + i;
	}
	
	public void setI(int newI) {
		i = newI;
	}
	
	public int getI() {
		return i;
	}

	public int compareTo(Object o) {
		// CAST: Object viene forzato ad Oggetto
		Oggetto og = (Oggetto)o;
		if (i < og.getI()) {
			return -1; // i minore di og.i
		} else if (i > og.getI()) {
			return 1; // i maggior di og.i
		}
		return 0; // i uguale a og.i
	}
}
