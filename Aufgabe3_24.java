
import Prog1Tools.IOTools;
public class Aufgabe3_24 {
	public static void main(String[] args) {

		// init
		int iNumberOfRows 	= 0;
		int iIndexRow		= 0;
		int iIndexSymbol	= 0;

		// read number of rows
		System.out.print("Bestimmen Sie die Anzahl der Zeilen: ");
		iNumberOfRows = IOTools.readInteger();



		for ( iIndexRow = 1; iIndexRow <= iNumberOfRows; iIndexRow++ ) {
			for ( iIndexSymbol = 1 ;  iIndexSymbol <= iIndexRow; iIndexSymbol++) {
				System.out.print("* ");
			} 
				System.out.println("");
		}


	}//main


}//class