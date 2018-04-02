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
public interface AbstractFactory { 
    
    public abstract Lippis createLippis();
    public abstract Paita createPaita();
    public abstract Housut createHousut();
    public abstract Kengät createKengät();
    
}
