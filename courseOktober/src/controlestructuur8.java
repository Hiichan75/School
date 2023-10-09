import java.util.Scanner;

public class controlestructuur8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("geef een getal");

        int userInput;

        do {
            userInput = sc.nextInt();
        }while(userInput < 0 || userInput > 21);

        for(int i = 1; i <= userInput; i++){
            for(int j = 1; j <= 4; j++){
                System.out.print(i * j + " " );
            }
            System.out.println();

        }

    }
}
