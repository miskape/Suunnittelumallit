/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author miskape
 */
public class Hesburger extends BurgerBuilder<List> {
    
     public Hesburger() {
        burgerStructure = new ArrayList();
    }
    
    @Override
    public void buildSämpylä() {
        Sämpylä sämpylä = new Sämpylä("Jättisämpylä ");
        burgerStructure.add(sämpylä);
        burger.setSämpylä(sämpylä.getSämpylä());
    }

    @Override
    public void buildPihvi() {
        Pihvi pihvi = new Pihvi("kanapihvi ");
        burgerStructure.add(pihvi);
        burger.setPihvi(pihvi.getPihvi());
    }

    @Override
    public void buildMuu() {
        Muu muu = new Muu("maustekurkku jäävuorisalaatti ");
        burgerStructure.add(muu);
        burger.setMuu(muu.getMuu());
    }

    @Override
    public void buildKastike() {
        Kastike kastike = new Kastike("kurkkumajoneesi");
        burgerStructure.add(kastike);
        burger.setKastike(kastike.getKastike());
    }
}
