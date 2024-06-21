import java.util.Scanner;
import java.util.*;
public class Aritmetik{
	public static void main(String[] args) {
		long a = 10, b =9;
		double sonuc;
		System.out.println(a + " ve " + b + " sayılarının toplamı: " + Math.addExact(a,b));
		System.out.println(a + " ve " + b + " sayılarının farkı: " + Math.substractExact(a,b));
		System.out.println(a + " ve " + b + " sayılarının çarpımı: " + Math.multiplyExact(a,b));
		sonuc = (b/a); // Math.floorDiv(b,a);
		System.out.println(b + " sayısının " + a + " sayısına bölümü: "+ sonuc);
		System.out.println(a + " sayısını 1 artır " + Math.incrementExact(a));
		System.out.println(b + " sayısını 1 azalt " + Math.DecrementExact(b));
}
}