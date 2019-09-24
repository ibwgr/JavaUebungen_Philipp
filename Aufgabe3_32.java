import Prog1Tools.IOTools;

public class Aufgabe3_32 {
    public static void main(String[] args) {

        //**************************************************************************************************
        //  init
        //**************************************************************************************************
        int     iAnzahlderZeilen    = 0;
        int     iIndexZeile         = 0;
        int     iIndexZeichen       = 0;
        int     iIndexLeerzeichen   = 0;
        //**************************************************************************************************
        //  Anzahl der Zeilen einlesen
        //**************************************************************************************************
        System.out.print("Anzahl der Zeilen: ");
        iAnzahlderZeilen = IOTools.readInt();


        //**************************************************************************************************
        // Erstellen eines grafischen Baums
        //**************************************************************************************************

        for ( iIndexZeile = iAnzahlderZeilen; iIndexZeile >= 0 ; iIndexZeile-- ) {

            // falls nicht letzte Zeile aktiv ist
            if (iIndexZeile != 0 ){

                // Ausgabe von Leerzeichen bis der Baum beginnt
                for ( iIndexLeerzeichen = 0; iIndexLeerzeichen < iIndexZeile ; iIndexLeerzeichen ++ ) {
                    System.out.print(" ");
                } //for

                // Ausgabe des Baums
                for ( iIndexZeichen = 0; iIndexZeichen < (((iAnzahlderZeilen -iIndexZeile ) *2 ) + 1) ; iIndexZeichen++) {
                    System.out.print("*");
                }
                System.out.println("");

            } //if


            // Baumstamm für letzte Zeile ausgeben
            else{
                for ( iIndexLeerzeichen = 0; iIndexLeerzeichen < iAnzahlderZeilen ; iIndexLeerzeichen ++ ) {
                    System.out.print(" ");
                } //for

                System.out.print("I");

            }//else
        }//for
    }//main
}//class
