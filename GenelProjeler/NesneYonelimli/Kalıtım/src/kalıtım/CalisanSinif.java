/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalýtým;

/**
 *
 * @author soylu
 */
public class CalisanSinif {
    public static void main(String[] args) {
        Doktor doktor = new Doktor("Ahmet","Yýlmaz","Genel Cerrahi");
        Hemsire hemsire = new Hemsire("Ayþe","Aslan");
        Hasta hasta = new Hasta("Mehmet","Baþaran");
        hasta.GirisYap();
        hasta.RandevuAl(doktor);
        doktor.GirisYap();
        doktor.MuayeneYap(hasta);
        hemsire.GirisYap();
        hemsire.AsiYap(hasta);
        hemsire.KanTestiYap(hasta);
        hemsire.TahlilYap(hasta);
        hasta.CikisYap();
        doktor.CikisYap();
        hemsire.CikisYap();
        
  }
}

