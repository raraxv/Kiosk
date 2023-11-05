package Sortowania;

import Produkty.Produkt;

import java.util.Comparator;

public class SortujPrzezIloscSztuk implements Comparator<Produkt> {

    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.getLiczbaSztuk() - (o2.getLiczbaSztuk());
    }
}
