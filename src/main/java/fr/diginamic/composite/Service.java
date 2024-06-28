package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements Element {
    private String nom;
    private List<Element> elements;

    public Service(String nom) {
        this.nom = nom;
        this.elements = new ArrayList<>();
    }

    public void ajouterElement(Element element) {
        elements.add(element);
    }


    @Override
    public double calculerSalaire() {
        double totalSalaire = 0;
        for (Element element : elements) {
            totalSalaire += element.calculerSalaire();
        }
        return totalSalaire;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
