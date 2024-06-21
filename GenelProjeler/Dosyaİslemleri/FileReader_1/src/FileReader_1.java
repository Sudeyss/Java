import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_1 {
    public static void main(String[] args) {
        try {

            File dosya = new File("D:\\dosya.txt");
            FileReader dosyaOkuyucu = new FileReader(dosya);
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