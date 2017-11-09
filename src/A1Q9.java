
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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner 
        Scanner input = new Scanner(System.in); 
        
        // create a string/array to store the words 
        String[] words = new String[10]; 
        
        // make a new double and set it to 0 for counting 
        double wordCount = 0; 
        
        // ask the user to type in 10 words sepreatly 
        System.out.println("Please enter in 10 words seprately.");
        
        //create a for loop to add to the letter count 
        for(int i = 0; i < words.length; i++){
            words[i] = input.nextLine();
            wordCount = words[i].length(); 
        }
        // calculate the average 
        double average = wordCount / words.length; 
        
        // Print the average letter amount 
        System.out.println("The letter average within these words is " + average + ".");    
    }  
}
