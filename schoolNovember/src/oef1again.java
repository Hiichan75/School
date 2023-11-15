import java.util.Scanner;

public class oef1again {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fN, sN;

        double result = 0;

        int operator;

        boolean stoppen = true;

        while(stoppen){



            System.out.println("1 - Optellen / 2 - Aftrekken / 3 - Maal / 4 - Delen / 5 - Stoppen");

            operator = sc.nextInt();

            if(operator == 1 || operator == 2 || operator == 3 || operator == 4){


                System.out.println("geef nummer 1");

                fN = sc.nextDouble();

                System.out.println("geef nummer 2");

                sN = sc.nextDouble();

                switch(operator){
                    case 1:
                        result = fN + sN;
                        break;
                    case 2:
                        result = fN - sN;
                        break;
                    case 3:
                        result = fN * sN;
                        break;
                    case 4:
                        if(sN == 0){
                            System.out.println("Je Kan niet delen door 0");
                            continue;

                        }else{
                            result = fN / sN;
                        }
                        break;

                    default:
                        System.out.println("Error probeer opnieuw");



                }

                }else if (operator == 5) {

                System.out.println("programma is nu gestopt");
                stoppen = false;
            } else {
                System.out.println("ongeldige invoer probeer opnieuw");
            }

                if(stoppen && operator >= 1 && operator <=4){
                    System.out.println("Resultaat is : " + result);


            }
        }

    }



}
