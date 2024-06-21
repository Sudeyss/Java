
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {
    public static void main(String[] args) {

        java.util.List<String> diller = new ArrayList<>();
        diller.add("Java");
        diller.add("Kotlin");
        diller.add("Scala");
        diller.add("Groovy");
        diller.add("Clojure");
        diller.add("JavaScript");
        diller.add("TypeScript");
        diller.add("Python");
        diller.add("Ruby");
        diller.add("C#");

        java.util.List<Integer> tamSayi = new LinkedList<>();
        tamSayi.add(1);
        tamSayi.add(2);
        tamSayi.add(3);
        tamSayi.add(4);
        tamSayi.add(5);
        tamSayi.add(6);
        tamSayi.add(7);
        tamSayi.add(8);
        tamSayi.add(9);
        tamSayi.add(10);

        java.util.List<Float> ondalikliSayi = new Vector<>();
        ondalikliSayi.add(1.1f);
        ondalikliSayi.add(2.2f);
        ondalikliSayi.add(3.3f);
        ondalikliSayi.add(4.4f);
        ondalikliSayi.add(5.5f);
        ondalikliSayi.add(6.6f);
        ondalikliSayi.add(7.7f);
        ondalikliSayi.add(8.8f);
        ondalikliSayi.add(9.9f);
        ondalikliSayi.add(10.0f);

        System.out.println("Listelerin ilk halleri aşağıdadır");
        System.out.println();

        //ilk hallerini yazdırmak için
        ListeYazdir(diller);
        ListeYazdir(tamSayi);
        ListeYazdir(ondalikliSayi);

        System.out.println();


        //ArrayList metotları
        System.out.println("ArrayList İçin Kullanılan Metotlar");

        diller.add("Unity");
        diller.add(1, "C++");
        diller.remove("C#");
        diller.remove(2);
        System.out.println("indexOf metot kullanımı sonucu:" + diller.indexOf("Java"));
        System.out.println("isEmpty metot kullanımı sonucu: " + diller.isEmpty());
        System.out.println("contains metot kullanımı sonucu: " + diller.contains("Swift"));
        System.out.println("size metot kullanımı sonucu: " + diller.size());
        System.out.println("get metot kullanımı sonucu: " + diller.get(0));
        System.out.println("toArray metot kullanımı sonucu: " + diller.toArray());

        System.out.println();

        //LinkedList metotları
        System.out.println("LinkedList İçin Kullanılan Metotlar");

        tamSayi.add(1);
        tamSayi.add(2, 5);
        tamSayi.addFirst(32);
        tamSayi.addLast(4);
        tamSayi.removeFirst();
        tamSayi.removeLast();
        tamSayi.remove("7");
        tamSayi.remove(3);
        System.out.println("indexOf metot kullanımı sonucu:" + tamSayi.indexOf(3));
        System.out.println("contains metot kullanımı sonucu: " + tamSayi.contains(5));

        System.out.println();

        //Vector metotları
        System.out.println("Vector İçin Kullanılan Metotlar");

        ondalikliSayi.add(1.1f);
        ondalikliSayi.add(1, 1.5f);
        ondalikliSayi.remove(2.2f);
        ondalikliSayi.remove(5);
        ondalikliSayi.set(0, 2.5f);
        ondalikliSayi.listIterator();
        System.out.println("contains metot kullanımı sonucu: " + ondalikliSayi.contains(1.1f));
        System.out.println("size metot kullanımı sonucu: " + ondalikliSayi.size());
        System.out.println("indexOf metot kullanımı sonucu:" + ondalikliSayi.indexOf(1.5f));
        System.out.println("isEmpty metot kullanımı sonucu: " + ondalikliSayi.isEmpty());

        System.out.println();

        System.out.println("NOT: Her bir listede 10 adet metot kullanılmış olup sadece bazıları " +
                "yazdırılmıştır.");
    }

    static void ListeYazdir(java.util.List<?> list) {
        System.out.println(list.toString());
    }
}
