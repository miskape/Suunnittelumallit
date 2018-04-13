/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.util.Scanner;

/**
 *
 * @author miskape
 */
public class Main {
    
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double prosentti = 0.0;
        Esimies esimies = new Esimies();
        Päälikkö päälikkö = new Päälikkö();
        Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
        
        esimies.setSuccessor(päälikkö);
        päälikkö.setSuccessor(toimitusjohtaja);
        
        while(prosentti >= 0.0) {
            System.out.print("Anna työntekijän palakankorotus prosentteina ");
            prosentti = scanner.nextDouble();
            esimies.processRequest(new Palkankorotus(prosentti));
        }  
    }   
}

