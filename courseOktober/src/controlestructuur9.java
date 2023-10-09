import java.util.Scanner;

public class controlestructuur9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int getal;

        int grootste = Integer.MIN_VALUE;
            int kleinste = Integer.MAX_VALUE;

        do{
            System.out.println("geef een getal in: ");
            getal = sc.nextInt();

            if(getal != -1) {


                if (grootste < getal) {
                    grootste = getal;
                }
                if (kleinste > getal) {
                    kleinste = getal;
                }

                System.out.println("kleinste getal = " + kleinste);
                System.out.println("Grootste getal = " + grootste);
                System.out.println("Verschil = " + (grootste - kleinste));
            }



        }while(getal != -1);
    }
}
