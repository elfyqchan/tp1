/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author fb299853
 */
public class PanierTest extends TestCase {
    
    Panier p1, p2;
    Orange o1, o2, o3;
    
    public PanierTest(String testName) {
        super(testName);
    }
    
    protected void setUp() throws Exception {
        p1 = new Panier(1);
        p2 = new Panier(2);
        o1 = new Orange(0.5, "France");
        o2 = new Orange(0.2, "Espagne");
        o3 = new Orange(0.5, "Italie");
    }
    

    /**
     * Test of estPlein method, of class Panier.
     */
    public void testEstPlein() {
        assertFalse(p1.estPlein());
        p1.ajoute(o1);
        assertTrue(p1.estPlein());
    }

    /**
     * Test of estVide method, of class Panier.
     */
    public void testEstVide() {
        assertTrue(p1.estVide());
        p1.ajoute(o1);
        assertFalse(p1.estVide());
        p1.retire();
        assertTrue(p1.estVide());
    }

    /**
     * Test of equals method, of class Panier.
     */
    public void testEquals() {
        
    }

    /**
     * Test of ajoute method, of class Panier.
     */
    @Test
    public void testAjoutePanierVide(){
        p1.ajoute(o1);
        assertFalse(p1.estVide());
        assertTrue(p1.getSize() == 1);
        assertEquals(p1.getOranges(o1), o1);
        
    }
    
    @Test
    public void testAjoutePanierPlein() throws Exception{
        p1.ajoute(o1);
        p1.ajoute(o2);
    }

    /**
     * Test of retire method, of class Panier.
     * @throws java.lang.Exception
     */
    @Test
    public void testRetire() throws Exception{
        p1.ajoute(o1);
        p1.retire();
        p1.retire();
    }
    
}
