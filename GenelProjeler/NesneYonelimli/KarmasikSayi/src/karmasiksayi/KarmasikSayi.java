/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karmasiksayi;

/**
 *
 * @author soylu
 */
class KarmasikSayi {

    private double re, im;
    
    public KarmasikSayi(double re, double im) {
        this.re=re;
        this.im=im;
    }
    
    KarmasikSayi(KarmasikSayi c) {
        System.out.println("Kopyalama yapýcýsý çalýþtýrýldý");
        re = c.re;
        im = c.im;    
    }
    
    @Override
    public String toString() {
        return "(" + re + " + "+ im+ "i)";
    }
    public static void main(String[] args) {
       KarmasikSayi c1 = new KarmasikSayi(10,15);
       KarmasikSayi c2 = new KarmasikSayi(c1);
       
        System.out.println(c1);
        System.out.println(c2);
    }
}
