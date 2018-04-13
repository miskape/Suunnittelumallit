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
public class Päälikkö extends Handler {
    
    @Override
    protected String getKäsittelijä() {
        return "yksikön päällikkölle";
    }
    
    @Override
    protected double getHyväksyntä() {
        return BASE * 0.05;
    }
}

