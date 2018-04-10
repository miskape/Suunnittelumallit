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
public class TietokoneFactory implements AbstractFactory {
    
    
    @Override
    public Komponentti createKotelo() {
        return new Kotelo(67.90);
    }

    @Override
    public Komponentti createEmolevy() {
        return new Emolevy(136.90);
    }

    @Override
    public Komponentti createProsessori() {
        return new Prosessori(263.90);
    }

    @Override
    public Komponentti createNäytönohjain() {
        return new Näytönohjain(349.90);
    }

    @Override
    public Komponentti createMuistipiiri() {
        return new Muistipiiri(172.90);
    }

    @Override
    public Komponentti createVerkkokortti() {
        return new Verkkokortti(39.90);
    }
    
}
