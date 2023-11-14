package Produkty;

import java.util.List;

public class Inne extends Produkt{

    @Override
    public String wypiszSzczegoly() {
        return getNazwa() + ", cena: " + getCena() + ", ilość sztuk: " + getLiczbaSztuk();
    }
    public Inne(String nazwa, double cena, int liczbaSztuk) {
        super(nazwa, cena, liczbaSztuk);
    }

    public static void wyswietlListeProduktow(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof Inne) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
        }
    }
}

