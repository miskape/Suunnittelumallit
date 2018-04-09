/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author miskape
 */
public interface State {
    
    public void liiku(Context context);
    public void hyökkää(Context context);
    public void puhu(Context context);
}
