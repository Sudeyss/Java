import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {
        double[] Dizi = {1, 2.0, 3.0, 3.5, 4, 4.5, 5};
        int d = 0;
        while( d < Dizi.length) {
            System.out.println(Dizi[d]);
            d++;
        }

        for (int i = 0; i < Dizi.length; i++) {
            System.out.println(Dizi[i]);
        }
    }
}
