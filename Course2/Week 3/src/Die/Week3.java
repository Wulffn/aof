/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Die;

import java.util.Random;

/**
 *
 * @author mwn
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rnd = new Random();

        Die die1 = new Die(rnd);
        Die die2 = new Die(rnd);

        int countOfSix = 0;
        int countOfDoubleSix = 0;

        for (int i = 0; i < 10000; i++) {
            int val = die1.throwDie();
            int val1 = die2.throwDie();
            
            if (val == 6 || val1 == 6) {
                countOfSix++;
            }
            
            if (val == 6 && val1 == 6) {
                countOfDoubleSix++;
            }
            
            
            
        }

        System.out.println(countOfSix);

        System.out.println(countOfDoubleSix);
//        die1.throwDie();
//        die2.throwDie();
//        
//        int dieVal = die1.getValue();
//        int dieVal2 = die2.getValue();
//        
//        System.out.println("Val1: " + dieVal);
//        System.out.println("Val2: " + dieVal2);
    }

}
