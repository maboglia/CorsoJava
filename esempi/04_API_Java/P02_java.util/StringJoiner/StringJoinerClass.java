package com.example.java8;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {
	
	public static void main(String[] args) {
		
//		Crea un oggetto StringJoiner
		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.setEmptyValue("Ancora nessun nano");
		System.out.println(sj);
		
		sj.add("Pisolo")
			.add("Brontolo")
			.add("Gongolo");
		System.out.println(sj);
		
//		Merge su altre istanze StringJoiner
		StringJoiner sj2 = new StringJoiner(",");
		sj2.add("Eolo");
		
		sj.merge(sj2);
		System.out.println(sj);
		
//		Lavorando con le collections
		Set<String> set = new TreeSet<>();
		set.add("Italia");
		set.add("Francia");
		set.add("Germania");
		StringJoiner sj3 = new StringJoiner(" e ");
		set.forEach( s -> sj3.add(s));
		
		System.out.println(sj3);
	}
	
}
