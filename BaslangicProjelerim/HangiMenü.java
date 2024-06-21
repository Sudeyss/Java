import java.util.Scanner;

public class HangiMenü {
	public static void main(String[] Args) {
		
		Scanner klavye = new Scanner(System.in);
		
		while (true) {
		System.out.println("Lütfen istediğiniz menünün numarasını giriniz.");
		int GirilenNo = klavye.nextInt();
		
		
		switch (GirilenNo) {
			case 1: {
			System.out.println("Hamburger Menü - 40 TL");
			break;
			}
			case 2: {
			System.out.println("Pizza Menü - 30 TL");
			break;
			}
			case 3: {
			System.out.println("Makarna Menü - 20 TL");
			break;
			}
			case 4: {
			System.out.println("Salata Menü - 15 TL");
			break;
			}
			case 5: {
			System.out.println("Tatlı Menü - 10 TL");
			break;
			}
			default: {
				System.out.println("Geçersiz Menü Seçimi! ");
			}	
		}	
		}				
	}		
}								