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
public class MilliToMinAndSec {
    
    public static void main(String[] args) {
        
        long milliseconds = 3288234;
        
        
        long minutes = (milliseconds / 1000 / 60);
        
        long seconds = (milliseconds / 1000);
        
        System.out.println(milliseconds + " millisekunder er:");
        System.out.println(minutes + " minutter");
        System.out.println("eller");
        System.out.println(seconds + " sekunder");
    }
    
}
