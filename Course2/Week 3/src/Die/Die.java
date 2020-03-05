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
public class Die {
    
    private int value;
    private Random rnd;
    
    public Die(Random rnd) {
        this.rnd = rnd;
    }
    
    public int throwDie() {
        return rnd.nextInt(6) + 1;
    }
    
//    public int getValue() {
//        return this.value;
//    }
}
