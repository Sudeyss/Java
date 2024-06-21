// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HataYakalama3 {
    public static void main(String[] args) {
        Exception e1 = new Exception("Hata 1");
        StackTraceElement[] hataIzleme = e1.getStackTrace();
        for (StackTraceElement st : hataIzleme) {
            System.out.println(st.toString());
            System.out.println("Hata dosyası: " + st.getFileName());
            System.out.println("Hata satırı: " + st.getLineNumber());
            System.out.println("Hata metodu: " + st.getMethodName());
            System.out.println("Hata sınıfı: " + st.getClass());
        }
    }
}