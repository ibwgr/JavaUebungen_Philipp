

import Prog1Tools.IOTools;
public class Aufgabe3_15 {
	public static void main(String[] args) {

		Double sekundenwert 		= 0.0;

		Integer m_sekunden		= 0;
		Integer m_minuten		= 0;
		Integer m_stunden		= 0;
		Integer m_tage			= 0;
		Integer m_jahre			= 0;

		System.out.print("Geben Sie einen Sekundenwert ein, den Sie Umrechnen wollen: ");	

		// Zahl einlesen
		sekundenwert = IOTools.readDouble();


		// Jahre berechnen
		m_jahre = (int)(sekundenwert / 31536000);
		// Rest evaluiern
		sekundenwert = (sekundenwert % 31536000) ;


		// Tage berechnen
		m_tage = (int)(sekundenwert / 86400);
		// Rest evaluiern
		sekundenwert = (sekundenwert % 86400) ;


		// Stunden berechnen
		m_stunden = (int)(sekundenwert / 3600);
		// Rest evaluiern
		sekundenwert = (sekundenwert % 3600) ;

		// Minuten berechnen
		m_minuten = (int)(sekundenwert / 60);
		// Rest evaluiern
		sekundenwert = (sekundenwert % 60) ;


		// Jahre berechnen
		m_sekunden = (int)(sekundenwert * 1);
		// es kann kein rest mehr übrig sein


		System.out.println("Die Zahl wurde wie folgt umgerechnet in: ");
		//Ausgabe der Werte
		System.out.println( m_jahre 	+ "	Jaheren" );
		System.out.println( m_tage 		+ "	Tage" );
		System.out.println( m_stunden 	+ "	Stunden" );
		System.out.println( m_minuten 	+ "	Minuten" );
		System.out.println( m_sekunden 	+ "	Sekunden" );


	}// main 



}//class

