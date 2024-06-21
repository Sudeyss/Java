public class Bankacilik {
    public static void main(String[] args) {
        TasarrufHesap tasarrufHesap = new TasarrufHesap(1000);
        tasarrufHesap.paraYatir(500);
        tasarrufHesap.paraCek(200);
        tasarrufHesap.bakiyeSorgula();

        CariHesap cariHesap = new CariHesap(2000);
        cariHesap.paraYatir(1000);
        cariHesap.paraCek(3000);
        cariHesap.bakiyeSorgula();

        VadeliHesap vadeliHesap = new VadeliHesap(5000, 12);
        vadeliHesap.paraYatir(2000);
        vadeliHesap.paraCek(3000);
        vadeliHesap.bakiyeSorgula();
    }
}
