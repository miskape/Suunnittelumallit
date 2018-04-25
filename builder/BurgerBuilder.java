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
public abstract class BurgerBuilder<T> {
    protected Burger burger;
    protected T burgerStructure;
    
     public void createNewBurger() {
        burger = new Burger();
    }
     
    public T getBurger() {
        return burgerStructure;
    }
    
    public Burger getHampurilainen() {
        return burger;
    }
    
    public abstract void buildSämpylä();
    public abstract void buildPihvi();
    public abstract void buildMuu();
    public abstract void buildKastike();
    
    @Override
    public String toString() {
        return burger.toString();
    }
    
}
