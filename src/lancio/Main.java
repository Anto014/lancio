package lancio;
import java.util.Scanner;

import oggetti.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int scelta;
		boolean continua = true;
		
		OggettoLanciato ogg;
		
		do {
		
			System.out.println("Premi 1 per DADO, 2 per MONETA: ");
			scelta = input.nextInt();
			
				switch(scelta) {
					
					case 1:
						//dado
						ogg = new Dado();
						ogg.lancio();
						ogg.stampa();
					break;
					
					case 2:
						//moneta
						ogg = new Moneta();
						ogg.lancio();
						ogg.stampa();
					break;
					
					
					default:
						System.out.println("Inserisci un valore corretto");
						
					break;
				}
			
			System.out.println("Continuare? [s/altro]");
			String risposta = input.next();
			
			if(risposta.equals("s")) {
				continua = true;
			} 
				
			else { 
				continua = false;
			}	
		
		} while(continua);
		
		System.out.println("Fine");
		input.close();
		
	}

}
