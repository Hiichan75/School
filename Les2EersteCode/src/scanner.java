import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner scanny = new Scanner(System.in);

        System.out.println("Geef de hoogte in");
        int hoogte = scanny.nextInt();

        System.out.println(hoogte);

        System.out.println("Geef mij de breedte max 5");
        int breedte = scanny.nextInt();

        if(breedte <=5 || hoogte <=5){

            System.out.println("De oppervlakte van de boer is:" + (hoogte * breedte));
        }else{

            System.out.println("Kan oppervlakte niet berekenen, probeer opnieuw");
        }
    }
}
