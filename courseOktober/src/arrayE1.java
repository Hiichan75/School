import java.util.Scanner;
import java.util.Arrays;

public class arrayE1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("hoe groot is de array?:");
        int arrayGrootte = sc.nextInt();
        int[] waardes = new int[arrayGrootte];

        int i = 0;
        do{
            System.out.println("geef een waarde in");
            int input = sc.nextInt();
            waardes[i] = input;
            i++;1
        }while(i < arrayGrootte);
        System.out.println("de array ziet er zo uit");
        System.out.println(Arrays.toString(waardes));

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int j = 0; j < waardes.length; j++) {
            if (waardes[j] == min) {
                min2 = min;
            } else if (waardes[j] < min) {
                min2 = min;
                min = waardes[j];
            } else if (waardes[j] < min2) {
                min2 = waardes[j];
            }
        }
        System.out.println("het tweede laagste getal is " + min2);
    }
}
