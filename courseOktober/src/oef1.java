import java.util.Scanner;

public class oef1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef de score op (/20)");
        int getal = scanner.nextInt();

        char charGetal = ' ';

        if (getal < 0 || getal > 20) {
            System.out.println("Foutive invoer");
        } else {

            if(getal < 10){
                charGetal = 'C';
            } else if(getal >= 10 && getal < 12){
                charGetal = 'B';
            } else if (getal >= 12){
                charGetal = 'A';
            }

            System.out.println("Gecodeerde score:");
            System.out.println(charGetal);

        }
    }
}