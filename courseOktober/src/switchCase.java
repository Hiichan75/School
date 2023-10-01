import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een keuze");

        char keuzeUser = scanner.next().charAt(0);


        switch(keuzeUser){

            case'+':
                System.out.println("a + b");
                break;

            case'-':
                System.out.println("a - b");
                break;

            case'*':
                System.out.println("a * b");
                break;

            case'/':
                System.out.println("a / b");
                break;

            default:
                System.out.println("foutive invoer");


        }
    }
}
