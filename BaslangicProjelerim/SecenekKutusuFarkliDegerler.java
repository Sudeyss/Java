import java.util.*;
import java.util.Scanner;
import javax.swing.*;

public class SecenekKutusuFarkliDegerler {
    public static void main(String[] args) {
        String[] pastalar = {"Çilekli", "Krokan", "Kestane", "Muzlu", "Orman Meyveli"};
        String[] icecekler = {"Kola", "Gazoz", "Meyve Suyu", "Soda"};

        int pasta = JOptionPane.showOptionDialog(
                null,
                "Hangi pastayı seçmek istersin?", "Pasta Seçimi",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                pastalar,
                pastalar[0]
        );

        String secilenPasta = pastalar[pasta];
        String secilenIcecek = (String) JOptionPane.showInputDialog(
                null,
                "Hangi içeceği seçmek istiyorsun?",
                "İçecek Seçimi",
                JOptionPane.QUESTION_MESSAGE,
                null,
                icecekler,
                icecekler[0]
        );

        JOptionPane.showMessageDialog(
                null,
                "Seçilen Pasta: " + secilenPasta + "\nSeçilen İçecek: " + secilenIcecek
        );
    }
}