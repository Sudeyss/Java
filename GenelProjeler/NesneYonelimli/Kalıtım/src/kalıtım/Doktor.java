/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kal�t�m;

/**
 *
 * @author soylu
 */
class Doktor extends Kullanici {
    public String Bolum;
   
    public Doktor(String Ad, String Soyad, String Bolum) {
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Bolum = Bolum;
        this.KullaniciTur ="Doktor";
    }
    public void MuayeneYap(Hasta hasta) {
        System.out.println(hasta.Ad+" "+hasta.Soyad+" isimli hastay� "
        +""+this.Ad+" "+this.Soyad+" isimli doktor muayene etti");
    }
    public void �lacYaz(Hasta hasta) {
    System.out.println(hasta.Ad+" "+hasta.Soyad+" isimli hastaya "
        +" ila� yaz�ld�");    
    }  
    
    public void TedaviYap(Hasta hasta) {
        System.out.println(hasta.Ad + " "+hasta.Soyad+" isimli"+
                " hastaya tedavi yap�ld�");
    }
  }

