package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSonDemo {

	public static void main(String[] args) {
		String jsonString = "";

		File f = new File("files/canzoni.json");
		Scanner sc;
		try {
			sc = new Scanner(f);
			
			StringBuilder sb = new StringBuilder();
			
			while (sc.hasNextLine()) {
				sb.append(sc.nextLine());
				System.out.println("..........");
			}
			
			GsonBuilder builder = new GsonBuilder();
			builder.setPrettyPrinting();
			
			Gson gson = builder.create();
			List<Cantante> cantante = gson.fromJson(sb.toString(), ArrayList.class);
			System.out.println(cantante);
			
			jsonString = gson.toJson(cantante);
			System.out.println(jsonString);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Cantante {
	private String cantante;

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	@Override
	public String toString() {
		return "Cantante [cantante=" + cantante + "]";
	}
	
}

