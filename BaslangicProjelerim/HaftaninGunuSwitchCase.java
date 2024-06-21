import java.util.Scanner;

public class HaftaninGunuSwitchCase { 
	public static void main (String[] args) {
		Scanner klavye = new Scanner(System.in);
		/* Bu satır, System.in (klavyeden giriş) üzerinden veri okumak için yeni bir Klavye nesnesi oluşturur. Bu nesne, kullanıcıdan veri almak için kullanılır.
		*Klavye diye bi obje oluşturduk (bu aracı, yan, bir yardımcı) ve bunu yeni yeni bir Scanner nesnesi olarak oluştur. 
		*/
		
		while (true) {
		System.out.println("Lütfen haftanın gün numarasını girin (1-7 arasında)");
		int GunNumarasi = klavye.nextInt();
		/* Bu satır, kullanıcının girdiği sayıyı okur ve GunNumarasi adlı bir değişkene atar.
		* Yani ilk önce bir aracı oluşturduk ve bu aracıyı bir değişkene atadık. 
		*Şimdi de switch açarak bu değişken üzerinden koşulları belirteceğiz.
		*/
		
		switch (GunNumarasi) {
			case 1: 
				System.out.println("Pazartesi");
				break;
			case 2:
				System.out.println("Salı");
				break;
			case 3:
				System.out.println("Çarşamba");
				break;
			case 4:
				System.out.println("Perşembe");
				break;
			case 5:
				System.out.println("Cuma");
				break;
			case 6:
				System.out.println("Cumartesi");
				break;
			case 7:	
				System.out.println("Pazar");
				break;
				
			default : 
				System.out.println("Geçersiz bir gün numarası girdiniz.");
		}
		}		
	}			
}			
		
		