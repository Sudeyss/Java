// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


class AritmetikToplamaHatasiException extends Exception {

    public AritmetikToplamaHatasiException(String message) {
        super(message);
    }
}

class Hesaplayici {
    public int toplama(int sayi1, int sayi2) throws AritmetikToplamaHatasiException {
        if (sayi2 == 0 || sayi1 == 0) {
            throw new AritmetikToplamaHatasiException("Sıfırdan farklı sayılar giriniz");
        }
        return sayi1 + sayi2;
    }
}

public class HataYakalama5 {

    public static void main(String[] args) {
        Hesaplayici hesapla = new Hesaplayici();
        try {
            int sonuc = hesapla.toplama(10, 0);
            System.out.println("Sonuç: " + sonuc);
        } catch (AritmetikToplamaHatasiException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik hata: " + e.getMessage());
        }
    }
}

