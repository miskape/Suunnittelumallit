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
public class Charmander implements State {
    
    private static final Charmander instance = new Charmander();
    
    public static State getInstance() {
        return instance;
    }
    
    @Override
    public void kehitysaste(final Context pokemon) {
        pokemon.setState(Charmeleon.getInstance());
    }
    
    @Override
    public void hyökkää(){
        System.out.println("Raapii");
    }
    
    @Override
    public void liiku(){
        System.out.println("Kävelee");
    }
    
    @Override
    public void puhu(){
        System.out.println("Charmander!");
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(instance);
    }
}



