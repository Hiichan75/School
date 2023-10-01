import java.util.Scanner;

public class switchCaseOef4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Wat is uw jaarlijkse inkomen?");

        int inkomen = scanner.nextInt();

        if (inkomen < 0) {
            System.out.println("Foutive invoer");
        } else {

            if(inkomen <= 15000){
                System.out.println("uw belasting is 20% " + "€" + (inkomen * 0.2));
            } else if(inkomen > 15000 && inkomen <= 20000){
                System.out.println("uw belasting is 30% " + "€" + (inkomen * 0.3));
            } else if (inkomen > 20000 && inkomen <= 50000){
                System.out.println("uw belasting is 40% " + "€" + (inkomen * 0.4));
            } else if (inkomen > 50000){
                    System.out.println("uw belasting is 55% " + "€" + (inkomen * 0.55));
            }


        }
    }
}




