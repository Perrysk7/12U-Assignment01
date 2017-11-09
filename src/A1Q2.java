
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
     
        // create an array to store 3 numbers 
        double[]nums = new double[3];
        
        // ask the user to enter in the 3 numbers 
        for(int n = 0; n < nums.length; n++){
            // ask the user for the numbers 
            System.out.println("Please enter in a number " + (n + 1));
            nums[n] = input.nextDouble(); 
        }
        // create the variable "product" and set it equal to the multiplication of numbers given by the user
        double product = nums[0] * nums[1] * nums[2]; 
        
        // dispay the product of the numbers taken from the user
        System.out.println("The product of your numbers is: " + product);
        
        // now give user the square of the product recieved from the numbers given by the user
        double square = Math.pow(product,2);
        
        // display the square of the product 
        System.out.println("The square of your product is: " + square);
        
        // finilly, give user the square root of the product 
        double squareroot = Math.sqrt(product);
        
        // display the square root of the product 
        System.out.println("The square root of your product is: " + squareroot);    
    }
}
