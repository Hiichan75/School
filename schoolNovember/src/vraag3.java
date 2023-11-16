import java.util.Scanner;

public class vraag3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayGroote = 0;
        boolean stoppen = true;
        String[] inventaris = new String[arrayGroote];

        while (stoppen) {
            System.out.println("Hoe groot is de inventaris?");
            arrayGroote = sc.nextInt();
            inventaris = new String[arrayGroote];
            if (arrayGroote >= 5 && arrayGroote <= 20) {
                stoppen = false;
            } else {

                System.out.println("Foutive invoer probeer opnieuw (min 5 max 20)");


            }
        }

        int i = 0;
        String keuzeUser;

        do {
            for (i = 0; i < arrayGroote; i++) ;
            System.out.println("Welk boek wil je er in plaatsen?");
            System.out.println("R voor Roman, T voor thriller, W voor Wetenschap ");
            keuzeUser = sc.next().toUpperCase();
            inventaris[i] = keuzeUser;
            i++;

        } while (i < arrayGroote);

        int prijs = 0;
        int aantalBoeken = 0; /* (i++) ergens in de boven loop? */
        int totalePrijsAantalboekenR = 0;
        int totalePrijsAantalboekenT = 0;
        int totalePrijsAantalboekenW = 0;

        switch (keuzeUser) {

            case "R":
                prijs = 12;
                totalePrijsAantalboekenR = prijs * aantalBoeken;
                break;
            case "T":
                prijs = 15;
                totalePrijsAantalboekenT = prijs * aantalBoeken;
                break;
            case "W":
                prijs = 20;
                totalePrijsAantalboekenW = prijs * aantalBoeken;
                break;
            default:
                System.out.println("Foutieve invoer probeer opniew");


        }
        int berekenTotaleWaardeInventaris = 0;

        berekenTotaleWaardeInventaris = totalePrijsAantalboekenR + totalePrijsAantalboekenT + totalePrijsAantalboekenW;

        System.out.println("De totale waarde is € " + berekenTotaleWaardeInventaris);

    }

}
