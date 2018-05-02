/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author miskape
 */
public class Main {
    public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	for(int i = 0; i <= 20; i++) {
            list.add(i);
	}
	IteratorSynchronized is = new IteratorSynchronized();
	ListIterator<Integer> commonIterator = list.listIterator();
	IteratorThread thread1 = new IteratorThread("thread 1", list, commonIterator, is);
	IteratorThread thread2 = new IteratorThread("thread 2", list, commonIterator, is);	
	thread1.start();
	list.set(20, 20);
	thread2.start();
    }
}
