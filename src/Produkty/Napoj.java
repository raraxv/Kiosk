package Produkty;

public class Napoj extends Produkt{
    private double wielkoscLitrow;
    private boolean czyGazowany;

    @Override
    public Produkt wypiszSzczegoly() {
        System.out.println(getNazwa() + ", cena: " + getCena() + ", wielkość: " + wielkoscLitrow);
        return null;
    }

    public Napoj(String nazwa, double cena, int liczbaSztuk, double wielkoscLitrow, boolean czyGazowany) {
        super(nazwa, cena, liczbaSztuk);
        this.wielkoscLitrow = wielkoscLitrow;
        this.czyGazowany = czyGazowany;
    }
}
