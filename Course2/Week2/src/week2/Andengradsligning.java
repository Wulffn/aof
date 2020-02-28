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
public class Andengradsligning {

    public static void main(String[] args) {

        double a = -4;
        double b = -2;
        double c = 3;

        double d = Math.pow(b, 2) - (4 * a * c);

        System.out.println(d);

        if (d < 0) {
            System.out.println("Diskriminanten er mindre end 0 - ingen løsning");
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Diskriminanten er større - 2 løsninger, x1 = " + x1 + ", x2 = " + x2);
        } else {
            double x = -b / (2 * a);
            System.out.println("Diskriminanten er 0 - 1 løsning, x = " + x);
        }

    }

}
