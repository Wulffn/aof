/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author mwn
 */
public class StringManipulation {
    
    public static void main(String[] args) {
        
        String str = "Hello World";
        
        String newStr = str.replace("l", "o");
        
        String newStr2 = str.concat(newStr);
        
        String name = "Kurt Hansen";
        
        System.out.println(newStr);
        
        System.out.println(newStr2);
        
        System.out.println(name.split(" ")[0]);
    }
    
}
