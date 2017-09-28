package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {       
        Panier panier1 = new Panier(5);
        Orange o1 = new Orange(2, "France");
        Orange o2 = new Orange(-1, "Espagne");
        panier1.ajoute(o1);
        panier1.ajoute(o2);
       /* panier1.ajoute(o1);
        panier1.ajoute(o2);
        panier1.ajoute(o1);
        panier1.ajoute(o2);*/
        System.out.println(panier1.toString());
        System.out.println("--------------");
        panier1.retire();
        /*System.out.println(panier1.toString());
        System.out.println("--------------");
        System.out.println(o1.toString());
        System.out.println(o2.toString());*/
        //System.out.println(o1.equals(o2));
    }
}
