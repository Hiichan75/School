import java.util.Scanner;
import java.util.Arrays;

public class arrayE2 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};

        boolean gelijk = true;

        if(a.length == b.length) {
            for (int i = 0; i < a.length; i++){

                if (a[i] != b[i]) {
                    gelijk = false;
                }
            }1

            }else{
                gelijk = false;
            }
            if (gelijk == false) {
                System.out.println("beide arrays zijn niet gelijk");
            } else {
                System.out.println("beide arrays zijn wel gelijk");
            }



    }
}
