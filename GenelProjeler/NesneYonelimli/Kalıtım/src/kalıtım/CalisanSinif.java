/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kal�t�m;

/**
 *
 * @author soylu
 */
public class CalisanSinif {
    public static void main(String[] args) {
        Doktor doktor = new Doktor("Ahmet","Y�lmaz","Genel Cerrahi");
        Hemsire hemsire = new Hemsire("Ay�e","Aslan");
        Hasta hasta = new Hasta("Mehmet","Ba�aran");
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

