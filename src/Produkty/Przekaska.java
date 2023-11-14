package Produkty;

import java.util.List;

public class Przekaska extends Produkt {
    private double waga;

    @Override
    public String wypiszSzczegoly() {
        return getNazwa() + ", cena: " + getCena() + ", ilość sztuk: " + getLiczbaSztuk();
    }

    public Przekaska(String nazwa, double cena, int liczbaSztuk, double waga) {
        super(nazwa, cena, liczbaSztuk);
        this.waga = waga;
    }

    public static void wyswietlListeProduktow(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof Przekaska) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
        }
    }
}
