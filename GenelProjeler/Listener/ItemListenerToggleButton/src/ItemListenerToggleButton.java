import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerToggleButton implements ItemListener {
    JToggleButton toggleButton;
    JLabel label;

    public ItemListenerToggleButton() {
        JFrame frame = new JFrame("ToggleButton Örneği");
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);

        toggleButton = new JToggleButton("Açık/Kapalı");
        label = new JLabel("Durum: Kapalı");

        toggleButton.addItemListener(this);

        frame.add(toggleButton);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (toggleButton.isSelected()) {
            label.setText("Durum: Açık");
        } else {
            label.setText("Durum: Kapalı");
        }
    }

    public static void main(String[] args) {
        new ItemListenerToggleButton();
    }
}
