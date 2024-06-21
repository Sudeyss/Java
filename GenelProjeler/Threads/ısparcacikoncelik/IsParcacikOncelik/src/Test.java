public class Test implements Runnable {
    String name;

    public Test(String threadname) {
        name = threadname;
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Hata");
        }
        System.out.println(name + " bitiriliyor.");
    }
}
