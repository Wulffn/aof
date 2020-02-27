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
public class Calculator {

    public static void main(String[] args) {
        
        //Opret et scannerobjekt
        //Få to tal som input fra brugeren
        //Få en operator fra brugeren - Hint: Scanner kan ikke få fat på en char værdi.
        //Operatoren kan derfor hentes som en string og derefter bruge .charAt() metoden. Operatoren vil være på index 0
        //Brug en switch og switch på operatoren
        //Udregn resultatet i hver case
        //Print regnestykket med resultat i konsollen

        Scanner scan = new Scanner(System.in);

        double num1, num2;
        double result = 0;
        char operator;

        System.out.println("Indtast første nummer: ");
        num1 = scan.nextDouble();
        System.out.println("Indtast operator (+, -, *, /): ");
        operator = scan.next().charAt(0);
        System.out.println("Indtast andet nummer: ");
        num2 = scan.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ikke en operator");
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
