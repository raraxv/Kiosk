package Produkty;

public class Inne extends Produkt{

    @Override
    public Produkt wypiszSzczegoly() {
        System.out.println(getNazwa() + ", cena: " + getCena());
        return null;
    }
    public Inne(String nazwa, double cena, int liczbaSztuk) {
        super(nazwa, cena, liczbaSztuk);
    }
}
