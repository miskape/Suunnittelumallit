/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author miskape
 */
public class Director {
    
    private BurgerBuilder builder;
    
    public void setBurgerBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }
    
    public Burger getHampurilainen() {
        return builder.getHampurilainen();
    }
    
    public void constructBurger() {
        builder.createNewBurger();
        builder.buildSämpylä();
        builder.buildPihvi();
        builder.buildMuu();
        builder.buildKastike();
    }
}
