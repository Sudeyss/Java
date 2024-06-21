public class Meyve4 {

	public static void main(String[] args) {
		Meyve meyveA = new Meyve("Elma", "Kırmızı", "Ekşi");
		Meyve meyveB = new Meyve("Erik", "Sarı");
		System.out.println(meyveA.Renk + " " + meyveA.Ad + " " + meyveA.Tat);
		System.out.println(meyveB.Renk + " " + meyveB.Ad);
	}
}

class Meyve {

	String Ad, Renk, Tat;
	
	public Meyve(String Ad, String Renk) {
		this.Ad = Ad;
		this.Renk= Renk;
	}
	
	public Meyve(String Ad, String Renk, String Tat) {
		this(Tat);
		this.Ad = Ad;
		this.Renk = Renk;
	}
	
	public Meyve(String Tat) {
		this.Tat = Tat;
	}
}