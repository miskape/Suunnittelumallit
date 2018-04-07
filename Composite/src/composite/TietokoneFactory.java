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
public class TietokoneFactory implements {
    
    @Override
    public Component createKotelo() {
        return new Kotelo(00.00);
    }

    @Override
    public Component createEmolevy() {
        return new Emolevy(00.00);
    }

    @Override
    public Component createProsessori() {
        return new Prosessori(00.00);
    }

    @Override
    public Component createNäytönohjain() {
        return new Näytönohjain(00.00);
    }

    @Override
    public Component createMuistipiiri() {
        return new Muistipiiri(00.00);
    }

    @Override
    public Component createVerkkokortti() {
        return new Verkkokortti(00.00);
    }
    
}
