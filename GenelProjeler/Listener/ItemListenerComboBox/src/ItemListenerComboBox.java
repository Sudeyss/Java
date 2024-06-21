import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemListenerComboBox implements ItemListener {
    JComboBox<String> comboBox;
    JLabel label;

    public ItemListenerComboBox() {
        JFrame frame = new JFrame("ComboBox Örneği");
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 200);

        String[] items = {"Öğe 1", "Öğe 2", "Öğe 3"};
        comboBox = new JComboBox<>(items);
        label = new JLabel("Bir öğe seçin");

        comboBox.addItemListener(this);

        frame.add(comboBox);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setText("Seçilen: " + e.getItem().toString());
        }
    }

    public static void main(String[] args) {
        new ItemListenerComboBox();
    }
}
