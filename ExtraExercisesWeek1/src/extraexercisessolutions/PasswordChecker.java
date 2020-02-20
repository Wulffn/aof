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
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String password = "Password1234";
        String databasePassword = "password1234";
        
        boolean testPassword1 = password.equals(databasePassword);
        
        boolean testPassword2 = password.equalsIgnoreCase(databasePassword);
        
        System.out.println(testPassword1);
        System.out.println(testPassword2);
        
    }
    
}
