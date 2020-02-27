/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraexercisessolutions;

import java.util.Scanner;

/**
 *
 * @author mwn
 */
public class PositiveOrNegative {
    
    public static void main(String[] args) {
        
        //Opret et Scannerobjekt til at modtage et input
        //Test om input tallet er positivt eller negativt
        //Skriv svaret ud i konsollen
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indtast et positivt eller negativt tal:");
        
        double a = scan.nextDouble();
        
        if(a < 0) {
            System.out.println("Tallet er negativt: " + a);
        } else {
            System.out.println("Tallet er positivt: " + a);
        }
    }
    
}
