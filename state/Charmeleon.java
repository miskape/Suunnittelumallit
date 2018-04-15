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
public class Charmeleon implements State {
    
    private static final Charmeleon instance = new Charmeleon();
    
    public static State getInstance() {
	return instance;
    }
    
    @Override
    public void kehitysaste(final Context pokemon) {
        pokemon.setState(Charizard.getInstance());
    }
    
    @Override
    public void hyökkää(){
        System.out.println("Syoksee tulta");
    }
    
    @Override
    public void liiku(){
        System.out.println("Hyppii");
    }
    
    @Override
    public void puhu(){
        System.out.println("Charmilion!");
    }
}


