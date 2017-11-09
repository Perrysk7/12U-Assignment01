/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Parry Katodia
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a double for the population 
        double population = 6;
        // create the variable exceed so it can be used in the for loop
        double exceed = 10;
        // create the variable year and set it the initial date so it can be used in the for loop for counting 
        int year = 1999;
        
        // create a for loop to increase the population at a fixed rate until it 
        // reaches 10 billion and have the years counting while the population is increasing 
        for(;population < exceed; year++){
            population = population * 1.014; 
        }
        
        // print the answer of when the population will exceed 10 billion 
        System.out.println("The population will exceed 10 billion people in " + year);
    }  
}
