package esempi.week1;

public class Pitagora {

	public static void main(String[] args) {
		
		int[][] prodotto = new int[10][];
		
		int i, j;
		
		for (i=0;i<10;i++)
			prodotto[i] = new int[ i + 1 ];
		
		for(i=0;i<10;i++)
			for(j=0;j<=i;j++)
				prodotto[i][j] = (i+1) * (j+1);
		System.out.println(prodotto[0][0]);
		
		for(i=0;i<2;i++) System.out.print(prodotto[1][i] + " ");
		System.out.println();
		
		for(i=0;i<3;i++) System.out.print(prodotto[2][i] + " ");
		System.out.println();
		
		for(i=0;i<4;i++) System.out.print(prodotto[3][i] + " ");
		System.out.println();
		
		for(i=0;i<5;i++) System.out.print(prodotto[4][i] + " ");
		System.out.println();
		
		for(i=0;i<6;i++) System.out.print(prodotto[5][i] + " ");
		System.out.println();
		
		for(i=0;i<7;i++) System.out.print(prodotto[6][i] + " ");
		System.out.println();
		
		for(i=0;i<8;i++) System.out.print(prodotto[7][i] + " ");
		System.out.println();
		
		for(i=0;i<9;i++) System.out.print(prodotto[8][i] + " ");
		System.out.println();
		
		for(i=0;i<10;i++) System.out.print(prodotto[9][i] + " ");
		System.out.println();
		

	}

}
