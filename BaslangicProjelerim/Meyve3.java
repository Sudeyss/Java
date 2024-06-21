/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author soylu
 */
public class Meyve3 {
    
    String Ad, Renk;
    public static void main(String[] args) {
        
        Meyve3 meyveA = new Meyve3();
        Meyve3 meyveB = new Meyve3();
        meyveA.Sula("Sarı", "Erik");
        meyveB.Topla("Kırmızı", "Elma");
        System.out.println(meyveA.Renk + " " + meyveA.Ad);
        System.out.println(meyveB.Renk + " " + meyveB.Ad);
    }
    
    void Sula(String Renk, String Ad) {
        this.Ad = Ad;
        this.Renk = Renk;
        System.out.println(this.Renk + " " + this.Ad + " meyvesi sulanıyor");
    
    }
    void Topla(String Renk, String Ad) {
        this.Ad = Ad;
        this.Renk = Renk;
        System.out.println(this.Renk + " " + this.Ad + " meyvesi toplanıyor");
    }
        
}
