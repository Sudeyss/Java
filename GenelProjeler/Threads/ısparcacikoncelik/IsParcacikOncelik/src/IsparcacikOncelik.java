
public class IsparcacikOncelik {
    public static void main(String[] args) {
        Test test1 = new Test("1. iş parçacığı =>  ");
        Test test2 = new Test("2. iş parçacığı =>  ");
        Thread thread = new Thread(test1);
        Thread thread1 = new Thread(test2);
        thread.start();
        thread1.start();
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            System.out.println("Hata");
        }
        System.out.println("Thread bitti.");
    }
}