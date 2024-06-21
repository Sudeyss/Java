import java.util.Scanner;

public class HarfNotuHesaplama {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int BasariNotu;
        System.out.println("Lütfen Başarı Notunu Giriniz");
        BasariNotu = klavye.nextInt();

        if (90 <= BasariNotu && BasariNotu <= 100) {
            System.out.println("Harf Başarı Notu: AA");
            System.out.println("Katsayı: 4.0");
        } else if (80 <= BasariNotu && BasariNotu <= 89) {
            System.out.println("Harf Başarı Notu: BA");
            System.out.println("Katsayı: 3.5");
        } else if (70 <= BasariNotu && BasariNotu <= 79) {
            System.out.println("Harf Başarı Notu: BB");
            System.out.println("Katsayı: 3.0");
        } else if (65 <= BasariNotu && BasariNotu <= 69) {
            System.out.println("Harf Başarı Notu: CB");
            System.out.println("Katsayı: 2.5");
        } else if (60 <= BasariNotu && BasariNotu <= 64) {
            System.out.println("Harf Başarı Notu: CC");
            System.out.println("Katsayı: 2.0");
        } else if (0 <= BasariNotu && BasariNotu <= 59) {
            System.out.println("Harf Başarı Notu: FF");
            System.out.println("Katsayı: 0.0");
        } else {
            System.out.println("Girilen puan 0-100 aralığı dışında");
        }
    }
}