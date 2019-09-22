import Prog1Tools.IOTools;

public class Aufgabe3_25 {

    public static void main(String[] args) {
        //init
        int numberOfRequest = 0;
        int zahl               = 0;
        int querSumme       = 0;
        int aktuelleZiffer  = 0;

        while   (((zahl <= 0) || (zahl >= 10000)) && (numberOfRequest < 3)) {

            if (numberOfRequest == 0) {
                //request a number between 0 an 10000
                System.out.println("Bitte geben Sie eine positive ganze Zahl zwischen 0 und 10000 ein:");
                zahl = IOTools.readInt();
            } //if
            else {
                //request a number between 0 an 10000
                System.out.print("Die eingegebene Zahl war ausserhalb des Bereichs! Versuchen Sie es erneut:");
                zahl = IOTools.readInt();
            }//else

            numberOfRequest++;
        }//while


        if ( numberOfRequest == 3 ) {
            System.out.print("Die eingegebene Zahl war wieder ausserhalb des Berreichs. Das Program wird nun beendet");
        }//if
        else {

            System.out.print("Die Quersumme egibt sich zu: ");

            while (zahl != 0) {
                aktuelleZiffer  = ( zahl % 10 );
                zahl            = ( zahl / 10 );
                querSumme       = ( querSumme + aktuelleZiffer );
                System.out.print(aktuelleZiffer);
                if (zahl != 0 ) {
                    System.out.print(" + "); // nach letzter Ziffer darf kein + stehen
                } //if

            }//while

            // Quersumme ausgeben
            System.out.println(" = " + querSumme);

        }//else


    }//main
}//class
