import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.event.*;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {

        JFrame f = new JFrame("Vücut Kitle Endeksi Hesaplama");
        JButton btnHesapla = new JButton("Hesapla");
        JLabel lblAgirlik = new JLabel("Ağırlık (kg)");
        JLabel lblSonuc = new JLabel("Sonuç: ");
        JLabel lblBoy = new JLabel("Boy (cm)");
        JLabel lblDurum = new JLabel("Durum: ");
        JTextField txtAgirlik = new JTextField();
        JTextField txtBoy = new JTextField();
        lblAgirlik.setBounds(10, 20, 70, 30);
        lblBoy.setBounds(10, 60, 70, 30);
        txtAgirlik.setBounds(80, 20, 60, 30);
        txtBoy.setBounds(80, 60, 60, 30);
        btnHesapla.setBounds(80, 100, 80, 40);
        lblSonuc.setBounds(10, 130, 150, 40);
        lblDurum.setBounds(10, 160, 150, 40);
        btnHesapla.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double boy = Double.parseDouble(txtBoy.getText()) / 100;
                        double agirlik = Double.parseDouble(txtAgirlik.getText());
                        double vki = agirlik / (boy * boy);
                        System.out.println(vki);
                        vki = Math.round(vki);
                        lblSonuc.setText("Sonuç: " + Double.toString(vki));
                        if (vki <= 20) lblDurum.setText("Durum: Düşük Kilolu");
                        else if (
                                vki <= 25
                        ) lblDurum.setText("Durum: Normal");
                        else if (vki <= 30) lblDurum.setText(
                                "Durum: Aşırı Kilolu"
                        );
                        else if (vki <= 40) lblDurum.setText("Durum: Obez");
                        else lblDurum.setText(
                                    "Durum: Aşırı Obez"
                            );
                    }
                }
        );
        f.add(lblAgirlik);
        f.add(lblBoy);
        f.add(txtAgirlik);
        f.add(txtBoy);
        f.add(btnHesapla);
        f.add(lblSonuc);
        f.add(lblDurum);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );

    }
}