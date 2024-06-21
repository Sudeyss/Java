/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kompozisyon;

/**
 *
 * @author soylu
 */
class Motor {
    private String motorTipi;
    
    public Motor(String motorTipi) {
        this.motorTipi = motorTipi;
    }
    
    public void calistir() {
        System.out.println("Motor Çalýþtý");
    }
}
class Direksiyon {
    public void SagaDon() {
        System.out.println("Araba saða döndü");
    }
    public void SolaDon() {
        System.out.println("Araba sola döndü");
    }
}

class Araba {
    private String marka;
    private String model;
    private Motor motor;
    private Direksiyon direksiyon;
    public Araba(String marka, String model, Motor motor, Direksiyon direksiyon) {
        this.marka=marka;
        this.model=model;
        this.motor=motor;
        this.direksiyon=direksiyon;
    }
       
   public void hareketeGec() {
       motor.calistir();
       System.out.println(marka+" "+model+ " hareket etti.");
   }
    public void DonusYap(String Yon) {
        switch(String.valueOf(Yon)) {
            case "Sað":
                direksiyon.SagaDon();
                break;
            case "Sol":
                direksiyon.SolaDon();
                break;
               default:
                   System.out.println("Yön Bilgisi Yok");
        }
    }
}  
    

