import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DikkatOyunu extends JFrame implements MouseListener {
    private JButton button;
    private long baslamaZaman;
    private boolean tiklamaDurum = false;
    private int fareTiklama = 0;
    private int hiz = 500;

    public DikkatOyunu() {
        setTitle("Dikkat Oyunu");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        button = new JButton("Beni Yakala!");
        button.setBounds(150, 100, 150, 50);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (baslamaZaman == 0) {
                    baslamaZaman = System.currentTimeMillis();
                } else {
                    long bitisZaman = System.currentTimeMillis();
                    long gecenSure = bitisZaman - baslamaZaman;
                    JOptionPane.showMessageDialog(null, "Geçen süre: " + gecenSure + " milisaniye, tıklama sayısı: " + fareTiklama);
                    int puan = (int) ((10000 / gecenSure) * fareTiklama);
                    JOptionPane.showMessageDialog(null, "Puan: " + puan);
                    baslamaZaman = 0;
                    tiklamaDurum = true;
                }
            }
        });


    add(button);
this.addMouseListener(this);
    Thread thread = new Thread(new Runnable() {
        public void run() {
            while (!tiklamaDurum) {
                int x = (int) (Math.random() * (getWidth() - button.getWidth()));
                int y = (int) (Math.random() * (getHeight() - button.getHeight()));
                button.setLocation(x, y);
                try {
                    Thread.sleep(hiz);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    });
thread.start();
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DikkatOyunu frame = new DikkatOyunu();
                frame.setVisible(true);
            }
        });
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        fareTiklama++;
        System.out.println("Fare tıklandı.");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
