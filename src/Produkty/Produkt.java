package Produkty;

public abstract class Produkt {
    private String nazwa;
    private double cena;
    private int liczbaSztuk;

    public abstract void wypiszSzczegoly();

    private int szukaj(){
        return 0;
    };

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
}
