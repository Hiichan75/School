import java.util.Scanner;

public class loops1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int getal1 = 0;

        int getal2 = 0;

        char keuzeUser;
        do{
            System.out.println("Menu: Kies +, - of / of * en q om te stoppen");
            keuzeUser = sc.next().charAt(0);

            if(keuzeUser == '+' || keuzeUser == '-' || keuzeUser == '/' || keuzeUser == '*'){
                System.out.println("Geef getal1 in:");
                getal1 = sc.nextInt();

                System.out.println("Geef getal2 in:");
                getal2 = sc.nextInt();
            }





            switch(keuzeUser){

                case '+':
                    System.out.println("De som van de twee getallen is:");
                    break;
                case '-':
                    System.out.println("De aftrekking van de twee getallen is:");
                    break;
                case '/':
                    System.out.println("De deling van de twee getallen is:");
                    break;
                case '*':
                    System.out.println("De veeenigvuldiging van de twee getallen is:");
                    break;
                case 'Q':
                    System.out.println("Bedankt:");
                    break;
                default:
                    System.out.println("Foutive invour");
            }

        }while(keuzeUser != 'q');


    }
}
