import java.util.*;
import java.util.Scanner;
import javax.swing.*;

public class SecenekKutuEvetHayir {
    public static void main(String[] args) {
        int sonuc = JOptionPane.showConfirmDialog(null,
                "Emin misin?", "Cevap Penceresi", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null, "Sonuç " + sonuc);
    }
}