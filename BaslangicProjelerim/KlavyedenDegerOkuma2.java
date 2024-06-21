import java.io.Console;
public class KlavyedenDegerOkuma2 {
	public static void main(String args[]) {
		// Console nesnesini olustur
		Console c = System.console();
		//klavyeden alınan değer
		String Isim = c.readLine("Lütfen isim giriniz: ");
		System.out.println("Isminiz : " + Isim);
		System.out.println(Isim instanceof String);
	}	
}	