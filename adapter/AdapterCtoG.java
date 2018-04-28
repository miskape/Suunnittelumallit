/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptertesti;

/**
 *
 * @author miskape
 */
public class AdapterCtoG implements SocketTypeC {
    
    private SocketTypeG SocketG;
    public AdapterCtoG(){
	SocketG = new PlugTypeG();
    }
	
    @Override
    public void addToC(String plug) {
	SocketG.addToG(plug);
    }
}
