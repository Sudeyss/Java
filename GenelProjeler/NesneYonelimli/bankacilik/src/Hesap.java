// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
abstract class Hesap {
    protected double bakiye;

    public Hesap(double bakiye) {
        this.bakiye = bakiye;
    }

    public abstract void paraYatir(double miktar);

    public abstract void paraCek(double miktar);

    public abstract void bakiyeSorgula();
}