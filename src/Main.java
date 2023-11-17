import Produkty.*;
import Sortowania.SortujPrzezIloscSztuk;
import Sortowania.SortujPrzezNazwe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Utworzenie obiektów i dodanie ich do listy.

        List<Produkt> listaProduktow = new ArrayList<>();

        Napoj n1 = new Napoj("Coca Cola", 7.00, 20, 0.5, true);
        Napoj n2 = new Napoj("Coca Cola Zero", 6.50, 15, 0.5, true);
        Napoj n3 = new Napoj("Żywiec Zdrój", 4.00, 20, 0.5, false);
        Napoj n4 = new Napoj("Kropla Beskidu", 3.80, 15, 0.5, true);
        Napoj n5 = new Napoj("Fanta", 4.00, 10, 0.33, true);
        Napoj n6 = new Napoj("Mirinda", 4.40, 15, 0.33, true);
        Napoj n7 = new Napoj("Tymbark Jabłkowy", 8.00, 10, 1.0, false);
        Napoj n8 = new Napoj("Hortex Pomarańczowy", 7.50, 15, 1.0, false);

        Gazeta g1 = new Gazeta("Kurier Polska", 4.00, 20, "Informacyjna");
        Gazeta g2 = new Gazeta("Tygodnik Nadwiślański", 4.00, 15, "Informacyjna");
        Gazeta g3 = new Gazeta("Lil i Put", 8.00, 10, "Dla dzieci");
        Gazeta g4 = new Gazeta("Ptyś i Bill", 5.00, 8, "Dla dzieci");
        Gazeta g5 = new Gazeta("Tele Tydzień", 5.50, 15, "Rozrywka");
        Gazeta g6 = new Gazeta("Świat Kobiet", 5.50, 15, "Rozrywka");
        Gazeta g7 = new Gazeta("Foto Inspiracje", 8.00, 10, "Rozrywka");
        Gazeta g8 = new Gazeta("Kobieta w Biznesie", 10.00, 5, "Rozrywka");

        Przekaska p1 = new Przekaska("Snickres", 3.00, 20, 100);
        Przekaska p2 = new Przekaska("Mars", 3.20, 18, 100);
        Przekaska p3 = new Przekaska("Bounty", 3.50, 10, 150);
        Przekaska p4 = new Przekaska("Kit Kat", 3.00, 25, 120);

        ArtykulyBiurowe a1 = new ArtykulyBiurowe("Niebieski długopis", 2.50, 18, "Niebieski");
        ArtykulyBiurowe a2 = new ArtykulyBiurowe("Czarny długopis", 2.50, 15, "Czarny");
        ArtykulyBiurowe a3 = new ArtykulyBiurowe("Zeszyt 16", 3.00, 10, 16, "A5");
        ArtykulyBiurowe a4 = new ArtykulyBiurowe("Zeszyt 32", 3.80, 18, 32, "A5");
        ArtykulyBiurowe a5 = new ArtykulyBiurowe("Papier", 22.50, 8, 500, "A5");
        ArtykulyBiurowe a6 = new ArtykulyBiurowe("Ołówek", 2.50, 22);
        ArtykulyBiurowe a7 = new ArtykulyBiurowe("Spinacze", 4.50, 15);
        ArtykulyBiurowe a8 = new ArtykulyBiurowe("Taśma klejąca", 2.80, 15);

        Inne i1 = new Inne("Zapalniczka", 2.80, 16);
        Inne i2 = new Inne("Zapałki", 1.10, 28);
        Inne i3 = new Inne("Kalendarz", 9.90, 10);
        Inne i4 = new Inne("Pocztówka", 5.50, 11);
        Inne i5 = new Inne("Kartka urodzinowa", 5.50, 15);
        Inne i6 = new Inne("Bateria", 5.80, 16);

        listaProduktow.add(n1);
        listaProduktow.add(n2);
        listaProduktow.add(n3);
        listaProduktow.add(n4);
        listaProduktow.add(n5);
        listaProduktow.add(n6);
        listaProduktow.add(n7);
        listaProduktow.add(n8);

        listaProduktow.add(g1);
        listaProduktow.add(g2);
        listaProduktow.add(g3);
        listaProduktow.add(g4);
        listaProduktow.add(g5);
        listaProduktow.add(g6);
        listaProduktow.add(g7);
        listaProduktow.add(g8);

        listaProduktow.add(p1);
        listaProduktow.add(p2);
        listaProduktow.add(p3);
        listaProduktow.add(p4);

        listaProduktow.add(a1);
        listaProduktow.add(a2);
        listaProduktow.add(a3);
        listaProduktow.add(a4);
        listaProduktow.add(a5);
        listaProduktow.add(a6);
        listaProduktow.add(a7);
        listaProduktow.add(a8);

        listaProduktow.add(i1);
        listaProduktow.add(i2);
        listaProduktow.add(i3);
        listaProduktow.add(i4);
        listaProduktow.add(i5);
        listaProduktow.add(i6);

        // Działanie programu

        Scanner skaner = new Scanner(System.in);
        boolean program = true;

        while(program){
            Produkt.obslugaWyboruOpcji();
            int wyborOpcji = skaner.nextInt();
            switch(wyborOpcji){
                case 1:
                    System.out.println("Wybierz kategorię listy:");
                    System.out.println("1 - ogólna");
                    System.out.println("2 - przekąski");
                    System.out.println("3 - napoje");
                    System.out.println("4 - artykuły biurowe");
                    System.out.println("5 - gazety");
                    System.out.println("6 - inne");
                    System.out.println("7 - powrót do menu");
                    int wyborKategorii = skaner.nextInt();
                    Produkt.obslugaWyboruKategorii(wyborKategorii, listaProduktow);
                    break;

                case 2:
                    skaner.nextLine();
                    System.out.println("Podaj nazwę szukanego produktu: ");
                    String wyszukiwanyProdukt = skaner.nextLine();
                    Produkt.wyszukajProduktPoNazwie(listaProduktow, wyszukiwanyProdukt);
                    break;

                case 3:
                    System.out.println("Wybierz sortowanie:");
                    System.out.println("1 - po nazwie");
                    System.out.println("2 - po liczbie sztuk");
                    System.out.println("3 - powrót do menu");
                    int wyborSortowania = skaner.nextInt();
                    Produkt.obsulgaWyboruSortowania(wyborSortowania, listaProduktow);
                    break;

                case 4:
                    System.out.println("Co chcesz dodać do listy?");
                    System.out.println("1 - przekąskę");
                    System.out.println("2 - napój");
                    System.out.println("3 - artykuł biurowy");
                    System.out.println("4 - gazetę");
                    System.out.println("5 - inne");
                    System.out.println("6 - powrót do menu");
                    int wyborObiektu = skaner.nextInt();

                    switch(wyborObiektu) {
                        case 1:
                            System.out.println("Szablon dodawanie obiektu typu: PRZEKASKA");
                            System.out.println("Przekaska: nazwa(String), cena(double), liczbaSztuk(int), waga(double)");
                            System.out.println("W takiej kolejności należy teraz podać dane: ");
                            skaner.nextLine();
                            String nazwaP = skaner.nextLine();
                            double cenaP = skaner.nextDouble();
                            int liczbaSztukP = skaner.nextInt();
                            double wagaP = skaner.nextDouble();
                            listaProduktow.add(new Przekaska(nazwaP, cenaP, liczbaSztukP, wagaP));
                            System.out.println("Dodano pomyślnie: " + nazwaP);
                            break;

                        case 2:
                            System.out.println("Szablon dodawanie obiektu typu: NAPOJ");
                            System.out.println("Napoj: nazwa(String), cena(double), liczbaSztuk(int), wielkoscLitrow(double), czyGazowany(boolean)");
                            System.out.println("W takiej kolejności należy teraz podać dane: ");
                            skaner.nextLine();
                            String nazwaN = skaner.nextLine();
                            double cenaN = skaner.nextDouble();
                            int liczbaSztukN = skaner.nextInt();
                            double wielkoscLitrowN = skaner.nextDouble();
                            boolean czyGazowanyN = skaner.nextBoolean();
                            listaProduktow.add(new Napoj(nazwaN, cenaN, liczbaSztukN, wielkoscLitrowN, czyGazowanyN));
                            System.out.println("Dodano pomyślnie: " + nazwaN);
                            break;

                        case 3:
                            System.out.println("Szablon dodawanie obiektu typu: ARTYKUL BIUROWY");
                            System.out.println("Artykul biurowy: nazwa(String), cena(double), liczbaSztuk(int)");
                            System.out.println("W takiej kolejności należy teraz podać dane: ");
                            skaner.nextLine();
                            String nazwaA = skaner.nextLine();
                            double cenaA = skaner.nextDouble();
                            int liczbaSztukA = skaner.nextInt();
                            listaProduktow.add(new ArtykulyBiurowe(nazwaA, cenaA, liczbaSztukA));
                            System.out.println("Dodano pomyślnie: " + nazwaA);
                            break;

                        case 4:
                            System.out.println("Szablon dodawanie obiektu typu: GAZETA");
                            System.out.println("Gazeta: nazwa(String), cena(double), liczbaSztuk(int), kategoria(String)");
                            System.out.println("W takiej kolejności należy teraz podać dane: ");
                            skaner.nextLine();
                            String nazwaG = skaner.nextLine();
                            double cenaG = skaner.nextDouble();
                            int liczbaSztukG = skaner.nextInt();
                            skaner.nextLine();
                            String kategoriaG = skaner.nextLine();
                            listaProduktow.add(new Gazeta(nazwaG, cenaG, liczbaSztukG, kategoriaG));
                            System.out.println("Dodano pomyślnie: " + nazwaG);
                            break;

                        case 5:
                            System.out.println("Szablon dodawanie obiektu typu: INNE");
                            System.out.println("Inne: nazwa(String), cena(double), liczbaSztuk(int)");
                            System.out.println("W takiej kolejności należy teraz podać dane: ");
                            skaner.nextLine();
                            String nazwaI = skaner.nextLine();
                            double cenaI = skaner.nextDouble();
                            int liczbaSztukI = skaner.nextInt();
                            listaProduktow.add(new Inne(nazwaI, cenaI, liczbaSztukI));
                            System.out.println("Dodano pomyślnie: " + nazwaI);
                            break;


                        case 6:
                            break;

                        default:
                            System.out.println("Błąd - brak takiej opcji.");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("Podaj nazwe produktu, który chcesz usunąć");
                    skaner.nextLine();
                    String usuwanyProdukt = skaner.nextLine();
                    Produkt.usunProdukt(listaProduktow, usuwanyProdukt);
                    break;

                case 6:
                    System.out.println("Zamykanie programu");
                    break;

                default:
                    System.out.println("Błąd - brak takiej opcji.");
                    break;
            }
            if(wyborOpcji == 6) break;
        }
    }
}