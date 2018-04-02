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
public class BossinFactory implements AbstractFactory{
    
    @Override
    public Lippis createLippis() {
        return new BossinLippis();
    }

    @Override
    public Paita createPaita() {
        return new BossinPaita();
    }

    @Override
    public Housut createHousut() {
        return new BossinHousut();
    }

    @Override
    public Kengät createKengät() {
        return new BossinKengät();
    }
    
}
