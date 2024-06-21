// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HataYakalama4 {
    public static void main(String[] args) {
        try {
            int sonuc = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Bir matematik hatası oluştu: " + e.getMessage());
        } finally {
            System.out.println("İşlem tamamlandı.");
        }
    }
}