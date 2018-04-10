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
public interface Komponentti {
    
    
    public abstract void add(Komponentti komponentti);
    public abstract void remove(Komponentti komponentti);
    public abstract Komponentti getChild(int index);
    public abstract double getPrice();
    
    @Override
    public abstract String toString();
    
}
