/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author mwn
 */
public class SwitchTest {

    public static void main(String[] args) {

        String str = "goodbye";
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("hej");
                break;
            case 3:
                System.out.println("farvel");
                break;
            default:
                System.out.println("alt andet");
        }
        System.out.println("*************************");
    }
}

