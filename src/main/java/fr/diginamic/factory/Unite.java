package fr.diginamic.factory;

public enum Unite {
    MICRO_GRAMMES("microgrammes"),
    MILLI_GRAMMES("milligrammes"),
    GRAMMES("grammes"),
    KILOGRAMMES("kilogrammes");

    private String libelle;

    Unite(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}
