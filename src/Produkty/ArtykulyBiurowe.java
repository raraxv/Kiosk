package Produkty;

import java.util.List;

public class ArtykulyBiurowe extends Produkt {
    private int liczbaStron;
    private String rozmiar;
    private String kolor;

    @Override
    public String wypiszSzczegoly() {
        return getNazwa() + ", cena: " + getCena() + ", ilość sztuk: " + getLiczbaSztuk();
    }

    public ArtykulyBiurowe(String nazwa, double cena, int liczbaSztuk, int liczbaStron, String wielkosc) {
        super(nazwa, cena, liczbaSztuk);
        this.liczbaStron = liczbaStron;
        this.rozmiar = rozmiar;
    }

    public ArtykulyBiurowe(String nazwa, double cena, int liczbaSztuk, String kolor) {
        super(nazwa, cena, liczbaSztuk);
        this.kolor = kolor;
    }

    public ArtykulyBiurowe(String nazwa, double cena, int liczbaSztuk) {
        super(nazwa, cena, liczbaSztuk);
    }

    public static void wyswietlListeProduktow(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof ArtykulyBiurowe) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
        }
    }
}
