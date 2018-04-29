/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miskape
 */
public class ListPrint {
    
    private List<String> lista;
    private ListConverter converter;
	
    public ListPrint(ListConverter converter) {
        this.lista = new ArrayList<String>();
        this.converter = converter;
        this.lista.add("I");
        this.lista.add("was");
        this.lista.add("having");
        this.lista.add("so");
        this.lista.add("much");
        this.lista.add("fun");
        this.lista.add("doing");
        this.lista.add("this");
        this.lista.add("excercise");
    }
	
    public void printString() {
        System.out.println(converter.listToString(lista));
    }   
}
