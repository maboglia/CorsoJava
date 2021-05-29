import java.util.EnumSet;

public class Moto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (LeMoto moto: LeMoto.values()){
			System.out.printf("%s\t%s\t%s\n", moto, moto.getDesc(), moto.getCilindrata());
		}

		 for (LeMoto moto: EnumSet.range(LeMoto.moto3, LeMoto.moto5)){
		 	System.out.printf("%s\t%s\t%s\n", moto, moto.getDesc(), moto.getCilindrata());
		 }
	}

}
