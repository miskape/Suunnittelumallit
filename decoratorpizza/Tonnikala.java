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
public class Tonnikala extends Täytteet {
    
    private double hinta;
    
    public Tonnikala(Pizza LisääTäyte){
        super(LisääTäyte);
        hinta = 1.5;
    }
    
    @Override
    public double getHinta(){
        return super.getHinta() + hinta;
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " tonnikala"; 
    }
}
