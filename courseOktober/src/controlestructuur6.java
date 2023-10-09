import java.util.Scanner;

public class controlestructuur6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int saldo = 0;

        do {
            System.out.println("voer de operatie in");
            int userInput = sc.nextInt();
            saldo = saldo + userInput;
            System.out.println("Nieuw saldo is " + saldo);
        }while(saldo > 0 || saldo > 1000000);



   }

}