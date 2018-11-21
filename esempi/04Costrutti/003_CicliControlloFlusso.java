/*****************************************/
Cicli e istruzioni di controllo
/*****************************************/
01 - IfAnnidati.java
02 - Asterischi.java
03 - Asterischi2.java
04 - Asterischi3.java
05 - CodiceInaccessibile.java
06 - CodiceInaccessibile2.java
/*****************************************/
// Esempio di if annidati
class IfAnnidati{
	public static void main(String args[]){
		int i = 18;
		if (i%2 == 0){
			System.out.print(i + " e' un multiplo di 2 ");
			if (i%3 == 0)
				System.out.println("e di 3");
			else
				System.out.println("");
		}
	}
}

// Generazione di un motivo decorativo
class Asterischi{
	public static void main(String args[]){
		int num = 20;
		do{
			for(int j = 0; j <= num; j++) System.out.print("*");
			System.out.println("");
		} while(--num >= 0);
	}
}

// Realizzazione di un secondo motivo decorativo
class Asterischi2{
	public static void main(String args[]){
		int num = 20;
		do{
			if((num%3 == 0) ||(num%3 == 1)) continue;
			for(int j = 0; j <= num; j++)System.out.print(".*");
			System.out.println("");
		} while(--num >= 0) ;
	}
}
// Sostituzione di un ciclo do-while con un ciclo for
class Asterischi3{
	public static void main(String args[]){
		for(int num = 20; num >= 0; num--){
			if((num%3 == 0) ||(num%3 == 1)) continue;
                        for(int j = 0;j <= num; j++)System.out.print(".*");
			System.out.println("");
		}
	}
}
// Codice non compilabile
class CodiceInaccessibile{
	public static void main(String args[]){
		System.out.println("Codice accessibile");
		return;
		System.out.println("Codice inaccessibile");
	}
}

// Inganno al compilatore
class CodiceInaccessibile2{
	public static void main(String args[]){
		System.out.println("Codice accessibile");
		if(true)return;
		System.out.println("Codice inaccessibile");
	}
}


/**********************************ALTRIESEMPI****************************/
        String[] mesi = {
                "Gennaio",
                "Febbraio",
                "Marzo",
                "Aprile",
                "Maggio",
                "Giugno",
                "Luglio",
                "Agosto",
                "Settembre",
                "Ottobre",
                "Novembre",
                "Dicembre",
        };

        //se conosco a priori il numero di iterazioni
/*        for (int i = 0; i < mesi.length; i++) {
            System.out.println("mese: " + mesi[i]);
            String risposta= getInput("Ti piace il mese di " + mesi[i]);
            System.out.println(risposta);
        }
        */
        //anche per scorrere l'array al contrario
/*
        for (int i = mesi.length -1; i>=0; i-- ){

            if(i % 2 != 0)
            System.out.println("mese:  "+ mesi[i]+"[" +  i +"]");

        }

*/

/*        for (String m : mesi ) {
            System.out.println(m);
        }*/

        int counter = 0;
        while(counter < mesi.length){
            System.out.println("il valore di contatore è" + counter);
            System.out.println("il valore di mese è" + mesi[counter]);
            counter++;
        }

        boolean sentinella = false;

/*
        while(sentinella == false){

            String s =getInput("Inserisci un numero");
            System.out.println(s);
            if (s.equals("esci"))
                sentinella = true;

        }
*/
;
        do{

            String s =getInput("Inserisci un numero");
            System.out.println(s);
        }
        while(sentinella == true);




        int mese = 3;
        //dichiaro oggetto stringa
        String meseStringa;

        //dichiaro un'oggetto di tipo scanner
        Scanner sc = new Scanner(System.in);

        //messaggio
        System.out.println("Inserisci inserisci una stringa di 3 lettere abbreviazione mese in cui siamo");
/**/        String input = sc.nextLine();
        try {
            mese = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Hai inserito un numero, dovevi inserire");
            //e.printStackTrace();
        }


        //valorizzo stringa con input dell'utente
         meseStringa = sc.nextLine();

        if(meseStringa.equals("esci"))
            System.out.println("programma terminato");



        //if... else if... else
//        if (mese >=1 && mese <=3){
//            System.out.println("Sei nel 1° trimestre");
//        }
//
//        else if (mese >=4 && mese <=6){
//            System.out.println("Sei nel 2° trimestre");
//        }
//        else if (mese >=7 && mese <=9){
//            System.out.println("Sei nel 3° trimestre");
//        }
//        else if (mese >=10 && mese <=12){
//            System.out.println("Sei nel 4° trimestre");
//        }
//        else {
//            System.out.println("Questo valore è sconosciuto");
//        }

//        switch (mese){
//
//            case 1:
//            case 2:
//            case 3:
//                //System.out.println("gennaio");
//                System.out.println("siamo nel 1 trimestre");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("siamo nel 2 trimestre");
//                break;
//            default:
//                System.out.println("inserisci un numero tra 1 e 2");
//                break;
//
//
//        }

            //dalla versione 7 possso utilizzare le stringhe
        switch (input){

            case "Gen":
                System.out.println("gennaio");
                break;
            case "Feb":
                System.out.println("febbraio");
                break;
            case "Mar":
                System.out.println("marzo");
                break;
            case "Apr":
                System.out.println("aprile");
                break;

            //.....

            default:
                System.out.println("inserisci una stringa di 3 lettere");
                break;


        }

