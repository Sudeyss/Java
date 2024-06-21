// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Isparcacik3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Bu bir iş parçacığıdır.");
        });
        thread.start();
    }
}