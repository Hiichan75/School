import java.util.Scanner;

public class switchCaseOef {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef een nummer");

        char nummerUser = scanner.next().charAt(0);


        switch(nummerUser){


            case'1':
                System.out.println("Het is maandag");
                break;

            case'2':
                System.out.println("Het is dinsdag");
                break;

            case'3':
                System.out.println("Het is woensdag");
                break;

            case'4':
                System.out.println("Het is donderdag");
                break;

            case'5':
                System.out.println("Het is vrijdag");
                break;

            case'6':
                System.out.println("Het is zaterdag");
                break;

            case'7':
                System.out.println("Het is zondag");
                break;

            default:
                System.out.println("foutive invoer");


        }
    }
}
