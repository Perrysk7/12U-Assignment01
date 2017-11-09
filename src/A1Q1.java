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
public class A1Q1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create a scanner 
        Scanner input = new Scanner(System.in);  
        // ask the user for their name
        System.out.println("Please enter your name");
        // get the name from the user
        String name = input.nextLine();
        // say hello to the user
        System.out.println("Hello " + name +"!"); 
    }  
}
