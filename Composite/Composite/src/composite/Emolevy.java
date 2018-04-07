/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;
import java.util.ArrayList;

/**
 *
 * @author miskape
 */
public class Emolevy implements Komponentti {
    
    private double price;
    private ArrayList<Komponentti> komponentit;
    
    public Emolevy(double price) {
        this.price = price;
        komponentit = new ArrayList();
    }

    @Override
    public void add(Komponentti komponentti) {
        komponentit.add(komponentti);
    }

    @Override
    public void remove(Komponentti komponentti) {
        komponentit.remove(komponentit.indexOf(komponentti));;  
    }

    @Override
    public Komponentti getChild(int index) {
        return komponentit.get(index);
    }
    
    @Override
    public double getPrice() {
        double hinta = price;
        for(Komponentti komponentti : komponentit) {
            hinta += komponentti.getPrice();
        }
        return hinta;
    }
    
    @Override
    public String toString() {
        return "emolevy";
    }
    
}
