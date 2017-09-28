
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
        
    }
    
    public boolean estPlein(){
        return true;
    }
    
    public boolean estVide(){
        return false;
    }
    
    @Override
    public String toString(){
        String s = null;
        for(int i = 0; i < oranges.size(); i++){
            s = s + "Orange " + i + " = " + oranges.get(i).toString() + "\n";
        }
        return s;
    }
}
