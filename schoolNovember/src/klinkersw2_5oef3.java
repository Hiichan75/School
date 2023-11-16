import java.util.Scanner;

public class klinkersw2_5oef3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("geef ons een klinker in");

        String klinkers = "aeiouAEIOU";

        char x = sc.next().charAt(0);

        int klinkersBevind = klinkers.indexOf(x);

        /*

        if(klinkersBevind >= 0){
            System.out.println("we hebben een klinker");
        }else{
            System.out.println("we hebben geen klinker");
        }  ternaire if else structuur onderaan*/

        String response = (klinkersBevind >= 0) ? "Is een klinker" : "Is geen klinker";
        System.out.println(response);



    }
}
