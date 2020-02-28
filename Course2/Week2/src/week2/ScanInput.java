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
public class ScanInput {

    //psvm + tab
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String dbPass = "hej123";
        int numberOfTimes = 2;
        int attempts = 0;

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
//        
//        System.out.print("Skriv en int: ");
//        int myInt = scan.nextInt();
//        
//        System.out.println(str);
//        
//        System.out.println(myInt);

    }

//          sout + tab
//        System.out.println("");
}
