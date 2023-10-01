import java.util.Scanner;

public class wk2Oef1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef de score op (/20)");
        int getal = scanner.nextInt();

        if(getal < 0 || getal > 20){
            System.out.println("Foutive invoer");
        }else{

        System.out.println(getal);

    }
}
