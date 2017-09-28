
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.ArrayList;

/**
 *
 * @author fb299853
 */
public class Panier {
    private ArrayList<Orange> oranges;
    int maximum;
    
    public Panier(int max){
        maximum = max;
        oranges = new ArrayList<Orange>();
        
    }
    
    public boolean estPlein(){
        boolean res = false;
                
        if(oranges.size() == maximum)
            res = true;
        
        return res;
    }
    
    public boolean estVide(){
        return oranges.isEmpty();
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < oranges.size(); i++){
            s = s + "Orange " + i + " = " + oranges.get(i).toString() + "\n";
        }
        return s;
    }
    
    public boolean equals(ArrayList<Orange> o){
        
        boolean res = true;
        
        for(int i = 0; i< oranges.size(); i++){
            if(!oranges.get(i).equals(o.get(i))){
                res = false;     
            } 
        }
        
        if(oranges.size() != o.size())
            res = false;
            
        return res;
    }
    
    public void ajoute(Orange o){
        if(!this.estPlein())
            oranges.add(o);
        else 
            System.out.println("Panier plein !");
    }
    
    public void retire(){
        if(!this.estVide())
            oranges.remove(oranges.get(oranges.size()-1));
        else 
            System.out.println("Panier vide !");
    }
}
