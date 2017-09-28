package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Orange o1 = new Orange(2, "France");
        Orange o2 = new Orange(-1, "Espagne");
        System.out.println(o1.toString());
        System.out.println(o2.toString());
    }
}
