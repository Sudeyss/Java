// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SekilSoyut {
    public static void main(String[] args) {
        Sekil[] sekiller = new Sekil[2];
        sekiller[0] = new Ucgen();
        sekiller[1] = new Kare();

        for (Sekil sekil : sekiller) {
            sekil.ciz();
        }
    }
}