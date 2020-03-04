# Raccolta esercizi eccezioni

## Esercizio (1)
A partire dall'interfaccia Animale, che definisce
i metodi faiVerso() e dimmiCiboPreferito,
implementare le classi Gatto, Cane e Topo
attraverso l'uso delle interfacce.

## Esercizio (2)
A partire dalla classe Animale, che definisce i
metodi faiVerso(), implementare le classi Gatto,
Cane e Topo attraverso l'uso dell'astrazione.

## Esercizio (3)
Scrivere un programma che gestisca un'eccezione
di tipo ArithmeticException.

## Esercizio (4)
Scrivere un programma che lanci manualmente
un'eccezione.

## Esercizio (5)
Che cosa visualizza il programma seguente?
Provare ad eseguire il programma su carta e,
successivamente, verificare la risposta
eseguendo il programma su calcolatore:

public class Test{
	
	public static void test(){
		try{
			System.out.println("Dentro try esterno");
			try{
				System.out.println("Dentro try interno");
				throw new Exception();
			}catch(ArithmeticException e){
				System.out.println("Dentro catch interno");
			}finally{
				System.out.println("Dentro finally interno");
			}
		}catch(Exception e){
			System.out.println("Dentro catch esterno");
		}finally{
			System.out.println("Dentro finally esterno");
		}
	}
	
	public static void main(String[] args){
		test();
	}
}

## Esercizio (6)
Scrivere un programma che gestisca una
eccezione personalizzata.