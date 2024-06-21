import java.io.*;
import java.nio.charset.Charset;

public class BufferedReader {
    public static void main(String[] args) {
        try {
            File dosya = new File("D:\\dosya.txt");
            java.io.BufferedReader okuyucu = new java.io.BufferedReader(new FileReader(dosya, Charset.forName("UTF-8")));
            String line;
            while ((line = okuyucu.readLine()) != null) {
                System.out.println(line);
            }
            okuyucu.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}