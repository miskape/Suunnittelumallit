/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpizza;

/**
 *
 * @author miskape
 */
public abstract class Täytteet implements Pizza {
    
    protected Pizza LisääTäyte;
    
    public Täytteet(Pizza LisääTäyte){
        this.LisääTäyte=LisääTäyte;
    }
    
    public double getHinta(){
        return LisääTäyte.getHinta();
    }
    
    public String getDescription() {
        return LisääTäyte.getDescription();
    }
}
