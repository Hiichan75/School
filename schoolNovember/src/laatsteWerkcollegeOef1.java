import java.util.Scanner;

    public class laatsteWerkcollegeOef1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Stap 1: Grootte van de fruitbak instellen
            int fruitbakGrootte = vraagFruitbakGrootte(scanner);

            // Stap 2: Fruitbak vullen
            String[] fruitbak = new String[fruitbakGrootte];
            vulFruitBak(scanner, fruitbak);

            // Stap 3: Totaalprijs van de fruitbak berekenen
            double totaalPrijs = berekenTotaalFruitBak(fruitbak);
            System.out.println("De waarde van je mand is: " + totaalPrijs + " Euro.");

            // Stap 4: Totaalprijs inclusief BTW berekenen
            double totaalPrijsMetBTW = berekenTotaalFruitBakBTW(totaalPrijs);
            System.out.println("Inclusief met btw is dit: " + totaalPrijsMetBTW + " Euro.");
        }

        public static int vraagFruitbakGrootte(Scanner scanner) {
            int fruitbakGrootte;
            do {
                System.out.print("Hoe groot is de fruitbak (5 - 20)? ");
                fruitbakGrootte = scanner.nextInt();
            } while (fruitbakGrootte < 5 || fruitbakGrootte > 20);
            return fruitbakGrootte;
        }

        public static void vulFruitBak(Scanner scanner, String[] fruitbak) {
            for (int i = 0; i < fruitbak.length; i++) {
                System.out.print("Welke stukken fruit pluk je? (keuze: GA, RA, P): ");
                String keuze = scanner.next().toUpperCase();
                while (!keuze.equals("GA") && !keuze.equals("RA") && !keuze.equals("P")) {
                    System.out.print("Ongeldige keuze. Probeer opnieuw: ");
                    keuze = scanner.next().toUpperCase();
                }
                fruitbak[i] = vertaalKeuzeNaarFruit(keuze);
            }
        }

        public static String vertaalKeuzeNaarFruit(String keuze) {
            switch (keuze) {
                case "GA":
                    return "Groene Appel";
                case "RA":
                    return "Rode Appel";
                case "P":
                    return "Peer";
                default:
                    return "Onbekend";
            }
        }

        public static double berekenTotaalFruitBak(String[] fruitbak) {
            double totaalPrijs = 0;
            for (String fruit : fruitbak) {
                switch (fruit) {
                    case "Groene Appel":
                        totaalPrijs += 0.5;
                        break;
                    case "Rode Appel":
                        totaalPrijs += 1;
                        break;
                    case "Peer":
                        totaalPrijs += 1.5;
                        break;
                }
            }
            return totaalPrijs;
        }

        public static double berekenTotaalFruitBakBTW(double totaalPrijs) {
            double btw = totaalPrijs * 0.21;
            return totaalPrijs + btw;
        }
    }