import java.util.Scanner;
public class UcSayidanBuyukBul {
	public static void main(String[] args) {
		
		//Scanner nesnesini oluştur
		Scanner klavye = new Scanner(System.in);
		
		//Klavyeden alınan ilk değer
		System.out.println("Lütfen bir sayı giriniz");
		
		//Klavyeden alınan değer long olarak alınıyor
		long a = klavye.nextLong();
		
		System.out.println("Lütfen bir sayı daha giriniz");
		long b = klavye.nextLong();
		
		System.out.println("Lütfen bir sayı daha giriniz");
		long c = klavye.nextLong();
		
		if (a>b && a>c ) {
			System.out.println( a+" sayısı en büyüktür. " );
		}
		else if (b>c) {
			System.out.println( b+" sayısı en büyüktür. " );
		}
		else {
			System.out.println( c+" sayısı en büyüktür. " );	
		}
	}
}	
		
		
		
		