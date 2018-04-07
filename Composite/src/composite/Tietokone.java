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
public class Tietokone {
    
   private final IF_TietokoneFactory factory;
   private Component case;
   private Component emolevy;
   private Component prosessori;
   private Component näytönohjain;
   private Component muistipiiri;
   private Component verkkokortti;
  
   public Tietokone(IF_TietokoneFactory factory) {
        this.factory = factory;
        assemble();
    }
    
    private void assemble() {
        case = factory.createCase();
        motherboard = factory.createEmolevy();
        cpu = factory.createProsessori();
        gpu = factory.createNäytönohjain();
        ram = factory.createMuistipiiri();
        nic = factory.createVerkkokortti();
        
        motherboard.add(Prosessori);
        motherboard.add(Näytönohjain);
        motherboard.add(Muistipiiri);
        motherboard.add(Verkkokortti);
        casing.add(emolevy);
    }
    
    public double getPrice() {
        return case.getPrice();
    }

   
    
}   
