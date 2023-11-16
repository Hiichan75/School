import java.util.Arrays;
import java.util.Scanner;

public class wk3_5Oef2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("hoe groot is de array");

        int arrayGroote = sc.nextInt();
        int[] waardes = new int[arrayGroote];

        int i = 0;

        do{
            System.out.println("geef een waarde in");
            int input = sc.nextInt();
            waardes[i] = input;
            i++;

        }while(i < arrayGroote);

        int somVanDeGetallen = 0;

        System.out.println("de array ziet er zo uit");

        System.out.println(Arrays.toString(waardes));

        System.out.println("dit zijn de even getallen");

        for (int j = 0; j < i; j++){

            somVanDeGetallen += waardes[j];


            if(waardes[j] % 2 == 0){
                System.out.print(waardes[j] + " ");
            }

        }
        System.out.println();
        System.out.println("de som van de getallen is: " + somVanDeGetallen);


    }
}
