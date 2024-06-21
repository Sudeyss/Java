/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalitim3;

/**
 *
 * @author soylu
 */
public class Arac {
    public String PlakaNo,model;
    public Arac(String PlakaNo) {
        this.PlakaNo = PlakaNo;
        System.out.println(this.PlakaNo+" plakalý araç oluþtu");
    }
    public void motorCalistir(String model) {
        this.model = model;
        System.out.println(this.PlakaNo+ " plakalý "+ this.model + " çalýþtý");
    } 
}
