import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Kelimenizi Girin");
        String kelime = klavye.nextLine();

        ArrayList<Character> sonHarfler = new ArrayList<>();
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == ' ') {
                sonHarfler.add(kelime.charAt(i - 1));
            }
        }
        int j = kelime.length();
        sonHarfler.add(kelime.charAt(j - 1));
        System.out.println(sonHarfler);
    }
}

