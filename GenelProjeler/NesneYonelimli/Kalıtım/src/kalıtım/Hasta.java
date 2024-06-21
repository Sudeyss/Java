/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalýtým;

/**
 *
 * @author soylu
 */
class Hasta extends Kullanici {
    public String KanGrubu;
   

    public Hasta(String Ad, String Soyad) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.KullaniciTur = "Hasta";
    }
    public void RandevuAl(Doktor doktor) {
        System.out.println(doktor.Ad+" "+doktor.Soyad+" isimli "+
                ""+doktor.Bolum+" bölümünden randevu alýndý");
    }
}
