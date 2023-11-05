package Produkty;

import Produkty.Produkt;

public class Przekaska extends Produkt {
    private double waga;

    @Override
    public void wypiszSzczegoly() {
        System.out.println(getNazwa() + ", cena: " + getCena() + ", waga: " + waga);
    }

    public Przekaska(String nazwa, double cena, int liczbaSztuk, double waga) {
        super(nazwa, cena, liczbaSztuk);
        this.waga = waga;
    }
}
