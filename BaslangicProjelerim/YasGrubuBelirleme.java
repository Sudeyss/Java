import java.util.Scanner;
public class YasGrubuBelirleme {
	public static void main(String[] args) {
	
		Scanner klavye = new Scanner(System.in);
		int Yas;
		System.out.println("Lütfen Yaş Değerini Giriniz.");
		Yas = klavye.nextInt();
		
		if (0<=Yas && Yas<=12)
			System.out.println("Yaş Grubunuz: 'Çocuk' ");
		if (13<=Yas && Yas<=19)	
			System.out.println("Yaş Grubunuz: 'Genç' ");
		if (20<=Yas && Yas<=59)
			System.out.println("Yaş Grubunuz: 'Yetişkin' ");
		if (Yas>=60)
			System.out.println("Yaş Grubunuz: 'Yaşlı' ");
			
		if (Yas<0)
			System.out.println("Geçersiz Yaş Girdiniz! ");
	}
}		