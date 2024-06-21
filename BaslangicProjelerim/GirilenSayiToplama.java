import java.util.Scanner;
public class GirilenSayiToplama {
	public static void main(String[] args) {
	Scanner klavye = new Scanner(System.in);
	System.out.println("Lütfen sayi adedini giriniz");
	int sayiAdet = klavye.nextInt();
	int[] sayilar = new int[sayiAdet];
	for(int k= 0;k<sayilar.length; k++){
		System.out.println("Lütfen "+(k+1)+"• sayiyi giriniz");
		sayilar[k] = klavye.nextInt();
}
	int toplam =0;
	for (int k=0;k<sayilar.length;k++){
		toplam =sayilar[k]+toplam;
	}
	System.out.println("Klavyeden Sayılar :");
	for(int k=0; k<sayilar.length;k++){
		System.out.println(sayilar[k]);
	}
	System.out.println("Klavyeden Girilen Sayıların Toplamı: "+toplam);
	}}
	