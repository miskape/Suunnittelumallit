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
   private Component motherboard;
   private Component cpu;
   private Component gpu;
   private Component ram;
   private Component nic;
  
   public Tietokone(IF_TietokoneFactory factory) {
        this.factory = factory;
        assemble();
    }
    
    private void assemble() {
        case = factory.createCase();
        motherboard = factory.createMotherboard();
        cpu = factory.createCpu();
        gpu = factory.createGpu();
        ram = factory.createRam();
        nic = factory.createNic();
        
        motherboard.add(cpu);
        motherboard.add(gpu);
        motherboard.add(ram);
        motherboard.add(nic);
        casing.add(motherboard);
    }
    
    public double getPrice() {
        return case.getPrice();
    }

   
    
}   
