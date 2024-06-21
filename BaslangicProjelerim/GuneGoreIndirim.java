import java.time.*;
import java.util.*;

public class GuneGoreIndirim {

    public static void main(String[] args) {
        LocalDate mevcutTarih = LocalDate.now();
        int ayinGunu = mevcutTarih.getDayOfMonth();
        int haftaninGunu = mevcutTarih.getDayOfWeek().getValue();
        String haftaninGunuDeger = mevcutTarih.getDayOfWeek().toString();        
        
        // Takvim Sınıfı Kullanarak Haftanın Gününü Bulma
        Calendar takvim = new GregorianCalendar();
        int GunNo = takvim.get(Calendar.DAY_OF_WEEK);
        
        double IndirimPuan;
        double FiyatGomlek = 100;
        double FiyatTisort = 10;
        
        // Aşağıdaki switch-case'de GunNo değişkeni kullanabilirsiniz.
        switch (GunNo) {
            case Calendar.SUNDAY:
                IndirimPuan = 0.6; //0.4 yani %40 indirim yaptı kalan yeni fiyat %60 oldu.
                break;
            case Calendar.MONDAY:
                IndirimPuan = 0.9;
                break;
            case Calendar.THURSDAY:
                IndirimPuan = 0.9;
                break;
            case Calendar.SATURDAY:
                IndirimPuan = 0.5;
                break;
            default:
                IndirimPuan = 1;
                System.out.println("Gün değeri alınamadı");
        }
        System.out.println(haftaninGunuDeger + " günü Gömlek İndirimli Fiyatı " + (IndirimPuan * FiyatGomlek));
        System.out.println(haftaninGunuDeger + " günü Tişört İndirimli Fiyatı " + (IndirimPuan * FiyatTisort));
    }
}