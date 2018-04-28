/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptertesti;

/**
 *
 * @author miskape
 */
public class Main {
    
    public static void main(String[] args) {
		
	PlugTypeC plugC = new PlugTypeC();
	plugC.addToC("C plug");
	plugC.addCtoG("C plug");
        System.out.println("");
        PlugTypeG plugG = new PlugTypeG();
	plugG.addToG("G plug");
	plugG.addGtoC("G plug");
    }
}
