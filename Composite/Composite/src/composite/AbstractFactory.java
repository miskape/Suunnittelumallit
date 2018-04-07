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
public interface AbstractFactory {
    
    public abstract Komponentti createKotelo();
    public abstract Komponentti createEmolevy();
    public abstract Komponentti createProsessori();
    public abstract Komponentti createNäytönohjain();
    public abstract Komponentti createMuistipiiri();
    public abstract Komponentti createVerkkokortti();
    
}
    
