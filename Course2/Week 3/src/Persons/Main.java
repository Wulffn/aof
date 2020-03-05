/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persons;

import java.util.Scanner;

/**
 *
 * @author mwn
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Person p1 = new Person("Mads", "Nielsen", 29);
        Person p2 = new Person("Mathias", "Nielsen", 21);
        
        p1.setBrother(p2);
        p2.setBrother(p1);
        
//        System.out.println(p1.getFirstName());
//        
//        p1.setFirstName("Kurt");
//        
//        System.out.println(p1.getFirstName());
//        
//        System.out.print("Giv personen " + p1.getFirstName() + " et nyt navn: ");
//        String newName = scan.next();
//        
//        p1.setFirstName(newName);
//        
        System.out.println("Personen hedder " + p1.getFirstName());
        System.out.println("Personens bror hedder " + p1.getBrother().getFirstName());
        
        
        
//        String str = "Hej";
//        
//        String str1 = new String("Hej");
    }
    
}
