import java.util.Scanner;
public class YontemToplamBulma {
	public static void main(String[] args) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("Lütfen Toplam Limitini Giriniz : ");
            int limit =klavye.nextInt();
            int toplam = topla(limit);
            System.out.println(limit+" sayısından 0 a kadar olan sayıların toplamı : "+toplam);
        }
            
        static int topla(int i){
            if(i>0)
                return topla(i - 1) + i;
            else 
                return 0;
        }}
	













