/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author miskape
 */
public interface Visitor {
  
    public void visit(Charizard instance);
    public void visit(Charmander instance);
    public void visit(Charmeleon instance);
}
