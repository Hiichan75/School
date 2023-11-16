import java.util.Scanner;

public class anotherCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        int operator = sc.nextInt();
        boolean stoppen = true;
        double fNum, sNum;

        while(stoppen){
            int result = 0;
            if(operator >=1 && operator <=4){

                switch(operator){
                    case 1:

                        break;
                }
            } else if (operator == 5) {
                System.out.println("het programma gaat nu stoppen");
                stoppen = false;

            }

        }
    }
}
