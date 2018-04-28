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
public class PlugTypeG implements SocketTypeG {
    
    private AdapterGtoC adapter;
	
    @Override
    public void addToG(String plug) {
	System.out.println(plug + " connected to G socket.");
    }
 
    public void addGtoC(String plug){
        adapter = new AdapterGtoC();
	adapter.addToG(plug);
    }
}
