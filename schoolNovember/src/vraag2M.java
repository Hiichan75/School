import java.util.Scanner;

public class vraag2M {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hoe groot is de inventaris?");
        int grootteInventaris = sc.nextInt();

        while(grootteInventaris < 5 || grootteInventaris > 20){
            System.out.println("Foutieve invoer probeer opniuew (min 5 max 20).");
            grootteInventaris = sc.nextInt();
        }

        String[] boeken = new String[grootteInventaris];

        vulBoekenInventaris(boeken, sc);

        int totaalprijs = berekenTotaleWaardeInventaris(boeken);

        System.out.println("De totaal waarde is: €" + totaalprijs);
    }

    public static void vulBoekenInventaris(String[] boeken, Scanner sc){

        System.out.println("Welk boek wil je er in plaatsen?");
        System.out.println("R voor Roman, T voor thriller, W voor Wetenschap");

        boolean correcteInvoer;
        String keuze;

        for(int i = 0; i < boeken.length; i++){

            do {
                keuze = sc.next();

                if(keuze.equals("R") || keuze.equals("T") || keuze.equals("W")) {
                    correcteInvoer = true;
                    boeken[i] = keuze;
                }else{
                    correcteInvoer = false;
                    System.out.println("Foutieve invoer probeer opnieuw");
                }

            }while(!correcteInvoer);
        }
    }

    public static int berekenTotaleWaardeInventaris(String[] boeken){

        int totaalPrijs = 0;

        for(int i = 0; i < boeken.length; i++){

            switch(boeken[i]){
                case"R":
                    totaalPrijs += 12;
                    break;

                case"T":
                    totaalPrijs += 15;
                    break;

                case"W":
                    totaalPrijs += 20;
                    break;
            }
        }

        return(totaalPrijs);
    }
}