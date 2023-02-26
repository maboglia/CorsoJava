package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamString {

	static class Comune {
		String nome;
		int popolazione;
		public Comune(String nome, int pop) {
			this.nome = nome;
			this.popolazione = pop;
		}
		public void stampa() {
			System.out.println("Il nome del comune è: " + nome);
		}
	}
			
	public static void main(String[] args) {

		List<Comune> comuni = Arrays.asList(new Comune[]{
				new Comune("torino", 1_000_000),
				new Comune("milano", 3_000_000),
				new Comune("napoli", 1_500_000)
		});
		
		comuni.stream()
			.forEach(Comune::stampa);//method reference
		
		comuni.stream()
			.mapToInt(c -> c.popolazione)
			.average()
			.ifPresent(System.out::println);;
		
	}

}
