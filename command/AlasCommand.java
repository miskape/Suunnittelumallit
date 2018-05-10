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
public class AlasCommand implements Command {
    
    private Valkokangas kangas;
    
    public AlasCommand(Valkokangas kangas){
        this.kangas = kangas;
    }
    
    @Override
    public void execute() {
	kangas.alas();
    }    
}
