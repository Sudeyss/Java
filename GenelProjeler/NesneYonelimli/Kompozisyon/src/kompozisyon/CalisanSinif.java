/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kompozisyon;

/**
 *
 * @author soylu
 */
public class CalisanSinif {
    public static void main(String[] args) {
        Araba araba = new Araba ("Togg", "T10X", new Motor("160 kw"), new Direksiyon());
        araba.hareketeGec();
        araba.DonusYap("Sað");
    }
}
