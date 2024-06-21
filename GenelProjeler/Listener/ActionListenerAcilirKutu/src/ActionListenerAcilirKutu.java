import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionListenerAcilirKutu {

    public static void main(String[] args) {
        JFrame cerceve = new JFrame("Açılır Kutu Örneği");
        String[] takimlar = {"Galatasaray", "Beşiktaş", "Fenerbahçe"};
        JComboBox<String> acilirKutu = new JComboBox<>(takimlar);
        JLabel etiket = new JLabel();
        acilirKutu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                String secilenEleman = (String) cb.getSelectedItem();
                etiket.setText("Şampiyon: " + secilenEleman);
            }
        });

        cerceve.setLayout(new java.awt.FlowLayout());
        cerceve.add(acilirKutu);
        cerceve.add(etiket);
        cerceve.setSize(300, 200);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cerceve.setVisible(true);
    }
}
