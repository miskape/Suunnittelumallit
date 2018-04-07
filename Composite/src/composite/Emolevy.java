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
public class Emolevy {
    
    private double price;
    
    public Emolevy(double price) {
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void add(Komponentti komponentti) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public void remove(Komponentti komponentti) {
        throw new UnsupportedOperationException(""); 
    }

    @Override
    public Komponentti getChild(int index) {
        throw new UnsupportedOperationException("");
    }
    
    @Override
    public String toString() {
        return "emolevy";
    }
    
}
