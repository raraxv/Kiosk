package Produkty;

public class Gazeta extends Produkt {
    private String kategoria;

    @Override
    public String wypiszSzczegoly() {
        return getNazwa() + ", cena: " + getCena() + ", ilość sztuk: " + getLiczbaSztuk();
    }

    public Gazeta(String nazwa, double cena, int liczbaSztuk, String kategoria) {
        super(nazwa, cena, liczbaSztuk);
        this.kategoria = kategoria;
    }
}
