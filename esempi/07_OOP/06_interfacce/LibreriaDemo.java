package interfacce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class MioComparatorePagine implements Comparator<Libro>{
//
//	@Override
//	public int compare(Libro libro1, Libro libro2) {
//		// TODO Auto-generated method stub
//		return libro1.getPagine() - libro2.getPagine();
//	}
//	
//}


public class LibreriaDemo {

	public static void main(String[] args) {


		List<Libro> libri = new ArrayList<>();
		
		libri.add(new Libro(1, "Zanna Bianca", 10, 50));
		libri.add(new Libro(2, "Anna Bianca", 15, 40));
		libri.add(new Libro(3, "Panna Bianca", 7, 80));
		libri.add(new Libro(4, "Canna Bianca", 18, 30));
		libri.add(new Libro(5, "Lalla Bianca", 16, 42));
		
//		for (int i = 0; i < libri.size(); i++) {
//			if (libri.get(i).getPrezzo()<16)
//				System.out.println(libri.get(i));
//		}
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}
		
//		Comparator<Libro> mc = (o1, o2) -> o1.getPagine() - o2.getPagine();
		
//		Collections.sort(libri, (o1, o2) -> o1.getPagine() - o2.getPagine());
		
		
		libri
			.stream()
			.sorted((o1, o2) -> o1.getPagine() - o2.getPagine())
			.filter(l -> l.getPrezzo()<16 )
//			.filter(l -> l.getPrezzo()>7 )
			.forEach(l -> System.out.println(l));
		
		
		List<String> titoli = libri.stream().map(l -> l.getTitolo()).collect(Collectors.toList());
		
		

	}

}
