/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


/**
 *
 * @author miskape
 */
public class McDonalds extends BurgerBuilder<StringBuilder>{
    
    public McDonalds(){
        burgerStructure = new StringBuilder();
    }
    
    @Override
    public void buildSämpylä() {
        Sämpylä sämpylä = new Sämpylä("Big Mac™ –sämpylä ");
        burgerStructure.append(sämpylä.getSämpylä());
        burger.setSämpylä(sämpylä.getSämpylä());
    }

    @Override
    public void buildPihvi() {
        Pihvi pihvi = new Pihvi("naudanlihapihvi ");
        burgerStructure.append(pihvi.getPihvi());
        burger.setPihvi(pihvi.getPihvi());
    }

    @Override
    public void buildMuu() {
        Muu muu = new Muu("jäävuorisalaatti, suolakurkku, cheddarjuusto ");
        burgerStructure.append(muu.getMuu());
        burger.setMuu(muu.getMuu());
    }

    @Override
    public void buildKastike() {
        Kastike kastike = new Kastike("Big Mac™ –kastike");
        burgerStructure.append(kastike.getKastike());
        burger.setKastike(kastike.getKastike());
    }
}
