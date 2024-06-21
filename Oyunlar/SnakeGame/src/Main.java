import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;  // pencere genişliği ve yüksekliği tanımlandı

        JFrame frame = new JFrame("Snake Game"); // bir pencere oluşturdu ve ismi "Snake Game"
        frame.setVisible(true); // oluşturduğu pencereyi görünüe hale getirdi. Bu olmazsa gözükmez!
        frame.setSize(boardWidth, boardHeight); //pencere tanımlanan değerlere göre boyutlandırıldı
        frame.setLocationRelativeTo(null); // pencerenin ekran ortasına konumlanmasını sağlar
        frame.setResizable(false); //kullanıcının kenarlardan pencereyi büyütüp küçültmesi engellenir
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // çarpı tuşunu ve basınca kapanması

        SnakeGame snakeGame = new SnakeGame(boardHeight, boardWidth);
        frame.add(snakeGame); //oyun JFrame'e eklenir
        frame.pack(); // bileşenler pencereye düzgün bir şekilde eklenir. şekil bozulması engellenir
        snakeGame.requestFocus();
    }
}   