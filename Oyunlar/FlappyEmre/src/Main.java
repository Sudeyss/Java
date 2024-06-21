import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Emre");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FlappyBird flappyEmre = new FlappyBird();
        frame.add(flappyEmre);
        frame.pack();
        flappyEmre.requestFocus();
        frame.setVisible(true);
    }
}