/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskov;

/**
 *
 * @author soylu
 */
class Dikdortgen extends Sekil {
    private double genislik,yukseklik;
    
    public Dikdortgen(double y, double g) {
        yukseklik = y;
        genislik = g;
    }
    
    @Override
    public double alanHesapla() {
        return genislik*yukseklik;
    }
    
    @Override
    public void bilgiGoruntule() {
        System.out.println("Dikdörtgen - Yükseklik: "+ yukseklik+ ", Geniþlik: "+genislik);    
    }
}
