public class TurDonusumu_Basamaklar {
	public static void main(String args []){
	int Sayi = 372;
	int Birler,Onlar,Yuzler;
	Yuzler = (int) Sayi/100;
	Onlar = (int) (Sayi-(Yuzler*100))/10;
	Birler = (int) (Sayi-(Yuzler*100 + Onlar*10));
	
	System.out.println("Sayi: "+ Sayi
	+"\nBirler Basamagi "+ Birler
	+"\nOnlar Basamagi "+Onlar
	+"\nYuzler Basamagi "+Yuzler);
	}
}	