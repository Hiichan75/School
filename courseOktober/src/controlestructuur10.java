import java.util.Scanner;

public class controlestructuur10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aantalJuryLeden;
        do{
            System.out.println("Hoeveel juryleden zijn er? (min 3)");
            aantalJuryLeden = sc.nextInt();
        }while(aantalJuryLeden < 3);
        int[] punten = new int[aantalJuryLeden];
        for(int i = 0; i < aantalJuryLeden; i++){
            System.out.println("Hoeveel punten geeft dit jurylid? ");
            punten[i] = sc.nextInt();
        }
        int grootste = Integer.MIN_VALUE;
        int kleinste = Integer.MAX_VALUE;
        for (int j = 0; j < punten.length; j++){
            System.out.println(punten[j]);
            if(grootste < punten[j]){
                grootste = punten[j];
            }
            if(kleinste > punten[j]){
                kleinste = punten[j];
            }
        }
        System.out.println("Grootste & kleinste: ");
        System.out.println(grootste);
        System.out.println(kleinste);
        int aantal = 0;
        for(int x = 0; x < aantalJuryLeden; x++){
            if(punten[x] != grootste && punten[x] != kleinste){
                aantal = aantal + punten[x];
            }else {
                System.out.println("grootste of kleinste negeren");
            }
        }
        int gemiddelde = aantal / (aantalJuryLeden-2);
        System.out.println(gemiddelde);
    }
}


