import java.util.Arrays;
import java.util.Scanner;

public class arrayVoidFunctie {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("hoe groot is de array?");

        int arrayGroote = sc.nextInt();
        int[] waardes = new int[arrayGroote];

        int i = 0;

        do {
            System.out.println("geef waarde " + (i) + "/" + arrayGroote);
            int input = sc.nextInt();
            waardes[i] = input;
            i++;


        } while (arrayGroote > i);

        System.out.println(Arrays.toString(waardes));
    }
}
