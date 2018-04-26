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
public abstract class HamppariBuilder<T> {
    protected Hamppari hamppari;
    protected T burgerStructure;
    
     public void createNewBurger() {
        hamppari = new Hamppari();
    }
     
    public Hamppari getHampurilainen() {
        return hamppari;
    }
    
    public T getBurger() {
        return burgerStructure;
    }
    
    public abstract void buildSämpylä();
    public abstract void buildPihvi();
    public abstract void buildMuu();
    public abstract void buildKastike();
    
    @Override
    public String toString() {
        return hamppari.toString();
    }
    
}
