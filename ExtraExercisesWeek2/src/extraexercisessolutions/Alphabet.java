/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraexercisessolutions;

/**
 *
 * @author mwn
 */
public class Alphabet {
    
    public static void main(String[] args) {
        
        //Deklarer en variabel (char) indeholdende en hvilken som helst karakter
        //Test om karakteren er med i alfabetet
        //Hint: Ascii
        
        char c = '/';
        
        if(c >= 65 && c <= 90 || c >= 97 && c <= 122) {
            System.out.println(c + " er i alfabetet");
        } else {
            System.out.println(c + " er ikke i alfabetet");
        }
    }
}
