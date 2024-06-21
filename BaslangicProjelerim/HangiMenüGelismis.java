import java.util.Scanner;

public class HangiMenüGelismis {
	public static void main (String[] args) {
		Scanner klavye = new Scanner(System.in); 
		
		System.out.println("Seçmek istediğiniz menü numarasını tuşlayınız.");
		System.out.println("1:Hamburger (20 TL) 2:Pizza (25 TL) 3:Makarna (18 TL) 4:Salata (15 TL) 5:Tatlı (10 TL)");
		
		int MenuNo = klavye.nextInt();
		int ToplamFiyat=0;
		char ekstra;
		
switch (MenuNo) {
	case 1:
		ToplamFiyat+=20;
		break;
	case 2 :
		ToplamFiyat+=25;
		break;
	case 3 :
		ToplamFiyat+=18;
		break;
	case 4:
		ToplamFiyat+=15;
		break;
	case 5:
		ToplamFiyat+=10;
		break;	
	default:
		System.out.println("Geçersiz Menü Numarası");
	return; //programdan çıkmaya yarar.
	
    }
		Scanner klavye1 = new Scanner(System.in);
		
		System.out.println("Ekstra bir şey eklemek ister misiniz? (A-D arası harf giriniz)");
		System.out.println("A: patates (5 TL) B:Gazoz (4 TL) C:Ayran (3 TL) D:istemiyorum");
		
		 ekstra = klavye1.next().charAt(0); 
		 
	 
	
	switch (ekstra) {
		
		case 'A' :
		case 'a' :
			ToplamFiyat+=5;
		break;
		
		case 'B' :
		case 'b' :
			ToplamFiyat+=4;
		break;
		
		case 'C' :
		case 'c' :
			ToplamFiyat+=3;
		break;
		
		case 'D':
		case 'd':
			ToplamFiyat+=0;
		break;
		
		default:
			System.out.println("Geçersiz Harf Seçimi! ");
			System.out.println("Tekrar Tuşlayınız ");
		return;	//default sonrası break yerine return ile çıkış yapılır.
	}
		
		System.out.println("Toplam Borcunuz: " + ToplamFiyat + "TL");
		
	}
}	
		