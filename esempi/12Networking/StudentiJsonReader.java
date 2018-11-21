package myutil;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StudentiJsonReader {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		 
        try {
            String fileJSON = "test_files/dario_mennillo.json";
            Object obj = parser.parse(new FileReader( fileJSON ));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String nome = (String) jsonObject.get("nome");
            String cognome = (String) jsonObject.get("cognome");
            JSONArray skills = (JSONArray) jsonObject.get("skill");
 
            System.out.println("Nome: " + nome);
            System.out.println("Cognome: " + cognome);
            System.out.println("\nSkills:");
            Iterator<String> iterator = skills.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
