package uebung_4_1;

public class Bruch {
	
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
	
	public static void main(String[] args)
	{
		bruchDarstellen(3,2);
		
	}

}
