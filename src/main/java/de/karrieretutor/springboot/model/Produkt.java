package de.karrieretutor.springboot.model;

public class Produkt {
    public String name;
    public String herkunft;
    public Kategorie kategorie;
    public Unterkategorie unterkategorie;
    public Double preis;
    String foto;

    public Produkt(String name, String herkunft, Kategorie kategorie, Unterkategorie unterkategorie, Double preis) {
        this.name = name;
        this.herkunft = herkunft;
        this.kategorie = kategorie;
        this.unterkategorie = unterkategorie;
        this.preis = preis;
    }

    public String getFoto() {
        switch (this.unterkategorie) {
            case SUBKAT1:
                return "image/Carnage.jpg";
            case SUBKAT2:
                return "images/71eK3bIl47L._AC_SY679_.jpg";
            case SUBKAT3:
                return "images/example-work02.jpg";
        }
        return "images/example-work03.jpg";
    }

    public String getPreisFormatiert() {
        return String.format("%.2f", this.preis);
    }
}

