package Produkty;

public class ArtykulyBiurowe extends Produkt {
    private int liczbaStron;
    private String rozmiar;
    private String kolor;

    @Override
    public String wypiszSzczegoly() {
        System.out.println(getNazwa() + ", cena: " + getCena());
        return null;
    }

    public ArtykulyBiurowe(String nazwa, double cena, int liczbaSztuk, int liczbaStron, String wielkosc) {
        super(nazwa, cena, liczbaSztuk);
        this.liczbaStron = liczbaStron;
        this.rozmiar = rozmiar;
    }

    public ArtykulyBiurowe(String nazwa, double cena, int liczbaSztuk, String kolor) {
        super(nazwa, cena, liczbaSztuk);
        this.kolor = kolor;
    }

    public ArtykulyBiurowe(String nazwa, double cena, int liczbaSztuk) {
        super(nazwa, cena, liczbaSztuk);
    }
}
