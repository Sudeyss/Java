import javax.swing.plaf.TableHeaderUI;

public class CalisanIsParcacik implements Runnable {
    private String gorevAd;

    public CalisanIsParcacik(String gorevAd) {
        this.gorevAd = gorevAd;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " iş parçacığı " + gorevAd + " işini gerçekleştiriyor.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println(Thread.currentThread().getName() + " iş parçacığı " + gorevAd + " işini tamamladı.");
    }
}
