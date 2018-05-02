/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author miskape
 */
public class IteratorThread extends Thread {
    String name;
    List<Integer> list;
    ListIterator<Integer> commonIterator;
    ListIterator<Integer> myIterator;
    Boolean hasNext;
    IteratorSynchronized is;
	
    public IteratorThread(String name, List<Integer> list, ListIterator<Integer> commonIterator, IteratorSynchronized is) {
	this.name = name;
	this.list = list;
	this.commonIterator = commonIterator;
	this.is = is;
	myIterator = list.listIterator();
    }
	
    public void iterateWithCommonIterator() {
	is.iterate(commonIterator, name);
    }
	
    public void iterateWithMyIterator() {
	is.iterate(myIterator, name);
    }
	
    public void run() {
	iterateWithMyIterator();
    }
}

