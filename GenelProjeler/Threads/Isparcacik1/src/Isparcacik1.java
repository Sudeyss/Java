// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class MyThread extends Thread {
    public void run()  {
        System.out.println("Bu bir iş parçacığıdır.");
    }
}
public class Isparcacik1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}