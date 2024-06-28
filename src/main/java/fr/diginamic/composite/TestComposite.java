package fr.diginamic.composite;

public class TestComposite {
    public static void main(String[] args) {

	 Employe emp1 = new Employe("RASPEY", "Cécile", 10000);
     Employe emp2 = new Employe("BECHKAR", "Bilel", 8000);

     Service service1 = new Service("DSIN");
     service1.ajouterElement(emp1);
     service1.ajouterElement(emp2);

     Service sousService1 = new Service("Big Data");
     Employe emp3 = new Employe("RANMEY", "Jb", 7500);
     Employe emp4 = new Employe("DOE", "Jane", 3500);
     sousService1.ajouterElement(emp3);
     sousService1.ajouterElement(emp4);
     
     Service sousService2 = new Service("Java Dev");
     Employe emp5 = new Employe("GUINEAU", "Kevin", 7500);
     Employe emp6 = new Employe("MARTIN", "Paul", 3500);
     sousService1.ajouterElement(emp5);
     sousService1.ajouterElement(emp6);

     service1.ajouterElement(sousService1);
     service1.ajouterElement(sousService2);

     double salaireTotal = service1.calculerSalaire();
     System.out.println("Salaire total du service: " + salaireTotal);
 }
}
