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
public class A1Q5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        // ask the user to enter in a number between 1 and 10 
        System.out.println("Please enter in a number between 1 and 10: "); 
        
        // create a variable for integers that can used in the for loops 
        int nums = input.nextInt(); 
        
        // craete a string for the asterisks 
        String ast = "*"; 
        
        // create 2 for loops to display the asterisks vertically and horizontally to resemble a box shape 
        for(int x = 0; x < nums; x++){
            for(int y = 0; y < nums; y++){
                System.out.print(ast);
            }
            System.out.println();
        }     
    }
}