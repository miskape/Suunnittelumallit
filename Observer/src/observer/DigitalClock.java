/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author miskape
 */
public class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.addObserver(this);
    }
   
    @Override
    public void update(Observable o, Object arg) {
        draw();
    }
    
    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
