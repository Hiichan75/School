
import java.util.Scanner;

public class loops5 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int i;
        int aantalDagen = 0;

        System.out.println("Geef het beginjaar in: ");
        int beginjaar = sc.nextInt();

        System.out.println("Geef het eindjaar in: ");
        int eindjaar = sc.nextInt();

        for(i = beginjaar; i <= eindjaar; i++){
            if(i % 400 == 0 || (i % 100 != 0 && i % 4 ==0)){
                aantalDagen = aantalDagen + 366;
            }else{
                aantalDagen = aantalDagen + 365;
            }



        }

        System.out.println("aantal dagen in de periode [" + beginjaar + "-" + eindjaar + "] is " + aantalDagen);
    }
}

