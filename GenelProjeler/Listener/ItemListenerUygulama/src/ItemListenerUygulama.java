import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerUygulama implements ItemListener {
    JCheckBox onayKutusu1, onayKutusu2;
    JLabel etiket;

    public ItemListenerUygulama() {
        JFrame pencere = new JFrame("ItemListener Örneği");
        pencere.setLayout(new FlowLayout());
        pencere.setSize(400, 200);

        onayKutusu1 = new JCheckBox("Seçenek 1");
        onayKutusu2 = new JCheckBox("Seçenek 2");
        etiket = new JLabel("Bir seçenek seçin");

        onayKutusu1.addItemListener(this);
        onayKutusu2.addItemListener(this);

        pencere.add(onayKutusu1);
        pencere.add(onayKutusu2);
        pencere.add(etiket);

        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == onayKutusu1) {
            etiket.setText("Seçenek 1 " + (e.getStateChange() == ItemEvent.SELECTED ? "seçildi" : "deselect edildi"));
        } else if (e.getSource() == onayKutusu2) {
            etiket.setText("Seçenek 2 " + (e.getStateChange() == ItemEvent.SELECTED ? "seçildi" : "deselect edildi"));
        }
    }

    public static void main(String[] args) {
        new ItemListenerUygulama();
    }
}
