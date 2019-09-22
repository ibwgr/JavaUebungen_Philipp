import Prog1Tools.IOTools;

public class Aufgabe3_26 {

    public static void main(String[] args) {

        //**************************************************************************************************
        //  init
        //**************************************************************************************************
        int     iJahre                   = 0;
        int     iMonat                   = 0;
        int     iTage                    = 0;
        int     iStunden                  = 0;
        int     iMinuten                 = 0;

        int     iGalagtischeTage          = 0;
        int     iGalagtischeZeit          = 0;
        double  fGalagtischeSternzeit     = (float)0.0;//galagtische Zeit die berechnet werden soll

        //**************************************************************************************************
        //  Erdzeit eingeben
        //**************************************************************************************************
        System.out.print("Jahr = ");
        iJahre = IOTools.readInt();

        System.out.print("Monat = ");
        iMonat = IOTools.readInt();

        System.out.print("Tag = ");
        iTage = IOTools.readInt();

        System.out.print("Stunde = ");
        iStunden = IOTools.readInt();

        System.out.print("Minute = ");
        iMinuten = IOTools.readInt();


        //**************************************************************************************************
        // Galagtische Zeit berechnen
        //**************************************************************************************************

        //Jahre in Tage umrechnen
        iGalagtischeTage = ((iJahre - 1111) * 365);

        //Monate in Tage Umrechnen
        switch (iMonat - 1) {
            case 12:
                iGalagtischeTage = (iGalagtischeTage + 31);     //Dezember
            case 11:
                iGalagtischeTage = (iGalagtischeTage + 30);     //November
            case 10:
                iGalagtischeTage = (iGalagtischeTage + 31);     //Oktober
            case 9:
                iGalagtischeTage = (iGalagtischeTage + 30);     //September
            case 8:
                iGalagtischeTage = (iGalagtischeTage + 31);     //August
            case 7:
                iGalagtischeTage = (iGalagtischeTage + 31);     //Juli
            case 6:
                iGalagtischeTage = (iGalagtischeTage + 30);     //Juni
            case 5:
                iGalagtischeTage = (iGalagtischeTage + 31);     //Mai
            case 4:
                iGalagtischeTage = (iGalagtischeTage + 30);     //April
            case 3:
                iGalagtischeTage = (iGalagtischeTage + 31);     //März
            case 2:
                iGalagtischeTage = (iGalagtischeTage + 28);     //Februar
            case 1:
                iGalagtischeTage = (iGalagtischeTage + 31);     //Januar
            case 0:
                break;
        }//switch

        //Tage hinzuzählen
        iGalagtischeTage = (iGalagtischeTage + iTage);


        iGalagtischeZeit = ( 1000 * (( iStunden * 60 ) + iMinuten) / 1440 );

        fGalagtischeSternzeit = ((float)iGalagtischeTage + ((float)iGalagtischeZeit / 1000.0));


        //**************************************************************************************************
        // Ausgabe der Berechnung
        //**************************************************************************************************
        System.out.println("Die Erdzeit " + iTage + "." + iMonat + "." + iJahre + ", " + iStunden + ":" + iMinuten + " entspricht der Sternzeit: " + fGalagtischeSternzeit);

    }//main

}//class
