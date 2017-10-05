/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import junit.framework.TestCase;

/**
 *
 * @author fb299853
 */
public class OrangeTest extends TestCase {
    
    Orange o1, o2, o3;
    
    public OrangeTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        o1 = new Orange(0.5, "Floride");
        o2 = new Orange(0.2, "France");
        o3 = new Orange(0.5, "Floride");
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getPrix method, of class Orange.
     */
    public void testGetPrix() {
        double prix = o1.getPrix();
        assertFalse(o1 == null);
        assertTrue(prix == 0.5);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    public void testGetOrigine() {
        String s = o2.getOrigine();
        assertFalse(o2 == null);
        assertTrue(s.equals("France"));
    }

    /**
     * Test of toString method, of class Orange.
     */
    public void testToString() {
    }

    /**
     * Test of equals method, of class Orange.
     */

    public void testEquals() throws Exception{
        boolean res1 = o1.equals(o3);
        boolean res2 = o1.equals(o2);
        assertTrue(res1);
        assertFalse(res2);
        
    }
    
}
