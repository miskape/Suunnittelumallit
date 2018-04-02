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
public class Jasper {
    
    private AbstractFactory factory;
    private Lippis lippis;
    private Paita paita;
    private Housut housut;
    private Kengät kengät;
    
    public Jasper() { }

    public Jasper(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }
    
    public Lippis getLippis() {
        return lippis;
    }

    public void setLippis(Lippis lippis) {
        this.lippis = lippis;
    }
    
    public Paita getPaita() {
        return paita;
    }

    public void setPaita(Paita paita) {
        this.paita = paita;
    }
    
    public Housut getHousut() {
        return housut;
    }

    public void setHousut(Housut housut) {
        this.housut = housut;
    }

    public Kengät getKengät() {
        return kengät;
    }

    public void setKengät(Kengät kengät) {
        this.kengät = kengät;
    }
    
    public void getPukee() {
        lippis = factory.createLippis();
        paita = (Paita) factory.createPaita();
        housut = (Housut) factory.createHousut();
        kengät = factory.createKengät();
    }
    
    public String vaatteet() {
        return lippis.toString() + ", " + paita.toString() + ", " + housut.toString() + " ja " + kengät.toString() + ".";
    }
}
