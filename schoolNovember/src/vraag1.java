import java.util.Scanner;

public class vraag1 {
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
        /*String vulBoekenInventaris(String[inventaris]))*/
        do {
            for (i = 0; i < arrayGroote; i++) ;
            System.out.println("Welk boek wil je er in plaatsen?");
            System.out.println("R voor Roman, T voor thriller, W voor Wetenschap ");
            keuzeUser = sc.next().toUpperCase();
            if(keuzeUser.equals("R") || keuzeUser.equals("T") || keuzeUser.equals("W")) {
                inventaris[i] = keuzeUser;
                i++;
            }else{
                System.out.println("Foutive invoer probeer opniew");
            }

        } while (i < arrayGroote);
        /*berekenTotaleWaardeInventaris2(berekenTotaleWaardeInventaris3,berekenTotaleWaardeInventaris4)*/

        int prijs = 0;
        int aantalBoekenR = 0; /* (aantalBoeken++) ergens in de boven loop? */
        int aantalBoekenT = 0;
        int aantalBoekenW = 0;
        int totalePrijsAantalboekenR = 0;
        int totalePrijsAantalboekenT = 0;
        int totalePrijsAantalboekenW = 0;

        switch (keuzeUser) {

            case "R":
                prijs = 12;
                totalePrijsAantalboekenR = prijs * aantalBoekenR;
                break;
            case "T":
                prijs = 15;
                totalePrijsAantalboekenT = prijs * aantalBoekenT;
                break;
            case "W":
                prijs = 20;
                totalePrijsAantalboekenW = prijs * aantalBoekenW;
                break;
            default:
                System.out.println("Foutieve invoer probeer opniew");


        }
        int berekenTotaleWaardeInventaris = 0;

        berekenTotaleWaardeInventaris = totalePrijsAantalboekenR + totalePrijsAantalboekenT + totalePrijsAantalboekenW;

        System.out.println("De totale waarde is € " + berekenTotaleWaardeInventaris);

        /*public static String vulBoekenInventaris(String[inventaris]){do {
            for (i = 0; i < arrayGroote; i++) ;
            System.out.println("Welk boek wil je er in plaatsen?");
            System.out.println("R voor Roman, T voor thriller, W voor Wetenschap ");
            keuzeUser = sc.next().toUpperCase();
            if(keuzeUser == "R" || keuzeUser == "T" || keuzeUser == "W") {
                inventaris[i] = keuzeUser;
                i++;
            }else{
                System.out.println("Foutive invoer probeer opniew");
            }

        } while (i < arrayGroote);

        }
       */

        /*public static int berekenTotaleWaardeInventaris2(int berekenTotaleWaardeInventaris3, int berekenTotaleWaardeInventaris4){
            int prijs = 0;
            int aantalBoekenR = 0;  (aantalBoeken++) ergens in de boven loop?
            int aantalBoekenT = 0;
            int aantalBoekenW = 0;
            int totalePrijsAantalboekenR = 0;
            int totalePrijsAantalboekenT = 0;
            int totalePrijsAantalboekenW = 0;

            switch (keuzeUser) {

                case "R":
                    prijs = 12;
                    totalePrijsAantalboekenR = prijs * aantalBoekenR;
                    break;
                case "T":
                    prijs = 15;
                    totalePrijsAantalboekenT = prijs * aantalBoekenT;
                    break;
                case "W":
                    prijs = 20;
                    totalePrijsAantalboekenW = prijs * aantalBoekenW;
                    break;
                default:
                    System.out.println("Foutieve invoer probeer opniew");


            }
            int berekenTotaleWaardeInventaris = 0;

            berekenTotaleWaardeInventaris = totalePrijsAantalboekenR + totalePrijsAantalboekenT + totalePrijsAantalboekenW;

            System.out.println("De totale waarde is € " + berekenTotaleWaardeInventaris);
        }*/
    }

}
