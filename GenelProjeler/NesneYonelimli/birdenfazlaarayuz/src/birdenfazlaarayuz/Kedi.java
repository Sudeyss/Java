/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package birdenfazlaarayuz;

public class Kedi implements SesliHayvan, KosanHayvan {
    
   @Override
   public void SesCikar() {
       System.out.println("Miyav!");
    }
   @Override
   public void Kos() {
       System.out.println("Kedi koþuyor");  
  }
}   
