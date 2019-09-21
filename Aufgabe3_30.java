import Prog1Tools.IOTools;
public class Aufgabe3_30 {
	public static void main(String[] args){

		// init
		int geheimZahl 		= (int) (99 * Math.random() + 1);	// randeom number "geheimZahl" will never be 0
		int mAnzahlVersuche	= 1;								// init the number of try
		int gerateneZahl	= 0;								// init number "gerateneZahl" with 0. Has to be different to "geheimZahl", otherwise the game is already over

		// information about the rules of the game
		System.out.println("Wilkommen beim Spiel Zahlenraten");
		System.out.println("Bei diesem Spiel denke ich mir eine Zahl zwischen 0 und 100 aus. Rate diese Zahl!");

		// start the game
		while ( gerateneZahl != geheimZahl ) {
			System.out.print((mAnzahlVersuche) + ". Versuch: ");
			gerateneZahl = IOTools.readInteger();

			if ( gerateneZahl < geheimZahl ) {
				System.out.println("Meine Zahl ist grösser! Versuche es erneut.'.");
			}//if

			if ( gerateneZahl > geheimZahl ) {
				System.out.println("Meine Zahl ist kleiner! Versuche es erneut.'.");
			}//if

			// increase guess counter
			mAnzahlVersuche++;

		}//while

		System.out.println("Herzlichen Glückwunsch, du hast die Zahl erraten!");

	}//main
}//class