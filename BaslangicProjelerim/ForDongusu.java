public class ForDongusu {
	public static void main(String[] args) {
		int Toplam=0;
		for(int i=1; i<=5; i=i+1) {
			Toplam = i + Toplam;
			System.out.println("Döngü içi: Toplam Değeri " + Toplam);
			System.out.println("Döngü içi: i Değeri " + i);
		}
		System.out.println("Döngü Dışı: Toplam Değeri " + Toplam);
	}
}