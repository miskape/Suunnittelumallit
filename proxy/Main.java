/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author miskape
 */
public class Main {
    
    private final static Scanner scanner = new Scanner(System.in);
    private static List<Image> kuvat = new ArrayList();
    
    public static void main(final String[] arguments) {
	
	final Image image1 = new ProxyImage("image1");
	final Image image2 = new ProxyImage("image2");
	final Image image3 = new ProxyImage("image3");
		
	kuvat.add(image1);
	kuvat.add(image2);
	kuvat.add(image3);
		
	for (Image image : kuvat) {
            image.showData();
	}
		
		
	int currentImage = 0;
	String selection;
	kuvat.get(currentImage).displayImage();
	while(true) {
            System.out.println("");
            System.out.print("Edellinen (1) Seuraava (2) ");
            selection = scanner.next();
            
            if(selection.equals("2")) {
                if(currentImage == kuvat.size() - 1) {
                    currentImage = 0;
                }
                else {
                    currentImage++;
                }
            }
            if(selection.equals("1")) {
		if(currentImage == 0) {
                    currentImage = kuvat.size() - 1;
		}
		else {
                    currentImage--;
		}
            }
            
            kuvat.get(currentImage).displayImage();
        
        }  
    }
}