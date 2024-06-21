import java.util.Scanner;
import java.util.*;

public class Trigonometri {
    public static void main(String[] args) {
        double radyanA, radyanB, dereceA = 30, dereceB;
        radyanA = Math.toRadians(dereceA); // Dereceyi radyana dönüştürü
        System.out.println(dereceA + " açısının radyanı = " + radyanA);
        System.out.println(dereceA + " açısının sinüsü = " + Math.sin(radyanA));
        System.out.println(dereceA + " açısının cosinüsü = " + Math.cos(radyanA));
        System.out.println(dereceA + " açısının tanjantı = " + Math.tan(radyanA));
        System.out.println(dereceA + " açısının cotanjantı = " + (1.0 / Math.tan(radyanA)));
        // Ters dönüşümler yapılıyor. Yukarıdaki açı değeri çıkması lazım
        radyanB = Math.asin(Math.sin(radyanA));
        dereceB = Math.toDegrees(radyanB);
        System.out.println(radyanA + " değerinin Arc sinüsü: " + dereceB);
        radyanB = Math.acos(Math.cos(radyanA));
        dereceB = Math.toDegrees(radyanB);
        System.out.println(radyanB + " değerinin Arc cosinüsü: " + dereceB);
    }
}
