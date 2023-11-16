import java.util.Scanner;

public class wk3_5Oef1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("geef saldo in:");

        int saldo = sc.nextInt();

        while(saldo >= 0){

            System.out.println("Wat wil je kopen uit ons assortiment? ( 1. Appel ($1) , 2. Peer ($2), 3. Banaan ($4), 4. Kellogs ($8), 5. Yoghurt ($10))");

            int keuze = sc.nextInt();

            int prijsVanP = 0;
            int totalePrijs = 0;
            int aantalP = 0;

            switch(keuze){
                case 1:
                    prijsVanP = 1;
                    System.out.println("hoeveel apples wil je kopen?");
                    aantalP = sc.nextInt();
                    if(aantalP > 0){
                        totalePrijs = aantalP * prijsVanP;
                        System.out.println("totale prijs is " + totalePrijs + " euro");
                        saldo -= totalePrijs;
                        System.out.println("resterende bedrag is " + saldo + " euro");
                        break;

                    }else{
                        System.out.println("moet meer dan 1 kopen");
                        continue;
                    }
                case 2:
                    prijsVanP = 2;
                    System.out.println("hoeveel peer wil je kopen?");
                    aantalP  = sc.nextInt();
                    if(aantalP > 0){
                        totalePrijs = aantalP * prijsVanP;
                        System.out.println("totale prijs is " + totalePrijs + " euro");
                        saldo -= totalePrijs;
                        System.out.println("resterende bedrag is " + saldo + " euro");
                        break;

                    }else{
                        System.out.println("moet meer dan 1 kopen");
                        continue;
                    }
                case 3:
                    prijsVanP = 4;
                    System.out.println("hoeveel banaan wil je kopen?");
                    aantalP = sc.nextInt();
                    if(aantalP > 0){
                        totalePrijs = aantalP * prijsVanP;
                        System.out.println("totale prijs is " + totalePrijs + " euro");
                        saldo -= totalePrijs;
                        System.out.println("resterende bedrag is " + saldo + " euro");
                        break;

                    }else{
                        System.out.println("moet meer dan 1 kopen");
                        continue;
                    }
                case 4:
                    prijsVanP = 8;
                    System.out.println("hoeveel kellogs wil je kopen?");
                    aantalP = sc.nextInt();
                    if(aantalP > 0){
                        totalePrijs = aantalP * prijsVanP;
                        System.out.println("totale prijs is " + totalePrijs + " euro");
                        saldo -= totalePrijs;
                        System.out.println("resterende bedrag is " + saldo + " euro");
                        break;

                    }else{
                        System.out.println("moet meer dan 1 kopen");
                        continue;
                    }
                case 5:
                    prijsVanP = 10;
                    System.out.println("hoeveel yoghurt wil je kopen?");
                    aantalP = sc.nextInt();
                    if(aantalP > 0){
                        totalePrijs = aantalP * prijsVanP;
                        System.out.println("totale prijs is " + totalePrijs + " euro");
                        saldo -= totalePrijs;
                        System.out.println("resterende bedrag is " + saldo + " euro");
                        break;

                    }else{
                        System.out.println("moet meer dan 1 kopen");
                        continue;
                    }
                default:
                    System.out.println("probeer opnieuw");


            }

        }

        System.out.println("einde programma");
    }
}
