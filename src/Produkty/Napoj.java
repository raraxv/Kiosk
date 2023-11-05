package Produkty;

public class Napoj extends Produkt{
    private double wielkoscLitrow;
    private boolean czyGazowany;

    @Override
    public String wypiszSzczegoly() {
        return getNazwa() + ", cena: " + getCena() + ", ilość sztuk: " + getLiczbaSztuk();
    }

    public Napoj(String nazwa, double cena, int liczbaSztuk, double wielkoscLitrow, boolean czyGazowany) {
        super(nazwa, cena, liczbaSztuk);
        this.wielkoscLitrow = wielkoscLitrow;
        this.czyGazowany = czyGazowany;
    }
}
