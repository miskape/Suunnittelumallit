/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author miskape
 */
public abstract class Handler {
    protected final static double BASE = 100; 
    protected Handler successor;
    
    protected abstract String getKäsittelijä();
    protected abstract double getHyväksyntä();
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    public void processRequest(Palkankorotus request) {
        if(request.getMäärä() < this.getHyväksyntä()) {
            System.out.println("Palkankorotus ohjataan " + this.getKäsittelijä() + ".");
        }
        else if(successor != null) {
            successor.processRequest(request);
        }
        else System.out.println("Liian suuri pyyntö");
    }
}