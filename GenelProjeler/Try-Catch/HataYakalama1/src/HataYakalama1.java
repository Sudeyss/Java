// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HataYakalama1 {
    public static void main(String[] args) {
        Exception e1 = new Exception();
        Exception e2 = new Exception("Hata Mesajı");
        Exception e3 = new Exception("Yeni Hata Mesajı", e2);
        Exception e4 = new Exception(e3);
        String mesaj = e1.getMessage();
        System.out.println(mesaj);
        mesaj = e2.getMessage();
        System.out.println(mesaj);
        mesaj = e3.getMessage();
        System.out.println(mesaj);
        mesaj = e4.getMessage();
        System.out.println(mesaj);
    }
}
