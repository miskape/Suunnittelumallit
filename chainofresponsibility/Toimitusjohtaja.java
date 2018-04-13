/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author miskape
 */
public class Toimitusjohtaja extends Handler {
    
    @Override
    protected String getKäsittelijä() {
        return "toimitusjohtajalle";
    }
    
    @Override
    protected double getHyväksyntä() {
        return BASE * 1.0;
    }
}
