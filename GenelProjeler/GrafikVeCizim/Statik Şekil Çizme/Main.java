import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        JFrame pencere = new JFrame("5 farklı şekil");
        SekilCizici panel = new SekilCizici();
        pencere.add(panel);
        pencere.setSize(800, 500);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setLocationRelativeTo(null); // bu satır pencereyi ortaya sabitler!
        pencere.setVisible(true);


    }
}