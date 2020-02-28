/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author mwn
 */
public class Løkker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String dbPass = "hej123";
        int numberOfTimes = 2;
        int attempts = 0;

//        int x = 0;
//        
//        while(x < 100) {
//            System.out.println(x);
//            x++;
//        }
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//        do {
//            System.out.println("loop");
//        } while (3 != 3);
        System.out.print("Skriv dit password: ");
        String str = scan.next();

        while (attempts < numberOfTimes) {
            if (str.equalsIgnoreCase(dbPass)) {
                System.out.println("Dit password passer");
                break;
            } else {
                System.out.println("Forkert - prøv igen");
                str = scan.next();
            }
            attempts++;
        }
    }
}
