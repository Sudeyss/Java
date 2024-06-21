import java.util.Scanner;
import java.util.*;
public class DikUcgenKenarBulma {
	public static void main(String[] args) {
		Scanner klavye = new Scanner (System.in);
		System.out.println("Lütfen hipotenüs değerini giriniz");
		
		double hipotenus = klavye.nextDouble();
		System.out.println("Lütfen açı değerini giriniz: /n (Ondalık için virgül kullanınız)");
		double aci = klavye.nextDouble();
		double aci2 = 90-aci;
		System.out.println("Diğer açı= +aci2);
		double karsiKenar = hipotenus* Math.sin(Math.toRadians(aci));
		System.out.println("Karşı kenar değeri = " + karsiKenar);
		double komsuKenar = Math.pow(hipotenus,2)-Math.pow(karsiKenar,2);
		komsuKenar= Math.sqrt(komsuKenar);
		System.out.println("Komşu kenar değeri = " + komsuKenar);
		double alan = (karsiKenar*komsuKenar)/2;
		System.out.println("Dik üçgenin alanı= " + alan);
		double cevre = (karsiKenar+komsuKenar+hipotenus);
		System.out.println("Dik üçgenin çevresi = " + cevre);
	}
}
		