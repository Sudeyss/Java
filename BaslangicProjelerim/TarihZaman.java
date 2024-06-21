import java.util.*;

public class TarihZaman {
	
	public static void main(String[] args) {
		Date bugun = new Date();
		System.out.println("Bugun " + bugun.toString());
		long simdi = bugun.getTime();
		System.out.println("Bugun " + bugun.getTime());
		
		/* bu satırları deneyerek da yazabiliriz
		* Calendar c = Calendar.getInstance();
		* c.setTime("23/2/2010");
		* int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		* System.out.println(dayOfWeek);
		*/
		
		Calendar calendar = new GregorianCalendar();
		int yil = calendar.get(Calendar.YEAR);
		int ay = calendar.get(Calendar.MONTH);
		int ayinGunu = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, 1 değildir
		int haftaninGunu = calendar.get(Calendar.DAY_OF_WEEK);
		int yilinHaftasi = calendar.get(Calendar.WEEK_OF_YEAR);
		int saat = calendar.get(Calendar.HOUR); // 12 saatlik
		int gununSaati = calendar.get(Calendar.HOUR_OF_DAY); // 24 saatlik
		int dakika = calendar.get(Calendar.MINUTE);
		int saniye = calendar.get(Calendar.SECOND);
		int milisaniye = calendar.get(Calendar.MILLISECOND);
	System.out.println(yil + " " + ay + " " + ayinGunu + " " + haftaninGunu + " " + yilinHaftasi + " " + saat + " " + gununSaati + " " + dakika + " " + saniye + " " + milisaniye + " " );
	}
}
		
		