import java.util.Scanner;

public class arrayOef1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("hoeveel namen wil je opslaan");

        int aantalN = sc.nextInt();
        String[] namenArray = new String[aantalN];

        for(int i = 1; i < namenArray.length; i++ ){

            System.out.println("geef naam " + i + "/" + aantalN);
            namenArray[i] = sc.next();

        }

        for(int i = 1; i < namenArray.length; i++){
            System.out.println(i + ": " + namenArray[i]);

        }
    }
}
