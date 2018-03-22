/*
  Steven Lemos
  Co Sci 290
  
  Lab 11
    Do this problem in the book: 6.17
      Write a method that displays an n-by-n matrix using the following header:
        public static void printMatrix(int n)
        
    Each element is 0 or 1, which is generated randomly.  Write a test program that
    prompts the user to enter "n" and displays the n-by-n matrix.prompts
    
*/

//initialize Scanner utility
import java.util.Scanner;

public class Lab11{
  
    
  //Main method
  public static void main(String[]args){

    //declare variables
    int n = 0;
    
    //allow for user input
    Scanner input = new Scanner(System.in);

    //Prompt user to enter a number
    System.out.println("Please enter an interger to generate a matrix of ones and zeroes");
    n = input.nextInt();

    //Print out a n-by-n matrix
    printMatrix(n);
  }//end of Main method

  //Matrix making method
  public static void printMatrix(int n){
    
    //For loop used to generate rows of the matrix
    for(int index1 = 0; index1 < n; index1++){

      //For loop to generate the lines across
      for(int index2 = 0; index2 < n; index2++){
        
        //create a random number of zero or one
        int randomNumber = 0 + (int)(Math.random() * 2);
        
        //Print the zero or one and a space after it
        System.out.print(randomNumber + " ");
      }//end of for loop for index2

      //Move to the next line
      System.out.println("");

    }//end of for loop for index1
  }//end of matrix making method


}//end of program