import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) throws IOException{
        try {

            File dosya = new File("D:\\dosya.txt");
            Scanner okuyucu = new Scanner(dosya, Charset.forName("UTF-8"));
            while (okuyucu.hasNextLine()) {
                String veri = okuyucu.nextLine();
                System.out.println(veri);
            }
            okuyucu.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}