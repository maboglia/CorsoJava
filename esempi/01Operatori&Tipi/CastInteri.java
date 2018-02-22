package esempi.week1;

public class CastInteri {

	public static void main(String[] args) {
		int i1 = 10, i2 = 255, i3 = 546;
		byte b1, b2, b3;
		
		b1 = (byte) i1;
		b2 = (byte) i2;
		b3 = (byte) i3;
		
		System.out.println("esempi di cast da int a byte");
		System.out.println("il cast di i1 " + i1 + " vale " + b1);
		System.out.println("il cast di i2 " + i2 + " vale " + b2);
		System.out.println("il cast di i3 " + i3 + " vale " + b3);

	}

}
