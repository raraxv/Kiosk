package Produkty;

public class Gazeta extends Produkt {
    private String kategoria;

    @Override
    public Produkt wypiszSzczegoly() {
        System.out.println(getNazwa() + ", cena: " + getCena() + ", kategoria: " + kategoria);
        return null;
    }

    public Gazeta(String nazwa, double cena, int liczbaSztuk, String kategoria) {
        super(nazwa, cena, liczbaSztuk);
        this.kategoria = kategoria;
    }
}
