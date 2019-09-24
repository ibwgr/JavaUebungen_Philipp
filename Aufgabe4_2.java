public class Aufgabe4_2 {
    public static void main(String[] args) {

        //**************************************************************************************************
        //  init
        //**************************************************************************************************
        int[]   a = {0, 1, 2, 3, 4};
        int[]   b = {0, 1, 2, 3, 5};
        int     iAnzahlEinträge         = 0;
        int     iAnzahlGleicheEinträge  = 0;

        if ( a.length == b.length ){
            System.out.println("Die beiden Felder haben die gleiche Länge");
        }//if
        else{
            System.out.println("Die beiden Felder haben nicht die gleiche Länge");
        }
        iAnzahlEinträge = a.length;

        for ( int index = 0; index < ( iAnzahlEinträge ); index++){
            if ( a[index] == b[index]){
                System.out.println("Feld a[" + index + "] = Feld b[" + index + "]");
                iAnzahlGleicheEinträge++;
            }//if
            else{
                System.out.println("Feld a[" + index + "] != Feld b[" + index + "]");
            }
        }

        System.out.println("Insgesammt sind " + iAnzahlGleicheEinträge + " von " + iAnzahlEinträge + " Enträge gleich.");

    }//main
}//class
