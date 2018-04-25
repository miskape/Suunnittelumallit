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
public class Burger {
    
    private String sämpylä;
    private String pihvi;
    private String muu;
    private String kastike;

    public void setSämpylä(String sämpylä) {
        this.sämpylä = sämpylä;
    }

    public void setPihvi(String pihvi) {
        this.pihvi = pihvi;
    }

    public void setMuu(String muu) {
        this.muu = muu;
    }

    public void setKastike(String kastike) {
        this.kastike = kastike;
    }
    
    @Override
    public String toString() {
        return sämpylä + ", " + pihvi + ", " +  muu + "ja " + kastike + ".";
    }
}
