import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;


public class OkumaHizi {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("D:\\metin.txt");
            Scanner okuyucu = new Scanner(file, Charset.forName("UTF-8"));
            int boslukSayisi = 0;
            while (okuyucu.hasNextLine()) {
                String satir = okuyucu.nextLine();
                boslukSayisi += satir.split(" ").length - 1;
            }
            okuyucu.close();
            System.out.println("Dosyadaki toplam kelime sayısı: " + (boslukSayisi + 1));
            System.out.println("Okuma süresi = " + (((boslukSayisi + 1)*60)/160) + " saniye");
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı: " + e.getMessage());
        }
    }
}
