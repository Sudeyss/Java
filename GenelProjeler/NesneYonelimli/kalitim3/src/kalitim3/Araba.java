/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalitim3;

/**
 *
 * @author soylu
 */
public class Araba extends Arac {
    public Araba(String PlakaNo) {
        super(PlakaNo);
    }
    public void motorCalistir(String araba) {
        super.motorCalistir(araba);
    }    
    public void guneslikAc() {
    System.out.println(super.PlakaNo + " plakalý "+ super.model + " "+ "güneþlik açtý");
    }    
}
