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
public class VowelConsonant {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast et bogstav: ");

        String input = scan.nextLine().toLowerCase();

        switch (input) {
            case "a":
                System.out.println(input + " er en vokal");
                break;
            case "e":
                System.out.println(input + " er en vokal");
                break;
            case "i":
                System.out.println(input + " er en vokal");
                break;
            case "o":
                System.out.println(input + " er en vokal");
                break;
            case "u":
                System.out.println(input + " er en vokal");
                break;
            case "y":
                System.out.println(input + " er en vokal");
                break;
            default:
                System.out.println(input + " er en konsonant");
        }

    }

}
