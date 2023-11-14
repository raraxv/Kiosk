package Produkty;

import java.util.List;

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

    public static void wyswietlListeProduktow(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof Gazeta) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
        }
    }
}
