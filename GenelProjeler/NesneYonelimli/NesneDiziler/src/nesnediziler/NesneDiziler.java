/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nesnediziler;


public class NesneDiziler {
    public static void main(String[] args) {
        Yemek menu[] = new Yemek[5];
        
        for(int i=0; i<menu.length; i++) {
            String ad = String.valueOf(i)+".yemek";
            menu[i] = new Yemek(ad);
        }
        System.out.println(menu[2].getAd());
    }
}
