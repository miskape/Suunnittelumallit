/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author miskape
 */
public class Strategia1 implements ListConverter{
    
    @Override
    public String listToString(List<String> list) {
        
	String listString = "";	
	for (String s : list) {
            listString += s + "\n";
	}
	return listString;
    }
}
