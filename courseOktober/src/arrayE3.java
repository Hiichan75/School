import java.util.Scanner;
import java.util.Arrays;

public class arrayE3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("hoe groot is de array?:");
        int arrayGrootte = sc.nextInt();
        int[] waardes = new int[arrayGrootte];
        int evenGetallen = 0;


        int i = 0;

        do{
            System.out.println("geef een waarde in");
            int input = sc.nextInt();
            waardes[i] = input;
            i++;
        }while(i < arrayGrootte);
        System.out.println("de array ziet er zo uit");
        System.out.println(Arrays.toString(waardes));
        for (int j = 0; j < waardes.length; j++){
            if(waardes[j] % 2 == 0){
                evenGetallen++;
            }
        }
        System.out.println("je hebt " + evenGetallen + " even getallen");
        System.out.println("je hebt " + (waardes.length - evenGetallen) + " oneven getallen");


    }
}
