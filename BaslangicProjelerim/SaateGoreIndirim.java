import java.time.*;
import java.util.*;

public class SaateGoreIndirim {

    public static void main(String[] args) {
        LocalDate mevcutTarih = LocalDate.now();
        int ayinGunu = mevcutTarih.getDayOfMonth();
        int haftaninGunu = mevcutTarih.getDayOfWeek().getValue();
        String haftaninGunuDeger = mevcutTarih.getDayOfWeek().toString();
        Calendar takvim = new GregorianCalendar();
        int GunNo = takvim.get(Calendar.DAY_OF_WEEK);
        int SaatNo = takvim.get(Calendar.HOUR_OF_DAY);
        double IndirimPuan;
        double FiyatGomlek = 100;
        double FiyatTisort = 10;
        
        //System.out.println(GunNo);
        switch (GunNo) {
            case 1: // Pazar
                IndirimPuan= 0.6; //0.4
                break;
            case 2: // Pazartesi
                IndirimPuan= 0.9; 
                break;
            case 4: // Çarşamba
                IndirimPuan= 0.5;
                if (SaatNo < 13) IndirimPuan= 0.3;
                if (SaatNo > 21) IndirimPuan= 0.35;
                break;
            case 5: // Perşembe
                IndirimPuan= 0.9; 
                break;  
            case 7: // Cumartesi
                IndirimPuan= 0.5; 
                break;  
            default:
                IndirimPuan= 1;
        }
        
        if (IndirimPuan == 1) {
            System.out.println("Gün değeri alınamadı");
        } else {
            System.out.println(haftaninGunuDeger + " günü " + SaatNo + " saatinde Gömlek İndirimli Fiyatı " + (IndirimPuan * FiyatGomlek));
            System.out.println(haftaninGunuDeger + " günü " + SaatNo + " saatinde Tişört İndirimli Fiyatı " + (IndirimPuan * FiyatTisort));
        }
    }
}