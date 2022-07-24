package com.example.java8;

public class JoinerMethod {

	public static void main(String[] args) {

		String nani = String.join(" e ", "Pisolo", "Mammolo", "Gongolo");
		System.out.println(nani);
		
		String[] stati = {"Italia", "Spagna", "Portogallo"};
		String statiUniti = String.join(",", stati);
		System.out.println(statiUniti);
		
	}		
}
