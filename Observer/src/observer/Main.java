/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author miskape
 */
public class Main {
    
    public static void main(String[] args) {
        
        ClockTimer timer = new ClockTimer();
        DigitalClock clock = new DigitalClock(timer);
        
    }
}
