import java.util.Scanner;

public class faktöriyel{
	public static void main(String args[]){
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		
		int sayi = klavye.nextInt();
		
		int faktöriyel=1;
		
		for(i=1, i<sayi, i++) {
			faktöriyel= faktöriyel*i;
		}
		System.out.println(faktöriyel);
	}
}