package Produkty;

public class Gazeta extends Produkt {
    private String kategoria;

    @Override
    public void wypiszSzczegoly() {
        System.out.println(getNazwa() + ", cena: " + getCena() + ", kategoria: " + kategoria);
    }

    public Gazeta(String nazwa, double cena, int liczbaSztuk, String kategoria) {
        super(nazwa, cena, liczbaSztuk);
        this.kategoria = kategoria;
    }
}
