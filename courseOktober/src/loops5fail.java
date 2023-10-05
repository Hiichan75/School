import java.util.Scanner;

public class loops5fail {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int jaartalVerschil = 0;

        int dagen = 0;

        int schrikkeldagen = 0;

        System.out.println("geef uw eerste jaartal (eerste jaartal moet kleiner zijn dan de tweede)");

        int jaartal1 = sc.nextInt();

        System.out.println("geef uw tweede jaartal");

        int jaartal2 = sc.nextInt();

        if(jaartal1 > jaartal2){
            System.out.println("foutive invoer");

        }else{
            jaartalVerschil = (jaartal2 - jaartal1);


            for(int i= 0; i<= jaartalVerschil; i++) {
                if(jaartalVerschil >= 0){
                    dagen += 365;

                }



            }
            System.out.println("aantal dagen in de periode [" + jaartal1 + "-" + jaartal2 + "] is " + (dagen + schrikkeldagen));

        }
    }
}
