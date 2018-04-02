/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author miskape
 */
public class Main {
    
    public static void main(String[] args) {
        Jasper jasper = new Jasper();
        AbstractFactory[]factories = {new AdidasFactory(),new BossinFactory()};
        
        for(AbstractFactory factory : factories) {
            jasper.setFactory(factory);
            jasper.getPukee();
            System.out.println("Jasperi pukee päällensä " + jasper.vaatteet());
        }
    }
}
