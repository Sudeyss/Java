import java.util.Scanner;
import java.util.*;
public class CemberHesaplama {
	public static void main(String[] args) {
		Scanner klavye = new Scanner (System.in);
		System.out.println("Lütfen çemberin çapını giriniz");
		//Klavyeden alınan değer int olarak alınıyor
		long cap = klavye.nextLong();
		double cevre = 2*Math.PI*(cap/2);
		double alan = Math.PI*Math.pow(cap,2);
		System.out.println(" Çapı" + cap + " olan çemberin çevresi = "+ cevre);
		System.out.println(" Çapı" + cap + " olan çemberin alanı = "+ alan);
	}
}
		