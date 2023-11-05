import Produkty.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        boolean program = true;

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

        while(program){
            int wybor = skaner.nextInt();
            switch(wybor){
                case 1:
                    System.out.println("jeden");
                    break;

                case 2:
                    System.out.println("dwa");
                    break;

                case 3:
                    program = true;
                    break;

                case 4:
                    System.out.println("koniec");
                    program = false;
                    break;
            }
        }
    }
}