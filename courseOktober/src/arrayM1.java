import java.util.Scanner;
import java.util.Arrays;

public class arrayM1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hoeveel namen?");
        int aantalN = sc.nextInt();
        String[] namenArray = new String[aantalN];

        for (int i = 0; i < aantalN; i++) {
            System.out.println("geef naam " + (i + 1) + "/" + aantalN);
            namenArray[i] = sc.next();
        }
        for (int i = 0; i < namenArray.length; i++) {
            System.out.println(i + ": " + namenArray[i]);

            int aantalK = 0;
            for (int j = 0; j < namenArray.length; j++) {
                System.out.println((j + 1) + ": " + namenArray[j]);

            }
            System.out.println("totaal aantal karakters: " + aantalK);
        }


    }
}
