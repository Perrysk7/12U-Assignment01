
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // ask the user for a number between 1 and 10 
        System.out.println("Please enter in a number between 1 and 10: ");
        
        // create a variable for integers that can be implemented into a "for loop" to display asterisks
        int nums = input.nextInt(); 
        
        // create a string for the asterisk display 
        String ast = "*"; 
        
        // create a for loop to display the asteriks in a line  
        for(int x = 0; x < nums; x++){
            System.out.print(ast);
        }
    } 
}
