import java.util.*;
import java.util.Scanner;
import javax.swing.*;

public class DikUcgenKenarBulma2 {
    public static void main(String[] args) {
        String girilenDeger;
        girilenDeger = JOptionPane.showInputDialog("Lütfen Hipotenüs Değerini Giriniz");
        double hipotenus = Double.parseDouble(girilenDeger);
        girilenDeger = JOptionPane.showInputDialog("Lütfen açı değerini giriniz:\n(Ondalık için nokta kullanınız");
        double aci = Double.parseDouble(girilenDeger);
        double aci2 = 90 - aci;
        JOptionPane.showMessageDialog(null, "Diğer açı= " + aci2);
        double karsiKenar = hipotenus * Math.sin(Math.toRadians(aci));
        JOptionPane.showMessageDialog(null, "Karşı kenar değeri= " + karsiKenar);
        double komsuKenar = Math.pow(hipotenus, 2) - Math.pow(karsiKenar, 2);
        komsuKenar = Math.sqrt(komsuKenar);
        JOptionPane.showMessageDialog(null, "Komşu kenar değeri= " + komsuKenar);
        double alan = (karsiKenar * komsuKenar) / 2;
        JOptionPane.showMessageDialog(null, "Dik üçgen alanı= " + alan);
        double cevre = hipotenus + komsuKenar + karsiKenar;
        JOptionPane.showMessageDialog(null, "Dik üçgenin çevresi= " + cevre);
    }
}