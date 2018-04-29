/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author miskape
 */
public class Main {
    public static void main(String[] args) {
        
        // Test Strategia1
        ListPrint testi = new ListPrint(new Strategia1());
        testi.printString();
        
        // Test Strategia2
        testi = new ListPrint(new Strategia2());
	testi.printString();
        
	// Test Strategia3
	testi = new ListPrint(new Strategia3());
	testi.printString();
	
    }
}

