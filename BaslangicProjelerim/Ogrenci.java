package okul;
public class Ogrenci {
    
    public String Ad, Soyad;
    public int okulNo;
    
    public Ogrenci(String Ad, String Soyad, int okulNo) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.okulNo = okulNo;
    }
    
    public void BilgiGetir() {
        System.out.println(Ad + " " + Soyad + " " + okulNo);
    }
}

  
    
