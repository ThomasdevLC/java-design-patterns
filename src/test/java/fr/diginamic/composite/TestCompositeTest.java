package fr.diginamic.composite;


import org.junit.Test;
import static org.junit.Assert.*;

public class TestCompositeTest {

    @Test
    public void testCalculerSalaireServicePrincipal() {
    	
        Employe emp1 = new Employe("RASPEY", "Cécile", 10000);
        Employe emp2 = new Employe("BECHKAR", "Bilel", 8000);
        Employe emp3 = new Employe("RANMEY", "Jb", 7500);
        Employe emp4 = new Employe("DOE", "Jane", 3500);
        Employe emp5 = new Employe("GUINEAU", "Kevin", 7500);
        Employe emp6 = new Employe("MARTIN", "Paul", 3500);

        Service service1 = new Service("DSIN");
        Service sousService1 = new Service("Big Data");
        Service sousService2 = new Service("Java Dev");

        service1.ajouterElement(emp1);
        service1.ajouterElement(emp2);

        sousService1.ajouterElement(emp3);
        sousService1.ajouterElement(emp4);

        sousService2.ajouterElement(emp5);
        sousService2.ajouterElement(emp6);

        service1.ajouterElement(sousService1);
        service1.ajouterElement(sousService2);

        double salaireAttendu = 40000.0;
        double salaireTotal = service1.calculerSalaire();

        assertEquals(salaireAttendu, salaireTotal, 0.001); 
    }

    @Test
    public void testCalculerSalaireSousService1() {
        Employe emp3 = new Employe("RANMEY", "Jb", 7500);
        Employe emp4 = new Employe("DOE", "Jane", 3500);

        Service sousService1 = new Service("Big Data");
        sousService1.ajouterElement(emp3);
        sousService1.ajouterElement(emp4);

        double salaireAttendu = 7500 + 3500;
        double salaireTotal = sousService1.calculerSalaire();

        assertEquals(salaireAttendu, salaireTotal, 0.001); 
        }

    @Test
    public void testCalculerSalaireSousService2() {
        Employe emp5 = new Employe("GUINEAU", "Kevin", 7500);
        Employe emp6 = new Employe("MARTIN", "Paul", 3500);

        Service sousService2 = new Service("Big Data");
        sousService2.ajouterElement(emp5);
        sousService2.ajouterElement(emp6);

        double salaireAttendu = 7500 + 3500;
        double salaireTotal = sousService2.calculerSalaire();

        assertEquals(salaireAttendu, salaireTotal, 0.001); 
    }
}

