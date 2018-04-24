/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpizza;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author miskape
 */
public class Main {
    public static void main(String[] args) {
         
        Map<String, Object> menu = new HashMap();
        Pizza tonnikala = new Tonnikala(new Pohja());
        Pizza kinkku= new Kinkku(new Pohja());
        Pizza salami = new Salami(new Pohja());
        
        menu.put("Tonnikalapizza", tonnikala);
        menu.put("Kinkkupizza", kinkku);
        menu.put("Salamipizza", salami);
        
        for(Map.Entry<String, Object> item : menu.entrySet()) {
            String name = item.getKey();
            Pizza pizza = (Pizza) item.getValue();
            
            System.out.println(name + ": " + pizza.getDescription() + " " + String.valueOf(pizza.getHinta()) + " €.");
        }
    }
}
