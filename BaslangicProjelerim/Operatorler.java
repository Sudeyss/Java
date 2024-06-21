public class Operatorler {
	public static void main(String args []) {
		int a = 3, d = 12, e = 7;
		float b = 8.7f, Toplam;
		String Ad = "Ahmet Sudeys" ,Soyad = "Soylu";
		
		Toplam = a + b;
		System.out.println("Toplam  \t"+ Toplam);
		System.out.println("Carpim  \t"+ (a*b));
		System.out.println("Bolme  \t"+ (a/b));
		System.out.println("Cikarma  \t"+ (a-b));
		System.out.println("Kalan Bulma Operatörü % " + (d%e));
		/*
		Toplama işareti String değişkenleri birleştirmek için de kullanılır.
		*/
		System.out.println("Ad Soyad: " + Ad + " " + Soyad);
		int x = a++, y = e++;
		System.out.println("x \t"+ x);
		System.out.println("y \t"+ y);
		System.out.println("a \t"+ a);
		System.out.println("e \t"+ e);
		int z = --a, t = --e;
		System.out.println("z \t"+ z);
		System.out.println("t \t"+ t);
		System.out.println("a \t"+ a);
		System.out.println("e \t"+ e);
	}
}	
		