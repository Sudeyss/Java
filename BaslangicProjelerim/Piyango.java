import java.util.Scanner;
import java.util.*;

public class Piyango {
    public static void main(String[] args) {
        int piyangoSayi = (int) (Math.random() * 10000);
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen 4 haneli piyango numarası giriniz:");
        // Klavyeden alınan değer int olarak alınıyor
        int piyangoBiletNo = klavye.nextInt();
        int piyangoDurum = 0;
        
        if(piyangoBiletNo < 10000 && 999 < piyangoBiletNo) {
            if(piyangoSayi == piyangoBiletNo)
                piyangoDurum = 1;
            else if (piyangoSayi % 100 == piyangoBiletNo % 100)
                piyangoDurum = 2;
            else if (piyangoSayi % 10 == piyangoBiletNo % 10)
                piyangoDurum = 3;
            
            switch(piyangoDurum) {
                case 1:
                    System.out.println("Tebrikler büyük ikramiye sizin");
                    break;
                case 2:
                    System.out.println("Tebrikler son 2 rakamı bildiniz");
                    break;
                case 3:
                    System.out.println("Tebrikler son rakamı bildiniz");
                    break;
                default:
                    System.out.println("Hiçbir şey çıkmadı!");
            }
        } else {
            System.out.println("Girilen sayı " + piyangoBiletNo + " geçersiz" );
        }
    }
}
