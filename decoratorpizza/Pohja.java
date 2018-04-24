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
public class Pohja implements Pizza{
    
    private double hinta = 4.0;
    
    @Override
    public double getHinta(){
        return hinta;
    } 
    
    @Override
    public String getDescription() {
        return "tomaatti, juusto,";
    }
}
