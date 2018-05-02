/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ListIterator;

/**
 *
 * @author miskape
 */
public class IteratorSynchronized {
    public synchronized void iterate(ListIterator<Integer> iterator, String threadName) {
	while(iterator.hasNext()) {
            System.out.println(threadName+": "+iterator.next());
            try {
                wait(100);
		notifyAll();
            }   
            catch (InterruptedException e) {
                e.printStackTrace();
            }
	}
    }
}

