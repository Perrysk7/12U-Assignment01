
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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // ask the user to enter in a number between 50 and 100
        System.out.println("Please enetr in a number between 50 and 100: ");
        
        // create the variable that are going to be used in loops 
        int num = input.nextInt(); 
        int counter = 100; 
        
        // print the line stating the count down 
        System.out.println("The count down from 100 is: ");
        
        // crate an if statement which will allow the for loop to work if the conditions match
        if(num >= 50 && num <= 100){
            // use the for loop to have the count down done by 5's untill the counter is reaches the "number" that is smaller
            for(int i = 0; i < counter; i++){
                // have the count down by 5's
                counter = counter - 5;
                // add a plus 5 to the counter to print the 100 in the count down
                System.out.println(counter + 5);
                // if the counter is smaller than the num... than break the loop of the count down 
                if(counter < num){
                    break; 
                }   
            }
        }    
    }  
}
