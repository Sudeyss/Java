/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adamasmaca;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author soylu
 */
public class AnaPencere extends javax.swing.JFrame {

    String[] Harfler = { "A", "B", "C", "Ç", "D", "E", "F", "G", "Ğ", "H", "I", "İ", "J", "K", "L", "M", "N", "O", "Ö",
            "P", "R", "S", "Ş", "T", "U", "Ü", "V", "Y", "Z" };
    String[] Kelimeler = { "Renk", "Bardak", "Kalem", "Isparta", "Rabia", "Rampa" };
    String[] Ipuclari = { "Mavi, Yeşil, Kırmızı, Turuncu...", "Susadığında Kullanırsın", "Defterin Yanında Olur",
            "Güller Şehri", "Canımdan Çok Severim" };
    String Kelime;
    int KelimeSecim;
    int Hak = 5;
    int x = 15, y = 10, w = 50, h = 45;
    Color renk = new Color(255, 255, 255);
    int[] KelimeBilmeDurum;

    private Map<String, String> kelimeIpuclari = new HashMap<>();

    public AnaPencere() {
        initComponents();
        kelimeIpuclari.put("Renk", "Mavi, Yeşil, Kırmızı, Turuncu...");
        kelimeIpuclari.put("Bardak", "Susadığında Kullanırsın");
        kelimeIpuclari.put("Kalem", "Defterin Yanında Olur");
        kelimeIpuclari.put("Isparta", "Güller Şehri");
        kelimeIpuclari.put("Rabia", "Canımdan Çok Severim");

        KelimeBilmeDurum = KelimeOlustur();
        btnTekrarOyna.setEnabled(true);
        x = 10;
        pnlKelimeAlani.setLayout(new FlowLayout());
        for (int i = 0; i < Harfler.length; i++) {
            JButton harfButon = new JButton(Harfler[i]);
            harfButon.setFont(new Font("Arial", Font.BOLD, 18));
            harfButon.setBounds(x, y, w, h);
            x = x + w + 5;
            if (9 == i || i == 19) {
                y += h + 5;
                x = 10;
            }

            harfButon.addActionListener(new ActionListener() {
                private boolean isClicked = false;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!isClicked) {
                        JButton btn = (JButton) e.getSource();
                        String harf = btn.getText();

                        HarfKontrol(harf);

                        // Butonun etkinliğini devre dışı bırak
                        btn.setEnabled(false);
                        isClicked = true;
                    }
                }
            });

            pnlHarfAlani.add(harfButon);
        }

    }

    private int[] KelimeOlustur() {
        KelimeSecim = (int) (Math.random() * Kelimeler.length);
        Kelime = Kelimeler[KelimeSecim].toUpperCase();
        KelimeBilmeDurum = new int[Kelime.length()];
        System.out.println(Kelime);
        for (int i = 0; i < Kelime.length(); i++) {
            JLabel harfEtiket = new JLabel("_");
            harfEtiket.setFont(new Font("Arial", Font.BOLD, 40));
            harfEtiket.setBounds(x, (y + 10), w + 5, h);
            harfEtiket.setForeground(Color.BLACK);
            harfEtiket.setSize(20, 40);
            harfEtiket.setBackground(renk);
            x += 55;
            harfEtiket.setEnabled(true);
            pnlKelimeAlani.add(harfEtiket);
            pnlKelimeAlani.setBackground(renk);
            KelimeBilmeDurum[i] = 0;
        }
        return KelimeBilmeDurum;
    }

    private void HarfKontrol(String harf) {
        int[] HarfBilmeDurum = new int[Kelime.length()];
        if (1 <= Hak) {
            for (int i = 0; i < Kelime.length(); i++) {
                HarfBilmeDurum[i] = 1;
                JLabel lblKelimeTahminH = (JLabel) pnlKelimeAlani.getComponent(i);
                char KelimeTahminHarf = Kelime.charAt(i);

                if (String.valueOf(KelimeTahminHarf).equals(harf)) {
                    lblKelimeTahminH.setForeground(Color.BLACK);
                    lblKelimeTahminH.setText(harf);
                    lblKelimeTahminH.setFont(new Font("Arial", Font.BOLD, 40));
                    lblKelimeTahminH.setSize(20, 40);
                    HarfBilmeDurum[i] = 0;
                    System.out.println(pnlKelimeAlani.getComponent(i));
                    KelimeBilmeDurum[i] = 1;
                }
            }
            if (Hak == 1)
                JOptionPane.showMessageDialog(null, "Son hakkımız.");
            int ToplamHarfBilme = 0, ToplamKelimeBilme = 0;
            for (int i = 0; i < HarfBilmeDurum.length; i++) {
                ToplamHarfBilme += HarfBilmeDurum[i];
                ToplamKelimeBilme += KelimeBilmeDurum[i];
            }
            System.out.println(ToplamHarfBilme);
            if (ToplamHarfBilme == Kelime.length()) {
                Hak--;
                if (Hak == 0)
                    Kaybettiniz();
                lblHak.setText("Hakkınız: " + Hak);
            } else if (ToplamKelimeBilme == Kelime.length()) {
                JOptionPane.showMessageDialog(null, "Tebrikler. Bildiniz");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlKelimeAlani = new javax.swing.JPanel();
        pnlHarfAlani = new javax.swing.JPanel();
        lblHak = new javax.swing.JLabel();
        btnTekrarOyna = new javax.swing.JButton();
        btnIpucu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adam Asmaca");

        pnlKelimeAlani.setPreferredSize(new java.awt.Dimension(565, 100));

        javax.swing.GroupLayout pnlKelimeAlaniLayout = new javax.swing.GroupLayout(pnlKelimeAlani);
        pnlKelimeAlani.setLayout(pnlKelimeAlaniLayout);
        pnlKelimeAlaniLayout.setHorizontalGroup(
                pnlKelimeAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        pnlKelimeAlaniLayout.setVerticalGroup(
                pnlKelimeAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        javax.swing.GroupLayout pnlHarfAlaniLayout = new javax.swing.GroupLayout(pnlHarfAlani);
        pnlHarfAlani.setLayout(pnlHarfAlaniLayout);
        pnlHarfAlaniLayout.setHorizontalGroup(
                pnlHarfAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        pnlHarfAlaniLayout.setVerticalGroup(
                pnlHarfAlaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE));

        lblHak.setText("Hakkınız: 5");

        btnTekrarOyna.setText("Tekrar Oyna");
        btnTekrarOyna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTekrarOynaActionPerformed(evt);
            }
        });

        btnIpucu.setText("İpucu");
        btnIpucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIpucuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(pnlHarfAlani,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(pnlKelimeAlani,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 619,
                                                                Short.MAX_VALUE))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblHak, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnTekrarOyna,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(66, 66, 66)
                                                                .addComponent(btnIpucu,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(335, Short.MAX_VALUE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pnlKelimeAlani, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlHarfAlani, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHak)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTekrarOyna)
                                        .addComponent(btnIpucu))
                                .addContainerGap(38, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTekrarOynaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTekrarOynaActionPerformed
        Component[] components = pnlHarfAlani.getComponents();
        for (Component comp : components) {
            if (comp instanceof JButton) {
                JButton harfButon = (JButton) comp;
                harfButon.setEnabled(true);
            }
        }

        // Yeni bir kelime oluştur ve oyunu sıfırla
        KelimeBilmeDurum = KelimeOlustur();
        Hak = 7;
        lblHak.setText("Hakkınız: " + Hak);

        // Harf alanını temizle
        pnlKelimeAlani.removeAll();
        pnlKelimeAlani.revalidate();
        pnlKelimeAlani.repaint();

        // Harf butonlarını tekrar oluştur
        pnlHarfAlani.removeAll();
        pnlHarfAlani.revalidate();
        pnlHarfAlani.repaint();

        x = 10;
        y = 10;

        for (int i = 0; i < Harfler.length; i++) {
            JButton harfButon = new JButton(Harfler[i]);
            harfButon.setFont(new Font("Arial", Font.BOLD, 18));
            harfButon.setBounds(x, y, w, h);
            x = x + w + 5;
            if (9 == i || i == 19) {
                y += h + 5;
                x = 10;
            }

            harfButon.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    HarfKontrol(harfButon.getText());
                    harfButon.setEnabled(false); // Harf butonunu pasifleştir
                }
            });

            pnlHarfAlani.add(harfButon);
        }

        // Kelime alanını temizle ve yeni harfleri yerleştir
        for (int i = 0; i < Kelime.length(); i++) {
            JLabel harfEtiket = new JLabel("_");
            harfEtiket.setFont(new Font("Arial", Font.BOLD, 40));
            harfEtiket.setBounds(x, (y + 10), w + 5, h);
            harfEtiket.setForeground(Color.BLACK);
            harfEtiket.setSize(20, 40);
            harfEtiket.setBackground(renk);
            x += 55;
            harfEtiket.setEnabled(true);
            pnlKelimeAlani.add(harfEtiket);
            pnlKelimeAlani.setBackground(renk);
            KelimeBilmeDurum[i] = 0;
        }

    }// GEN-LAST:event_btnTekrarOynaActionPerformed

    private void btnIpucuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnIpucuActionPerformed
        String secilenKelime = Kelime.toUpperCase();
        String ipucu = kelimeIpuclari.get(secilenKelime);

        if (secilenKelime.equals("ISPARTA")) {
            ipucu = "Güller Şehri";
        }
        if (secilenKelime.equals("RENK")) {
            ipucu = "Mavi, Yeşil, Kırmızı, Turuncu...";
        }
        if (secilenKelime.equals("BARDAK")) {
            ipucu = "Susadığında Kullanırsın";
        }
        if (secilenKelime.equals("KALEM")) {
            ipucu = "Defterin Yanında Olur";
        }
        if (secilenKelime.equals("RABİA")) {
            ipucu = "Canımdan Çok Severim";
        }

        // Kullanıcıya ipucunu göster
        JOptionPane.showMessageDialog(null, "İpucu: " + ipucu);

    }// GEN-LAST:event_btnIpucuActionPerformed

    private void Kaybettiniz() {
        JOptionPane.showMessageDialog(null, "Kaybettiniz!!!\nKelime: " + Kelime);
        for (int i = 0; i < Kelime.length(); i++) {
            JLabel lblKelimeTahminiHarf = (JLabel) pnlKelimeAlani.getComponent(i);
            char KelimeTahminHarf = Kelime.charAt(i);
            lblKelimeTahminiHarf.setForeground(Color.BLACK);
            lblKelimeTahminiHarf.setText(String.valueOf(KelimeTahminHarf));
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaPencere.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaPencere.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaPencere.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaPencere.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaPencere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIpucu;
    private javax.swing.JButton btnTekrarOyna;
    private javax.swing.JLabel lblHak;
    private javax.swing.JPanel pnlHarfAlani;
    private javax.swing.JPanel pnlKelimeAlani;
    // End of variables declaration//GEN-END:variables

}
