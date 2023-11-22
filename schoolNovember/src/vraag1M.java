import java.util.Scanner;

public class vraag1M {

    public static void main(String[] args) {

        int opp = krijgUserInput();

        Scanner sc = new Scanner(System.in);

        System.out.println("Wat voor weer voorspellen ze deze zomer? G ( Goed weer) S (Slecht weer): ");
        char weer = sc.next().charAt(0);

        double opbrengst = 0;

        if(weer == 'G'){
            opbrengst = (opp*2.5);
            System.out.println("De boer zal dit jaar maïs planten voor een opbrangst van: €" + opbrengst);
        }else if(weer == 'S'){
            opbrengst = (opp*1.5);
            System.out.println("De boer zal dit jaar aardappelen planten voor een opbrangst van: €" + opbrengst);
        }

        btwBerekenen(opbrengst);
    }

    public static int krijgUserInput(){

        Scanner sc = new Scanner(System.in);

        int opp = 0;

        do {
            System.out.println("Wat is het oppervlakte van het akker van de boer? (100-500)");
            opp = sc.nextInt();
        }while(opp < 100 || opp > 500);

        return(opp);
    }

    public static void btwBerekenen(double opbrengst){
        double totaalPlusBTW;
        totaalPlusBTW = (opbrengst*1.21);
        System.out.println("De opbrengst + btw bedraagt: €" + totaalPlusBTW);
    }
}