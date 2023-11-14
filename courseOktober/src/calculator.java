import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fNum, sNum;

        int operator;

        boolean anything = true;

        while (anything) {
            System.out.println("1 - Add / 2 - Subtract / 3 - Multiply / 4 - Divide / 5 - Stop");

            operator = sc.nextInt();

            if (operator == 5) {
                System.out.println("Program is now stopped");
                break;
            }

            System.out.println("Enter first number: ");

            fNum = sc.nextDouble();

            System.out.println("Enter second number: ");

            sNum = sc.nextDouble();

            double result = 0;

            boolean kanNietDelenDoorNul = true;

            switch (operator) {

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
                    if (sNum == 0) {
                        System.out.println("Not valid: Division by zero");
                        kanNietDelenDoorNul = false;
                    } else {
                        result = fNum / sNum;
                    }
                    break;
                case 5:
                    System.out.println("Program is now stopped");
                    break;


                default:
                    System.out.println("Entered operator is not valid");
                    kanNietDelenDoorNul = false;


            }

            if (kanNietDelenDoorNul) {
                System.out.println("result is : " + result);
            }


        }




    }
}
