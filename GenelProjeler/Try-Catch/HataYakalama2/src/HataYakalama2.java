// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HataYakalama2 {
    public static void main(String[] args) {
        Exception e1 = new Exception();
        Exception e2 = new Exception("Hata Mesajı", e1);
        Exception e3 = new Exception("Yeni Hata Mesajı", e2);
        e3.printStackTrace();
    }
}