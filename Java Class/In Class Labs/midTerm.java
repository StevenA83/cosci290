/*
  Steven Lemos
  Co Sci 290
  
  Midterm
    
    
    Modify your last lab of printing an n-by-n matrix (maintain the feature that n is given by the user) to print out random 
    numbers from 0 to 10. Write a test program that prints out two random matrices instead of the one. Do matrix addition 
    on these two matrices and print out the resulting matrix. 
    
*/

//initialize Scanner utility
import java.util.Scanner;

public class midTerm{
  
    
  //Main method
  public static void main(String[]args){

    //declare variables
    int n = 0;
       
    //allow for user input
    Scanner input = new Scanner(System.in);

    //Prompt user to enter a number
    System.out.println("Please enter an interger to generate a matrix of numbers from zero to ten");
    n = input.nextInt();

    //Print out a n-by-n matrix
    printMatrix(n);
  
    
  }//end of Main method

  //Matrix making method
  public static void printMatrix(int n){
    
    //Declare variables
    String matrix1 = ("");
    String matrix2 = ("");
    
    
    //For loop to generate "Matrix" number for each matrix created
    for(int stringnumber = 1; stringnumber < 3; stringnumber++){
      
      //Print out the Matrix number before each matrix is created individually
      System.out.println("Matrix " + stringnumber);
      
      //declare variables 
      String tempMatrix = ("");
      
      //For loop used to generate rows of the matrix
      for(int index1 = 0; index1 < n; index1++){

        //For loop to generate the lines across
        for(int index2 = 0; index2 < n; index2++){

          //create a random number from zero to ten
          int randomNumber = 0 + (int)(Math.random() * 11);

          //Print the random number and a space after it
          System.out.print(randomNumber + " ");
          
          //Save values to temporary matrix
          tempMatrix= (tempMatrix + randomNumber + " ");   
        
        }//end of for loop for index2

        //Move to the next line
        System.out.println("");
        
        //save new lines to temporary matrix
        tempMatrix = (tempMatrix + "\n");
            
      }//end of for loop for index1
      
      //Store the temporary matrix as iether matrix1 or matrix2 to be compared later
      if(stringnumber == 1){
        matrix1 = tempMatrix;
      }
      else{
        matrix2 = tempMatrix;
      }
     
    }//end of stringnumber for loop
    
    //add matrix1 and matrix2 together here
    /*for(int i = 0; i < matrix1.length()-1; i++){
      if(matrix1.isDigit(i)){
        Integer.parseInt(matrix1.charAt(i) + "",10);
      }
      
       
    }*/
     
  }//end of matrix making method
  
  

}//end of program