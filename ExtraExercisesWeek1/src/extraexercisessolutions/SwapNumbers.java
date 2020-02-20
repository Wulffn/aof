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
public class SwapNumbers {

    public static void main(String[] args) {
        
        double first = 1.20;
        double second = 2.45;
        
        System.out.println("Før swap");
        System.out.println("Første nummer = " + first);
        System.out.println("Andet nummer = " + second);
        
        double temporary = first;
        
        first = second;
        
        second = temporary;
        
        System.out.println("Efter swap");
        System.out.println("Første nummer = " + first);
        System.out.println("Andet nummer = " + second);
    }
}
