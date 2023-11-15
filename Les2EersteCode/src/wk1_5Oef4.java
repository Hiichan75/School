import java.util.Scanner;

public class wk1_5Oef4 {

    public static void main(String[] args) {

        int getal1, getal2, getal3, getal4;

        boolean stoppen = true;

        Scanner scanner = new Scanner(System.in);

        while(stoppen) {

            System.out.println("Geef deel 1 (op 20)");
            getal1 = scanner.nextInt();
            if (getal1 < 0 || getal1 > 20) {
                System.out.println("Foutive invoer, probeer opnieuw");
                continue;
            }

            System.out.println("Geef deel 2 (op 20)");
            getal2 = scanner.nextInt();
                if (getal2 < 0 || getal2 > 20) {
                    System.out.println("Foutive invoer");
                    continue;
                }

                    System.out.println("Geef deel 3 (op 20)");
            getal3 = scanner.nextInt();
                    if (getal3 < 0 || getal3 > 20) {
                        System.out.println("Foutive invoer");
                        continue;

                    }
                        System.out.println("Geef deel 4 (op 20)");
                        getal4 = scanner.nextInt();

                        if (getal4 < 0 || getal4 > 20) {
                            System.out.println("Foutive invoer");
                            continue;

                        }

                        double result = ((getal1 * 0.15) + (getal2 * 0.25) + (getal3 * 0.20) + (getal4 * 0.40));


                            System.out.println("Het totalecijfer van de student: " + result + " /20");
                            stoppen = false;



        }
    }
}
