import java.io.*;

public class PGMDosyaOkuyucu {
    public static void main(String[] args) throws IOException {
        String dosyaYolu = "D:\\PGM\\coins.ascii.pgm";
        try (BufferedReader okuyucu = new BufferedReader(new FileReader(new File(dosyaYolu)))) {
            String baslik = okuyucu.readLine();
            String yorum = okuyucu.readLine();
            String[] boyut = okuyucu.readLine().split(" ");
            String maxDegerStr = okuyucu.readLine();
            System.out.println(boyut[0] + " " + boyut[2] + " " + maxDegerStr);

            int genislik = Integer.parseInt(boyut[0]);
            int yukseklik = Integer.parseInt(boyut[2]);
            int maxDeger = Integer.parseInt(maxDegerStr);

            int[] goruntuVerileri = new int[genislik * yukseklik];
            String line;

            while ((line = okuyucu.readLine()) != null) {
                String[] yenisiatir = new String[line.length()];
                System.out.println(line);
            }

               /* for (int i = 0; i < goruntuVerileri.length; i++) {
                    goruntuVerileri[i] = okuyucu.read();
                    System.out.println(goruntuVerileri[i]);
                }
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}