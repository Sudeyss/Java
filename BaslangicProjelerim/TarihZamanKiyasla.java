import java.time.LocalDate;

public class TarihZamanKiyasla {

	public static void main(String[] args) {
	LocalDate tarih1 = LocalDate.of(2023, 10, 30);
	LocalDate tarih2 = LocalDate.of(2023, 11, 1);
	int kiyaslama = tarih1.compareTo(tarih2);
	if (kiyaslama < 0) {
		System.out.println("Tarih1, Tarih2'den önce.");
	}
	else if (kiyaslama > 0) {
		System.out.println("Tarih1, Tarih2'den sonra.");
	}
	else {
		System.out.println("Tarih1 ve Tarih2 eşit.");	
	}	
	}
}