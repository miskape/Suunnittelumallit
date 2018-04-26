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
public class McDonalds extends HamppariBuilder<StringBuilder>{
    
    public McDonalds(){
        burgerStructure = new StringBuilder();
    }
    
    @Override
    public void buildSämpylä() {
        Sämpylä sämpylä = new Sämpylä("Big Mac™ –sämpylä ");
        burgerStructure.append(sämpylä.getSämpylä());
        hamppari.setSämpylä(sämpylä.getSämpylä());
    }

    @Override
    public void buildPihvi() {
        Pihvi pihvi = new Pihvi("naudanlihapihvi ");
        burgerStructure.append(pihvi.getPihvi());
        hamppari.setPihvi(pihvi.getPihvi());
    }

    @Override
    public void buildMuu() {
        Muu muu = new Muu("jäävuorisalaatti, suolakurkku, cheddarjuusto ");
        burgerStructure.append(muu.getMuu());
        hamppari.setMuu(muu.getMuu());
    }

    @Override
    public void buildKastike() {
        Kastike kastike = new Kastike("Big Mac™ –kastike");
        burgerStructure.append(kastike.getKastike());
        hamppari.setKastike(kastike.getKastike());
    }
}
