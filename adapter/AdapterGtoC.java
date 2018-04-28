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
public class AdapterGtoC implements SocketTypeG{
    
    private SocketTypeC SocketC;
    public AdapterGtoC(){
	SocketC = new PlugTypeC();
    }
	
    @Override
    public void addToG(String plug) {
	SocketC.addToC(plug);
    }
}
