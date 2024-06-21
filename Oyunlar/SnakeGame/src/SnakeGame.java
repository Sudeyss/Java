import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {

    private class Tile {
        public static Tile snakePart;
        int x, y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int boardWidth;
    int boardHeight;
    int tileSize = 25; // kare boyutu tanımlandı

    // Snake
    Tile snakeHead;
    ArrayList<Tile> snakeBody; // yılan vücudu adında bir arraylist oluşturuldu

    // Food
    Tile food;
    Random random;

    // game logic
    Timer gameLoop;
    int velocityX; // x yönünde bir hız tanımlaması yapıldı
    int velocityY;
    boolean gameOver = false;

    public SnakeGame(int boardHeight, int boardWidth) {

        this.boardHeight = boardHeight;
        this.boardWidth = boardWidth;
        setPreferredSize(new Dimension(this.boardHeight, this.boardWidth));// tercih edilen panel boyutu ayarla
        setBackground(Color.black);
        addKeyListener(this); // klavye tuşları için bir dinleyici oluşturuluyor
        setFocusable(true); // klavye olaylarına tepki vereceği söyleniyor

        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<Tile>();

        food = new Tile(10, 10);
        random = new Random();
        placeFood();

        velocityX = 0;
        velocityY = 0;

        gameLoop = new Timer(100, this);
        gameLoop.start();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        // Food
        g.setColor(Color.red);
        // g.fillRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize);
        g.fill3DRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize, false);

        // Snake Head
        g.setColor(Color.green);
        // g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize,
        // tileSize);
        g.fill3DRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize, false);

        // Snake Body
        for (int i = 0; i < snakeBody.size(); i++) {
            Tile.snakePart = snakeBody.get(i);
            // g.fillRect(Tile.snakePart.x * tileSize, Tile.snakePart.y * tileSize,
            // tileSize, tileSize);
            g.fill3DRect(Tile.snakePart.x * tileSize, Tile.snakePart.y * tileSize, tileSize, tileSize, false);
        }

        // Score
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        if (gameOver) {
            g.setColor(Color.red);
            g.drawString("Game Over: " + String.valueOf(snakeBody.size()), tileSize - 16, tileSize);
        } else {
            g.drawString("Score: " + String.valueOf(snakeBody.size()), tileSize - 16, tileSize);
        }
    }

    // yılan yeminin konumunu rastgele ayarlayan fonksiyon
    public void placeFood() {
        food.x = random.nextInt(boardWidth / tileSize); // 600/25=24 yani 0 dan 24 e kadar rastgele bir sayı üret
        food.y = random.nextInt(boardHeight / tileSize);
    }

    public boolean collision(Tile tile1, Tile tile2) {
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }

    public void move() {
        // eat food
        if (collision(snakeHead, food)) {
            snakeBody.add(new Tile(food.x, food.y));
            placeFood();
        }
        // Snake Body
        // yediğimiz yemlerin yılanın gövdesiyle birlikte hareket etmesini sağlar
        for (int i = snakeBody.size() - 1; i >= 0; i--) {
            Tile snakePart = snakeBody.get(i);
            if (i == 0) {
                snakePart.x = snakeHead.x;
                snakePart.y = snakeHead.y;
            } else {
                Tile prevSnakePart = snakeBody.get(i - 1);
                snakePart.x = prevSnakePart.x;
                snakePart.y = prevSnakePart.y;
            }
        }

        // Snake Head
        snakeHead.x += velocityX;
        snakeHead.y += velocityY;

        // game over conditions yani oyun bitimi koşulları
        for (int i = 0; i < snakeBody.size(); i++) {
            Tile snakePart = snakeBody.get(i);
            // collide with the snake head yani yılan kafasaıyla çarpışırsa
            if (collision(snakeHead, snakePart)) {
                gameOver = true;
            }
        }
        if (snakeHead.x * tileSize < 0 || snakeHead.x * tileSize > boardWidth ||
                snakeHead.y * tileSize < 0 || snakeHead.y * tileSize > boardHeight) {
            gameOver = true;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint(); // yeniden boyama işlemi
        if (gameOver) {
            gameLoop.stop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityY != -1) {
            velocityX = 0;
            velocityY = +1;
        } else if (e.getKeyCode() == KeyEvent.VK_UP && velocityY != +1) {
            velocityX = 0;
            velocityY = -1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityX != -1) {
            velocityX = 1;
            velocityY = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && velocityX != 1) {
            velocityX = -1;
            velocityY = 0;
        }
    }

    // alttakilere ihtiyacımız yok, asıl iş üsttekinde gerçekleşmekte
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
