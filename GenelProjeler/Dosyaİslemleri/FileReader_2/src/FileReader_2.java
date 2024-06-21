import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReader_2 {
    public static void main(String[] args) {
        try {
            File dosya = new File("D:\\dosya.txt");
            FileReader dosyaOkuyucu = new FileReader(dosya, Charset.forName("UTF-8"));
            System.out.println("Karakter okuma :");
            int i;
            while ((i = dosyaOkuyucu.read()) != -1) {
                System.out.print((char) i);
            }
            dosyaOkuyucu.close();
            System.out.println("\nDosya okuyucu kapatıldı");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}