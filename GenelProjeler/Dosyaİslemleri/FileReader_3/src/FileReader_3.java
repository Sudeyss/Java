import java.io.*;
import java.nio.charset.Charset;

public class FileReader_3 {
    public static void main(String[] args) {
        try {
            File dosya = new File("D:\\dosya.txt");
            FileReader dosyaOkuyucu = new FileReader(dosya, Charset.forName("UTF-8"));
            System.out.println("Dizi ile okuma :");
            char[] charArray = new char[10];
            dosyaOkuyucu.read(charArray);
            System.out.print(charArray);
            dosyaOkuyucu.close();
            System.out.println("\nDosya okuyucu kapatıldı");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}