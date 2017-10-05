/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import static java.lang.Math.abs;

/**
 *
 * @author fb299853
 */
public class Orange {
    private double prix;
    private String origine;
    
    public Orange(double pr, String ori){        
        prix= abs(pr);
        origine = ori;
    }
    
    public double getPrix(){
        return prix;        
    }
    
    public String getOrigine(){
        return origine;
    }
    
    @Override
    public String toString(){
        String s = "Orange à " + getPrix() + " euros, origine " + getOrigine();
        return s;
    }
    
    public boolean equals(Orange o){
        boolean res = true;
        if(this.getPrix() != o.getPrix())
            res = false;
        
        if(!this.getOrigine().equals(o.getOrigine()))
            res = false;
        
            
        return res;
    }
    
}
