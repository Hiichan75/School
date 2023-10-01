import java.util.Scanner;

public class wk1_5oef3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("geef uw naam");
        String naam = sc.nextLine();

        System.out.println("geef uw geboortejaar");
        int geboortejaar = sc.nextInt();

        int leeftijd = 2023 - geboortejaar;

        System.out.println(naam +" is "+ leeftijd +" jaar oud ");

    }
}
