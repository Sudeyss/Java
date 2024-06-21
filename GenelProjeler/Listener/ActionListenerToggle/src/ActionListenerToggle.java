import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ActionListenerToggle {

    public static void main(String[] args) {
        JFrame cerceve = new JFrame("ToggleButton Örnek");
        JToggleButton toggleButton = new JToggleButton("Tıklayın lütfen");
        JLabel etiket = new JLabel();
        toggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    etiket.setText("Toggle buton açık");
                } else {
                    etiket.setText("Toggle buton kapalı");
                }
            }
        });

        cerceve.setLayout(new java.awt.FlowLayout());
        cerceve.add(toggleButton);
        cerceve.add(etiket);
        cerceve.setSize(300, 200);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cerceve.setVisible(true);
    }
}