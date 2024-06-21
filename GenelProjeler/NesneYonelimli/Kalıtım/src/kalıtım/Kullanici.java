/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalýtým;

/**
 *
 * @author soylu
 */
public class Kullanici {
    public String Ad, Soyad, KullaniciTur;
    public void GirisYap() { 
        System.out.println(this.KullaniciTur+" "+ this.Ad+" "+
                ""+this.Soyad+" Giriþ Yaptý");
    }

    public void CikisYap() {
        System.out.println(this.KullaniciTur+" "+ this.Ad+" "+
                ""+this.Soyad+" Çýkýþ Yaptý");
    }
}
