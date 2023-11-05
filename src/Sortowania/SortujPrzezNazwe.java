package Sortowania;

import Produkty.Produkt;

import java.util.Comparator;

public class SortujPrzezNazwe implements Comparator<Produkt> {

    @Override
    public int compare(Produkt o1, Produkt o2) {
        return o1.getNazwa().compareTo(o2.getNazwa());
    }
}
