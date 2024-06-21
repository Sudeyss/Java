import java.util.*;
public class HesapMakinesi {
	public static void main(String [] args) {
	Scanner klavye = new Scanner(System.in);
	System.out.println("Bir sayi giriniz");
	double a = klavye.nextDouble();
	System.out.println("Bir sayi daha giriniz");
	double b = klavye.nextDouble();
	System.out.println("Islem operataru giriniz: +, -, *, /");
	String operator = klavye.next();
	switch(operator){
		case "+","topla" : {
			System.out.println("Girilen Sayilarin Toplami Sonucu: " + (a+b));
		}
		break;
	case "-" : {
			System.out.println("Girilen Sayilarin Farki: " + (a-b));
		}
		break;	
		case "*" : {
			System.out.println("Girilen Sayilarin Carpimi: " + (a*b));
		}
		break;		
	case "/" : {
			System.out.println("Girilen Sayilarin Bolumu: " + (a/b));
		}
		break;	
	
	default:
		System.out.println("Islem Belirlenemedi");
	}
 }
}	