/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kal�t�m;

/**
 *
 * @author soylu
 */
public class Hemsire extends Kullanici {
    
    public Hemsire(String Ad, String Soyad) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.KullaniciTur = "Hem�ire";
    }
    public void AsiYap(Hasta hasta) {
        System.out.println(hasta.Ad + " " + hasta.Soyad+ "isimli hastaya " + 
                " a�� yap�ld� ");
    }    
    public void TahlilYap(Hasta hasta) {
        System.out.println(hasta.Ad + " " + hasta.Soyad+ "isimli hastaya " + 
                "tahlil yap�ld�");
    }
    public void KanTestiYap(Hasta hasta) {
        System.out.println(hasta.Ad + " " + hasta.Soyad+ "isimli hastaya " + 
                "kan testi yap�ld�");
        hasta.KanGrubu = "ARh+";
        System.out.println(hasta.Ad + " " + hasta.Soyad+ " isimli hastan�n "+ "kan grubu: "+ hasta.KanGrubu);
        
      }
} 
