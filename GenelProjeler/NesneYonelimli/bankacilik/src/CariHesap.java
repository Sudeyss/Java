class CariHesap extends Hesap {
    public CariHesap(double bakiye) {
        super(bakiye);
    }

    @Override
    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı.");
    }

    @Override
    public void paraCek(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi.");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public void bakiyeSorgula() {
        System.out.println("Bakiye: " + bakiye + " TL");
    }

}


