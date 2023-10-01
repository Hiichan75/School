import java.util.Scanner;

public class switchCaseOef4point1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wat is uw jaarlijkse inkomen?");

        double inkomen = scanner.nextDouble();

        if (inkomen < 0) {
            System.out.println("Foutive invoer");
        } else {

            if(inkomen <= 15000){
                System.out.println("uw belasting is: " + "€" + (inkomen * 0.2));
            } else if(inkomen > 15000 && inkomen <= 20000){
                System.out.println("uw belasting is: " + "€" + ((15000 * 0.2) + ((inkomen - 15000) * 0.3)));
            } else if (inkomen > 20000 && inkomen <= 50000){
                System.out.println("uw belasting is:" + "€" + ((15000 * 0.2) + (5000 * 0.3) + ((inkomen - 20000) * 0.4)));
            } else if (inkomen > 50000){
                System.out.println("uw belasting is:" + "€" + ((15000 * 0.2) + (5000 * 0.3) + (30000 * 0.4) + ((inkomen - 50000) * 0.55)));
            }


        }
    }
}




