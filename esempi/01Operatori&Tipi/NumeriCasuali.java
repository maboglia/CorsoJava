package it.unibs.fp.mylib;

import java.util.*;

public class NumeriCasuali {
	
	private static Random estrattore = new Random();
	
	public static int estraiIntero(int min, int max)
	{
		 int range = max + 1 - min;
		 int casual = estrattore.nextInt(range);
		 return casual + min;
	}

}
