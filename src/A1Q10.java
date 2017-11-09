
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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        // store the amount of words being counted 
        int i = 0; 
        // create a while loop  
        while(true){
            System.out.println("Please enter in a word: ");
            // create a string for the words 
            String word = input.nextLine();
            // write an if statement so when the user types 'exit', the proram 
            //will stop counting and return the user with the amount of words that are counted  
            if(word.equals("exit")){
                break; 
            }
            // adding to the total word count 
            i++; 
        }
        // give user the answer of how ever many words they entered inthe program
        System.out.println("You have entered in " + i + " words.");    
    }
}
