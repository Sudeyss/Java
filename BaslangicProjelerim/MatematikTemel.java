import java.util.Scanner;
import java.util.*;

public class MatematikTemel {
    public static void main(String[] args) {
        double x = -4, y = 4;
        System.out.println(x + " sayısının mutlak değeri: " + Math.abs(x)); // abs: absolute: mutlak
        System.out.println(y + " sayısının mutlak değeri: " + Math.sqrt(y)); // sqrt: square root- karekök
        System.out.println(x + " " + y + " kuvveti: " + Math.pow(x, y)); // pow: power- kuvvet
        System.out.println(x + " sayısının küp kökü: " + Math.cbrt(x)); // cbrt: cube square

        System.out.println(x + " ve " + y + " sayılarının en büyüğü: " + Math.max(x, y));
        System.out.println(x + " ve " + y + " sayılarının en küçüğü: " + Math.min(x, y));

        x = 1.55;
        System.out.println(x + " sayısının en yakın tam sayısı: " + Math.round(x));

        x = 1.22;
        System.out.println(x + " sayısının aşağı doğru en yakın tam sayısı: " + Math.floor(x)); // floor: zemin

        x = 1.77;
        System.out.println(x + " sayısının yukarı doğru en yakın tam sayısı: " + Math.ceil(x)); // ceil: tavan
    }
}