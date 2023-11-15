import java.util.Scanner;

public class oef1 {

    public static void main(String[] args) {

        double fNum, sNum;

        int operator;

        boolean stoppen = true;

        Scanner sc = new Scanner(System.in);



        while(stoppen){

            System.out.println("1 - Optellen / 2 - Aftrekken / 3 - Maal / 4 - Delen / 5 - Stoppen");

            operator = sc.nextInt();

            if (operator == 5) {

                System.out.println("Programma is nu gestopt");
                stoppen = false;

            }

            System.out.println("Geef nummer 1");

            fNum = sc.nextDouble();

            System.out.println("Geef nummer 2");

            sNum = sc.nextDouble();

            double result = 0;



            switch(operator){

                case 1:
                    result = fNum + sNum;
                    break;
                case 2:
                    result = fNum - sNum;
                    break;
                case 3:
                    result = fNum * sNum;
                    break;
                case 4:

                    if (sNum == 0){
                        System.out.println("Kan niet delen door nul");
                        stoppen = false;
                    } else {
                        result = fNum / sNum;

                    }
                    break;

                    default:
                        System.out.println("Error probeer opnieuw");
                        stoppen = false;


            }

            if(stoppen){
                System.out.println("result is: " + result);
            }



        }





    }
}
