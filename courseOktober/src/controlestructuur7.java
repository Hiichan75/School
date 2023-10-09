import java.util.Scanner;

public class controlestructuur7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geef een hoogte in");
        int hoogte = sc.nextInt();

        System.out.println("Geef een breedte in");
        int breedte = sc.nextInt();

        if(hoogte > 20 || breedte > 20){
            System.out.println("mag niet probeer 20 of minder");
        }else{
            for(int i = 0; i < hoogte; i++){
                for(int j = 0; j < breedte; j++){
                    System.out.print('*');
        }
                System.out.println();



            }

        }
    }
}
