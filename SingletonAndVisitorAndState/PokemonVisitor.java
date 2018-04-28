/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author miskape
 */
public class PokemonVisitor implements Visitor {
    
    @Override
    public void visit(Charmander instance) {
        System.out.println("Bonuspisteet: 1");
    }
    
    @Override
    public void visit(Charmeleon instance) {
        System.out.println("Bonuspisteet: 2");
    }
    
    @Override
    public void visit(Charizard instance) {
        System.out.println("Bonuspisteet: 3");
    }    
}
