/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ogrenci;


public class Ogrenci_Kapsulleme {


    private String ad;
    private int yas;
    private double harcUcreti;
          
    public static void main(String[] args) {
        Ogrenci_Kapsulleme o1 = new Ogrenci_Kapsulleme();
        o1.setAd("");
        o1.setYas(-1);
        o1.setHarcUcreti(0);
                
    }
    
    public String getAd() {
        return ad;
    }
    
    public void setAd(String yeniAd) {
        if (!yeniAd.equals("")) {
            this.ad = yeniAd;
        } else {
            System.out.println("L�tfen en az 3 harften olu�an bir isim giriniz");
            
        }
    }
    
    public int getYas() {
        return yas;
    }
    
    public void setYas(int Yas) {
        if (Yas>0) {
            this.yas = Yas;
        }else {
            System.out.println("L�tfen s�f�rdan b�y�k bir ya� de�eri giriniz");
        }
    }
    
    public double getHarcUcreti() {
        return harcUcreti;
    }
    
    public void setHarcUcreti(double value) {
        if (value > 0 ) {
            harcUcreti = value;
        }else {
            System.out.println("L�tfen s�f�rdan b�y�k bir har� �creti giriniz");
        }
        
    }
}
