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
public class Näytönohjain {
    
    private double price;
    
    public Näytönohjain(double price) {
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void add(Komponentti komponentti) {
        throw new UnsupportedOperationException("You cannot add to this component.");
    }

    @Override
    public void remove(Komponentti komponentti) {
        throw new UnsupportedOperationException("You cannot remove from this component."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("This component has no children."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "näytönohjain";
    }
    
}
