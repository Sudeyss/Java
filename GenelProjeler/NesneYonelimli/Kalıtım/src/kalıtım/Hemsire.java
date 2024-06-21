/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalýtým;

/**
 *
 * @author soylu
 */
public class Hemsire extends Kullanici {
    
    public Hemsire(String Ad, String Soyad) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.KullaniciTur = "Hemþire";
    }
    public void AsiYap(Hasta hasta) {
        System.out.println(hasta.Ad + " " + hasta.Soyad+ "isimli hastaya " + 
                " aþý yapýldý ");
    }    
    public void TahlilYap(Hasta hasta) {
        System.out.println(hasta.Ad + " " + hasta.Soyad+ "isimli hastaya " + 
                "tahlil yapýldý");
    }
    public void KanTestiYap(Hasta hasta) {
        System.out.println(hasta.Ad + " " + hasta.Soyad+ "isimli hastaya " + 
                "kan testi yapýldý");
        hasta.KanGrubu = "ARh+";
        System.out.println(hasta.Ad + " " + hasta.Soyad+ " isimli hastanýn "+ "kan grubu: "+ hasta.KanGrubu);
        
      }
} 
