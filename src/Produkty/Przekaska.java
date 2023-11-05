package Produkty;

public class Przekaska extends Produkt {
    private double waga;

    @Override
    public Produkt wypiszSzczegoly() {
        System.out.println(getNazwa() + ", cena: " + getCena() + ", waga: " + waga);
        return null;
    }

    public Przekaska(String nazwa, double cena, int liczbaSztuk, double waga) {
        super(nazwa, cena, liczbaSztuk);
        this.waga = waga;
    }
}
