import java.time.Instant;

public class ZamanDamgasi {
	
	public static void main(String[] args) {
	
	//Şu anki tarih ve saat bilgisini alır.
	Instant now = Instant.now();
	
	//Zaman damgasını elde eder. (saniye cinsinden)
	long timestamp = now.getEpochSecond();
	
	//Zaman damgasını ekrana yazdırır.
	System.out.println("Zaman Damgası: " + timestamp);
   }
}
	

