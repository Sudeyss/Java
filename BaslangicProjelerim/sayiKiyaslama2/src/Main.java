import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen sayı adedini giriniz");
        int numberQuantity = keyboard.nextInt();

        int[] numbers = new int[numberQuantity];


        for(int i=0; i<numberQuantity; i++) {
            System.out.println("Lütfen " + (i+1) + ". sayıyı girin" );
            numbers[i] = keyboard.nextInt();
        }

        //küçükten büyüğe sıralama işlemi
        for (int i=0; i<numberQuantity-1; i++) {
            for (int j=0; j<numberQuantity-i-1; j++) {
                if (numbers[j]>numbers[j+1]) {
                    int gecici = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers [j+1] = gecici;
                }
            }
        }
        System.out.println("Küçükten büyüğe sıralanış: ");
        for(int i=0; i<numberQuantity; i++) {
            System.out.println(numbers[i]);
        }
    }
}