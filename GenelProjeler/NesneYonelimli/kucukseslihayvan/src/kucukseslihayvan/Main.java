/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kucukseslihayvan;

/**
 *
 * @author soylu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SesliHayvan kedi = new Kedi();
        SesliHayvan kus = new Kus();
        SesliHayvan aslan = new Aslan();
        SesliHayvan kopek = new Kopek();
        kedi.SesCikar();
        kus.SesCikar();
        aslan.SesCikar();
        kopek.SesCikar();
    }
    
}
