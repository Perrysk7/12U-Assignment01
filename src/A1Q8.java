
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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // ask the user to enter the starting amount
        System.out.println("Please enter in the initial amount of bank account.");
        
        // store the value given by the user 
        double initial = input.nextDouble(); 
        
        // ask the user for the bank's interest rate 
        System.out.println("Please enter in the interest rate of your bank as a decimal.");
        
        // store this vaue 
        double irate = input.nextDouble(); 
        
        // create an integer for the years it takes the money to double 
        int DY = 0; 
        
        // create an integer for the years it takes to reach $1M 
        int MY = 0; 
        
        // create a for loop to calculate when the the initail amount in the bank will double 
        for(double i = initial; i < initial * 2; i += (i * irate)){
            DY++; 
        }
        
        // create a for loop to calculate when the money will hit $1M 
        for(double i = initial; i < 1000000; i += (i *irate)){
            MY++; 
        }
        
        // Print out the final result of the calculation 
        System.out.println("Your initial amount in the bank will double in " + DY + " year(s).");
        System.out.println("Your intial amount in the bank will take " + MY + " year(s) to reach $1 million.");    
    }
}
