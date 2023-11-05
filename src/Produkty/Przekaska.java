package Produkty;

public class Przekaska extends Produkt {
    private double waga;

    @Override
    public String wypiszSzczegoly() {
        return getNazwa() + ", cena: " + getCena() + ", ilość sztuk: " + getLiczbaSztuk();
    }

    public Przekaska(String nazwa, double cena, int liczbaSztuk, double waga) {
        super(nazwa, cena, liczbaSztuk);
        this.waga = waga;
    }
}
