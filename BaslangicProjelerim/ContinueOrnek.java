import java.util.Scanner;

public class ContinueOrnek{
	public static void main(String[] args) {
		int[] ogrenciNotlar = {30,40,80,90,76,44,55,50,55,90,86,59,75,33};
		for (int i = 0; i<ogrenciNotlar.length; i++) {
			int not = ogrenciNotlar[i];
			if (not < 50) {
				System.out.println("Bu öğrencinin notu 50'nin altında" + "Notu görüntülenmeyecek");
				continue; //Not 50'nin altındaysa geri kalan işlemleri atla ve tekrar en başa dön.
			}
				System.out.println("Öğrenci #" + i + " notu: " + not);
		}
	}
}