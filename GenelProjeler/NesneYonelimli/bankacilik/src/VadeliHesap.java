class VadeliHesap extends Hesap {
    private int vade;

    public VadeliHesap(double bakiye, int vade) {
        super(bakiye);
        this.vade = vade;
    }

    @Override
    public void paraYatir(double miktar) {
        bakiye += miktar;
        System.out.println(miktar + " TL yatırıldı");
    }

    @Override
    public void paraCek(double miktar) {
        if (vade > 0) {
            System.out.println("Vade süresi dolmadığı için para çekilemez!");
        } else {
            if (miktar <= bakiye) {
                bakiye -= miktar;
                System.out.println(miktar + " TL çekildi");
            } else {
                System.out.println("Yetersiz bakiye!");
            }
        }
    }

    @Override
    public void bakiyeSorgula() {
        System.out.println("Bakiye: " + bakiye + " TL");
    }
}