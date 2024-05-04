package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class LeggiFileDiTesto {

	public static void main(String[] args) {

		File f = new File("files/hit-estate-2022.txt");
		File output = new File("files/hit-estate-2022.json");
		Scanner sc;
		List<Canzone> canzoni = new ArrayList<>();
		try {
			sc = new Scanner(f);
			
			while (sc.hasNextLine()) {
				String riga = sc.nextLine();
				String[] split = riga.split("\\|");
				Canzone c = new Canzone();
				c.setCantante(split[0]);
				c.setCanzone(split[1]);
				canzoni.add(c);
				
			}
			
			GsonBuilder builder = new GsonBuilder();
			builder.setPrettyPrinting();
			
			Gson gson = builder.create();
			
			String jsonString = gson.toJson(canzoni);
			
			PrintWriter pw = new PrintWriter(output);
			pw.println(jsonString);
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class Canzone{
	
	private String cantante;
	private String canzone;
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	public String getCanzone() {
		return canzone;
	}
	public void setCanzone(String canzone) {
		this.canzone = canzone;
	}
	@Override
	public String toString() {
		return "Canzone [cantante=" + cantante + ", canzone=" + canzone + "]";
	}
	
	
	
}