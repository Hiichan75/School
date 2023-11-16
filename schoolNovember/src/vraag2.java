import java.util.Scanner;

public class vraag2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean stoppen = true;

        int getal = 0;

        /*while(stoppen){
            krijgUserInput(getal);
         */
        while (stoppen) {

            System.out.println("Wat is het oppervlakte van het akker van de boer? (100-500)");
            getal = sc.nextInt();

            if (getal >= 100 && getal <= 500) {
                stoppen = false;
            }
        }
        System.out.println("Wat voor weer voorspellen ze deze zomer? G ( Goed weer) S (Slecht weer):");
        String userInput = sc.next().toUpperCase();

        double opbrengst = 0;


        switch (userInput) {
            case "G":
                opbrengst = getal * 2.5;
                System.out.println("De boer zal dit jaar Mais planten voor een opbrengst van: " + opbrengst);
                break;
            case "S":
                opbrengst = getal * 1.5;
                System.out.println("De boer zal dit jaar Mais planten voor een opbrengst van: " + opbrengst);
                break;
            default:
                System.out.println("Foutieve invoer probeer opniew");
        }

        double btwBedraagt = 0;

        btwBedraagt = (opbrengst / 100) * 21;
        System.out.println("De opbrengst + btw bedraagt: " + (opbrengst + btwBedraagt));
        stoppen = false;
    }
        
        /*krijgUserInput(getal);

        while(stoppen){

            System.out.println("Wat is het oppervlakte van het akker van de boer? (100-500)");
            getal = sc.nextInt();

            if(getal >= 100 && getal <= 500){
                stoppen = false;
            }
        }
        System.out.println("Wat voor weer voorspellen ze deze zomer? G ( Goed weer) S (Slecht weer):");
          String userInput = sc.next().toUpperCase();

          double opbrengst = 0;


          switch(userInput){
              case "G":
                  opbrengst = getal * 2.5;
                  System.out.println("De boer zal dit jaar Mais planten voor een opbrengst van: " + opbrengst);
                  break;
              case "S":
                  opbrengst = getal * 1.5;
                  System.out.println("De boer zal dit jaar Mais planten voor een opbrengst van: " + opbrengst);
                  break;
              default:
                  System.out.println("Foutieve invoer probeer opniew");
          }

          double btwBedraagt = 0;

          btwBedraagt = (opbrengst / 100) * 21;
        System.out.println("De opbrengst + btw bedraagt: " + (opbrengst + btwBedraagt));
    */


    public static int krijgUserInput(int getal) {

        Scanner sc = new Scanner(System.in);

        boolean stoppen = true;

        while (stoppen) {

            System.out.println("Wat is het oppervlakte van het akker van de boer? (100-500)");
            getal = sc.nextInt();

            if (getal >= 100 && getal <= 500) {
                stoppen = false;
            }
        }
        return getal;
    }
    /*public static void btwPlusPrijs(int opbrengst, int btwBedraagt){}
    double opbrengst = 0;
    double btwBedraagt = 0;
    btwBedraagt = (opbrengst / 100) * 21;
        System.out.println("De opbrengst + btw bedraagt: " + (opbrengst + btwBedraagt));*/
}
