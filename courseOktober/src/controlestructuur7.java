import java.util.Scanner;

public class controlestructuur7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hoogte, breedte;

        do{

            System.out.println("Geef een hoogte in");
            hoogte = sc.nextInt();

            System.out.println("Geef een breedte in");
            breedte = sc.nextInt();


        }while(hoogte > 20 || hoogte < 0 || breedte > 20 || breedte < 0);


            for(int i = 0; i < hoogte; i++){
                for(int j = 0; j < breedte; j++){
                    System.out.print('*'+" ");
        }
                System.out.println();





        }
    }
}
