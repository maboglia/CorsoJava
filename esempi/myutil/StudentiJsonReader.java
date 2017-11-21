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
 
            Object obj = parser.parse(new FileReader(
                    "test_files/dario_mennillo.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String name = (String) jsonObject.get("nome");
            String author = (String) jsonObject.get("cognome");
            JSONArray companyList = (JSONArray) jsonObject.get("skill");
 
            System.out.println("Nome: " + name);
            System.out.println("Cognome: " + author);
            System.out.println("\nSkills:");
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
