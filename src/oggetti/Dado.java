package oggetti;

import java.util.Random;

public class Dado extends OggettoLanciato 
{
	public int lancio()
	{
		Random random = new Random();
		int a = 1;
		int b = 6;
		int c = ((b-a) + 1);
		ris = random.nextInt(c) + a;
		this.ris = ris;
		return ris;
	}
}