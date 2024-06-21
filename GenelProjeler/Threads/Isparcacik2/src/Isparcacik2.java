// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Bu bir iş parçacığıdır");
    }
}

public class Isparcacik2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}