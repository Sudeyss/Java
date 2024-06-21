import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class SekilOlusturucu extends JPanel implements MouseListener, MouseMotionListener {
    private Point baslangicNoktasi;
    private Point bitisNoktasi;
    public String sekilTuru;

    public SekilOlusturucu() {
        addMouseListener(this); // Fare tıklama olaylarını dinlemek için
        addMouseMotionListener(this); // Fare hareket ve sürükleme olaylarını dinlemek için
        //nesne oluşunca bunları aktifleştirmek için kurucu metot içerisine yazdım
    }

    @Override //çizim işlemleri burada
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (baslangicNoktasi != null && bitisNoktasi != null) {
            g.setColor(Color.BLACK);
            switch (sekilTuru) {
                case "dikdortgen":
                    int x = Math.min(baslangicNoktasi.x, bitisNoktasi.x);
                    int y = Math.min(baslangicNoktasi.y, bitisNoktasi.y);
                    int genislik = Math.abs(baslangicNoktasi.x - bitisNoktasi.x);
                    int yukseklik = Math.abs(baslangicNoktasi.y - bitisNoktasi.y);
                    g.drawRect(x, y, genislik, yukseklik);
                    break;
                case "cizgi":
                    g.drawLine(baslangicNoktasi.x, baslangicNoktasi.y, bitisNoktasi.x, bitisNoktasi.y);
                    break;
            }
        }else {
            g.setColor(Color.RED);
            g.drawString("Bir butonu seçerek çizime başla", 310,35);
        }
    }

    @Override //fare tıklandığında
    public void mousePressed(MouseEvent e) {
        baslangicNoktasi = e.getPoint(); //başlangıç noktası alındı
    }

    @Override //fare bırakıldığında
    public void mouseReleased(MouseEvent e) {
        bitisNoktasi = e.getPoint(); //bitiş noktası alındı
        repaint(); //çizim işlemini sağlıyor
    }

    //aşağıdakilerin hiçbirini kullanmayacağım hata vermemesi için eklemeliyim
    @Override
    public void mouseClicked(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    @Override
    public void mouseDragged(MouseEvent e) {
    }
    @Override
    public void mouseMoved(MouseEvent e) {
    }
}