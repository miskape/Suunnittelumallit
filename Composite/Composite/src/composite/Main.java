/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author miskape
 */
public class Main {
    
    public static void main(String[] args) {
        TietokoneFactory factory = new TietokoneFactory();
        Tietokone tietokone = new Tietokone(factory);
        System.out.println("Tietokone maksaa " + Double.toString(tietokone.getPrice()) + " euroa.");
    }
}
