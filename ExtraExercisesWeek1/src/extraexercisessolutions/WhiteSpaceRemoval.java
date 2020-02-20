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
public class WhiteSpaceRemoval {
    
    public static void main(String[] args) {
        String sentence = "De  t       t  e          e       r A  O                    F N  ords    jæ  ll  a         n ds J                a     v   a k  urs   us.";
        
        System.out.println("Original sætning: " + sentence);
        
        sentence = sentence.replaceAll(" ", "");
        
        String str = sentence.replace(" ", "");
        
        System.out.println(str);
        
        System.out.println("Sætning uden space: " + sentence);
    }
    
    
    
    
}
