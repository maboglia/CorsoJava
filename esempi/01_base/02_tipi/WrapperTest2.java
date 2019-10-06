package esempio;

public class WrapperTest2 {

	public static void main(String[] args) {

        byte b = 127;
        System.out.println("Byte: " + b);

        if (b < Byte.MAX_VALUE) {
            b++;
        }

        System.out.println("Byte: " + b);        

	}

}
