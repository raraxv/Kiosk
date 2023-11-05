package Produkty;

import java.util.List;

public abstract class Produkt {
    private String nazwa;
    private double cena;
    private int liczbaSztuk;

    public abstract String wypiszSzczegoly();

    private int szukaj() {
        return 0;
    }

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


    public static void wyswietlListeProduktow(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
            i++;
            }
        }

    public static void wyswietlListePrzekasek(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof Przekaska) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
        }
    }
    public static void wyswietlListeNapoi(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof Napoj) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
        }
    }
    public static void wyswietlListeArtykulow(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof ArtykulyBiurowe) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
        }
    }
    public static void wyswietlListeInne(List<Produkt> listaProduktow) {
        int i = 1;
        for (Produkt produkt : listaProduktow) {
            if (produkt instanceof Inne) {
                System.out.println(i + ". " + produkt.getNazwa() + ", cena: " + produkt.getCena() + ", ilość: " + produkt.getLiczbaSztuk());
                i++;
            }
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


}

