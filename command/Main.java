/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author miskape
 */
public class Main {
    public static void main(String[] args) {
    
    Valkokangas kangas = new Valkokangas();
    Command ylös = new YlösCommand(kangas);
    Command alas = new AlasCommand(kangas);
    Seinäpainike button1 = new Seinäpainike(ylös);
    Seinäpainike button2 = new Seinäpainike(alas);
    button1.push();
    button2.push();
    
    }
}
