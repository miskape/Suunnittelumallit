/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author miskape
 */
public class Main {
    
    public static void main(String[] args) {
    	final Context pokemon = new Context();
    	
    	for(int i = 1; i <= 3; i++) {
            
            pokemon.puhu();    
            pokemon.hyökkää();
            pokemon.liiku();
            pokemon.kehitysaste();
            System.out.println("");
    	}
    }
}

