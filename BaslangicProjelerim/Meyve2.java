
public class Meyve2 {
    
    String Ad = "Kiraz";
    String Renk = "Bordo";

    public static void main(String[] args) {
        Meyve2 meyve = new Meyve2();
        System.out.println(meyve.Ad);
        System.out.println(meyve.Renk);
        meyve.Sula();
        meyve.Topla();
    }
    
    static void Sula() {
        System.out.println("Meyve sulanıyor");
    }
    static void Topla() {
        System.out.println("Meyve toplanıyor");  
    }
}
