import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numbers[] = {10, 3, 7, 15, 18, 56, 22, 52};



       // Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            //{10,3,7,15,18,56,22,52}
            if (numbers[i] > numbers[i + 1]) {
                int gecici = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = gecici;
            }
            //System.out.println(numbers[i]);
        }
        /*for (int i = 1; i < numbers.length ; i++) {
            //{10,3,7,15,18,56,22,52}
            if (numbers[i] < numbers[i - 1]) {
                int gecici = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = gecici;
            }
            System.out.println(numbers[i - 1]);
       } */
    }
}