import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Kelimenizi veya Cümlenizi Giriniz  ");

        String word = keyboard.nextLine();
        /* Not: Javada klavyeden string bir değer alırken
         next() kullanırsak boşluğa kadar olan kısmı, nextLine() kullanırsak tüm metni alır. */

        char[] letters = word.toCharArray();
        for (int i = letters.length; i >= 1; i--) {
            System.out.println(letters[i - 1]);
            // \t kullanımı anlaşılmadı, yan yana yazdırmak istiyorum
        }
    }
}



