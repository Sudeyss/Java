import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IsparcacikHavuzu {
    public static void main(String[] args) {
      ExecutorService executor = Executors.newFixedThreadPool(5);
    for ( int i = 0; i < 10; i++) {
        Runnable isci = new CalisanIsParcacik("Görev "+ (i+1));
        executor.execute(isci);
    }
    executor.shutdown();
    while (!executor.isTerminated()) {

    }
        System.out.println("Tüm işler tamamlandı.");
    }
}