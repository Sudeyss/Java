import java.time.*;
public class MevcutTarihZaman {
	public static void main(String[] args) {
		LocalDate mevcutTarih = LocalDate.now();
		LocalTime mevcutZaman = LocalTime.now();
		LocalDateTime mevcutTarihZaman = LocalDateTime.now();
		System.out.println("Bugün: " + mevcutTarih);
		System.out.println("Şu an: " + mevcutZaman);
		System.out.println("Şu an: " + mevcutTarihZaman);
	}
}	