package org.example;

public class Ladki {

    Ladka ladka;

    public Ladka getLadka() {
        return ladka;
    }

    public void setLadka(Ladka ladka) {
        this.ladka = ladka;
    }

    @Override
    public String toString() {
        return "Ladki{" +
                "ladka=" + ladka +
                '}';
    }

    public Ladki(Ladka ladka) {
        this.ladka = ladka;
    }
}
