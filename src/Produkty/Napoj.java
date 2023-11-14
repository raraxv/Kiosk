package Produkty;

import java.util.List;

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

    public static void wyswietlListeProduktow(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof Napoj) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
        }
    }
}
