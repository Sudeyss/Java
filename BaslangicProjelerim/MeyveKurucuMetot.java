/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author soylu
 */
public class MeyveKurucuMetot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Meyve meyveA = new Meyve("Elma", "Kırmızı");
        Meyve meyveB = new Meyve("Erik", "Sarı");
        System.out.println(meyveA.Renk + " " + meyveA.Ad);
        System.out.println(meyveB.Renk + " " + meyveB.Ad);
    }       
}

class Meyve {
    String Ad, Renk;
    
    public Meyve(String Ad, String Renk) {
        this.Ad = Ad;
        this.Renk = Renk;
    }
}
