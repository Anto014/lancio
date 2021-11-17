package oggetti;

import java.util.Random;

public class Moneta extends OggettoLanciato
{
	public int lancio()
	{
		Random random = new Random();
		int a = 0;
		int b = 1;
		int c = ((b-a) + 1);
		ris = random.nextInt(c) + a;
		this.ris = ris;
		return ris;
	}
}