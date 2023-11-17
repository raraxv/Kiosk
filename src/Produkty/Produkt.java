package Produkty;

import Sortowania.SortujPrzezIloscSztuk;
import Sortowania.SortujPrzezNazwe;

import java.util.Collections;
import java.util.List;

public abstract class Produkt {
    private String nazwa;
    private double cena;
    private int liczbaSztuk;

    public abstract String wypiszSzczegoly();

    public Produkt(String nazwa, double cena, int liczbaSztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.liczbaSztuk = liczbaSztuk;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }

    // Metody do działania programu

    public static void wyswietlListeProduktow(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
            i++;
            }
        }

    public static void wyszukajProduktPoNazwie(List<Produkt> listaProduktow, String nazwaProduktu) {
        boolean czyZnaleziono = false;
        for (Produkt produkt : listaProduktow) {
            if (produkt.getNazwa().equals(nazwaProduktu)) {
                czyZnaleziono = true;
                System.out.println(produkt.wypiszSzczegoly());
                break;
                }
            }
        if(czyZnaleziono == false){
            System.out.println("Błąd - brak produktu o takiej nazwie.");
        }
    }

    public static void usunProdukt(List<Produkt> listaProduktow, String nazwaProduktu){
        boolean czyZnaleziono = false;
        int index = 0;
        for (Produkt produkt : listaProduktow) {
            if (produkt.getNazwa().equals(nazwaProduktu)) {
                czyZnaleziono = true;
                listaProduktow.remove(index);
                System.out.println("Pomyślnie usunięto produkt o nazwie: " + produkt.getNazwa());
                break;
            }
            index++;
        }
        if(czyZnaleziono == false){
            System.out.println("Błąd - brak produktu o takiej nazwie.");
        }
    }

    // Metody do obsługi programu

    public static void obslugaWyboruOpcji(){
        System.out.println("Wybierz opcje:");
        System.out.println("1 - wyświetl listę produktów");
        System.out.println("2 - wyszukaj dany produkt");
        System.out.println("3 - sortuj listę");
        System.out.println("4 - dodaj produkt");
        System.out.println("5 - usuń produkt");
        System.out.println("6 - zakończ");
    }

    public static void obslugaWyboruKategorii(int wyborKategorii, List<Produkt> listaProduktow){
        switch(wyborKategorii){
            case 1:
                System.out.println("Lista produktów: ");
                Produkt.wyswietlListeProduktow(listaProduktow);
                break;

            case 2:
                System.out.println("Lista przekąsek: ");
                Przekaska.wyswietlListeProduktow(listaProduktow);
                break;

            case 3:
                System.out.println("Lista napoi: ");
                Napoj.wyswietlListeProduktow(listaProduktow);
                break;

            case 4:
                System.out.println("Lista artykułów: ");
                ArtykulyBiurowe.wyswietlListeProduktow(listaProduktow);
                break;

            case 5:
                System.out.println("Lista gazet: ");
                Gazeta.wyswietlListeProduktow(listaProduktow);
                break;

            case 6:
                System.out.println("Lista inne: ");
                Inne.wyswietlListeProduktow(listaProduktow);
                break;

            case 7:
                break;

            default:
                System.out.println("Błąd - brak takiej opcji.");
                break;
        }
    }

    public static void obsulgaWyboruSortowania(int wyborSortowania, List<Produkt> listaProduktow){
        switch(wyborSortowania) {
            case 1:
                System.out.println("Posortowano po nazwie.");
                SortujPrzezNazwe sortowaniePoNazwie = new SortujPrzezNazwe();
                Collections.sort(listaProduktow, sortowaniePoNazwie);
                for (Produkt produkt : listaProduktow) {
                    System.out.println(produkt.wypiszSzczegoly());
                }
                break;

            case 2:
                System.out.println("Posortowano po liczbie sztuk.");
                SortujPrzezIloscSztuk sortowaniePoIlosciSztuk = new SortujPrzezIloscSztuk();
                Collections.sort(listaProduktow, sortowaniePoIlosciSztuk);
                for (Produkt produkt : listaProduktow) {
                    System.out.println(produkt.wypiszSzczegoly());
                }
                break;

            case 3:
                break;

            default:
                System.out.println("Błąd - brak takiej opcji.");
                break;
        }
    }

}