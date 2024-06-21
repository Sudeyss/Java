import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class ActionListenerUygulama {
    public static void main(String[] args) {
        JFrame cerceve = new JFrame("Menü Örneği");
        JMenuBar menuCubugu = new JMenuBar();
        JMenu menu = new JMenu("Seçenekler");
        JMenuItem menuEleman = new JMenuItem("Merhaba Millet");
        menuEleman.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(cerceve, "Merhaba Herkese");
            }
        });

        menu.add(menuEleman);
        menuCubugu.add(menu);
        cerceve.setJMenuBar(menuCubugu);
        cerceve.setSize(300, 200);
        cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cerceve.setVisible(true);
    }
}