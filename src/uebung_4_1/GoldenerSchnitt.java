package uebung_4_1;

public class GoldenerSchnitt {

	public static double bruchDarstellen (int zaehler, int nenner)
	{
		double zaehler1 =zaehler;
		double nenner1=nenner;
		double ergebnis = zaehler1/nenner1;
		
		System.out.println(zaehler1);
		System.out.println("-------- = "+ergebnis);
		System.out.println(nenner1);
		
		return ergebnis;
	}

	public static void main(String[] args) {
		
		int zaehler2 = 1;
		int nenner2=1;
		int zaehler3=0;
		
		for (int i = 0; i<= 10; i++)
		{			
			bruchDarstellen(zaehler2, nenner2);
				
			zaehler3=zaehler2;
			zaehler2 = nenner2;
			nenner2 = nenner2 + zaehler3;			
		}

	}

}
