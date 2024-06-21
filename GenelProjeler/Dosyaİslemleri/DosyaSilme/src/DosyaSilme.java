import java.io.File;

public class DosyaSilme {
    public static void main(String[] args) {
        File dosya = new File("silinecekDosya.txt");
        if (dosya.delete()) {
            System.out.println("Dosya silindi: "+ dosya.getName());
        }else {
            System.out.println("Dosya silinemedi");
        }
    }
}