/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

/**
 *
 * @author fb299853
 */
public class Orange {
    private double prix;
    private String origine;
    
    public Orange(double pr, String ori){        
        if(pr>=0){
            prix = pr;
        }else{
            System.out.println("Prix négatif");
            prix=-pr;
        }
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
    
}
