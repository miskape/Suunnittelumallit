/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author miskape
 */

public interface State {
    
    public void hyökkää();
    public void liiku();
    public void puhu();
    public void kehitysaste(final Context pokemon);
    public void accept(Visitor visitor);
}
