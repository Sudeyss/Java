import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ElektronikDevre {
    public static void main(String[] args) {

        System.out.println("Lütfen gerilim değerini giriniz.");
        Scanner klavye = new Scanner(System.in);
        int gerilim = klavye.nextInt();
        if (gerilim < 0) {
            System.out.println("Lütfen 0'dan büyük bir değer giriniz!");
        }

        System.out.println("Lütfen direnç adedini giriniz.");
        int direncAdet = klavye.nextInt();
        if (direncAdet < 0) {
            System.out.println("Lütfen geçerli bir adet giriniz!");
        }


        System.out.println("Devreniz seri bağlı ise 1'i, paralel bağlı ise 2'yi tuşlayınız.");
        int secim = klavye.nextInt();


        double[] direncler = new double[direncAdet];

        for (int i = 0; i < direncAdet; i++) {
            System.out.print((i + 1) + ". direncin değerini girin: ");
            direncler[i] = klavye.nextDouble();
        }

        double toplamSeriDirenc = 0;
        double tersParalelDirenc = 0;
        double akim;

        for (double direnc : direncler) {
            toplamSeriDirenc += direnc;
        }

        if (secim == 1) {
            akim = gerilim / toplamSeriDirenc;
            System.out.println("Devrenizin akım değeri: " + akim);
        } else {
            for (double direnc : direncler) {
                tersParalelDirenc += 1 / direnc;
            }

            double toplamDirenc = 1 / tersParalelDirenc;
            akim = gerilim / toplamDirenc;
            System.out.println("Devrenizin akım değeri: " + akim);
        }
    }
}
