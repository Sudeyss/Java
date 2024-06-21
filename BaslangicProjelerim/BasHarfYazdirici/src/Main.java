import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Kelimeyi Giriniz");
        String kelime = klavye.nextLine();

        ArrayList<Character> basharfler = new ArrayList<>();
        basharfler.add(kelime.charAt(0));

        for(int i = 1; i<kelime.length(); i++) {
            if(kelime.charAt(i) == ' ') {
                basharfler.add(kelime.charAt(i+1));
            }
        }
        System.out.print(basharfler);
    }
}
