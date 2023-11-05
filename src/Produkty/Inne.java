package Produkty;

public class Inne extends Produkt{

    @Override
    public void wypiszSzczegoly() {
        System.out.println(getNazwa() + ", cena: " + getCena());
    }
    public Inne(String nazwa, double cena, int liczbaSztuk) {
        super(nazwa, cena, liczbaSztuk);
    }
}
