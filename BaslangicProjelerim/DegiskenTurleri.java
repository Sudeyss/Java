public class DegiskenTurleri {
	public static void main (String[] args) {
	//double değişkenler sonuna d belirteci koymamız gerekmektedir.
	double Maas = 123421.6341d;
	int Yas = 19;
	String Ad = "Sudeys";
	boolean Durum = true;
	//float değişkeni tanımlarken sonuna f belirteci koymamız gerekmektedir.
	float Ortalama = 28F;
	/* char değişkenler tek tırnak işaretleri arasında tanımlanır.
	Tek karakterler ve tüm UNICODE karakterleri saklayabilirler.
	*/
	char Harf= 'A';
	char unicodeKarakter = '\u015e';
	System.out.println("Maas  \t" + Maas);
	System.out.println("Yasi  \t" + Yas);
	System.out.println("Adi   \t" + Ad);
	System.out.println("Durumu  \t" + Durum);
	System.out.println("Harf  \t" + Harf);
	System.out.println("Ortalama  \t" + Ortalama);
	System.out.println("Unicode Karakter  \t" + unicodeKarakter);
	}
}	