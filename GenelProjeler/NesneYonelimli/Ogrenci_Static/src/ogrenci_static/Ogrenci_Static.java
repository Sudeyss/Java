/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ogrenci_static;

/**
 *
 * @author soylu
 */
public class Ogrenci_Static {
    
    static String universite = "KSBÜ";
    public static void main(String[] args) {
        Ogrenci_Static o1 = new Ogrenci_Static();
        System.out.println(Ogrenci_Static.universite);
        Ogrenci_Static.getUniversite();
                
    }
    static void getUniversite(){
        System.out.println(Ogrenci_Static.universite);
    }
    
}

