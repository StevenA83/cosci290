/*
  Author: Steven Lemos
  Co Sci 290
  April 3, 2018
  Purpose: Write a method that finds the smallest element in the array of double
    values using the following header:
      public static double min(double[] array)
    Write a test program that prompts the user to enter ten numbers, invokes this
    method to return to minimum value and displays the minimum value.method
    
*/

import java.util.Scanner;  //This is a Java object that allows you to take user input
public class Lab18{
  
  //begin main method
  public static void main(String[]args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    Double[] numbers = new Double[10];
    
    //Prompt user to enter 10 numbers and assign those numbers to the array
    System.out.println("Please enter 10 numbers: ");
    numbers[0] = input.nextDouble();
    numbers[1] = input.nextDouble();
    numbers[2] = input.nextDouble();
    numbers[3] = input.nextDouble();
    numbers[4] = input.nextDouble();
    numbers[5] = input.nextDouble();
    numbers[6] = input.nextDouble();
    numbers[7] = input.nextDouble();
    numbers[8] = input.nextDouble();
    numbers[9] = input.nextDouble();
    
    for(int index = 0; index < numbers.length; index++){
    System.out.println("Element "+ index + ": " + numbers[index]);
    
    //call "min" method to find the smallest element
   // min(numbers);
    
  }//end of main method
  
  //method to find the smallest element
  /*public static double min(double[]array){
    
    //declare variables
    double temp = 0;
    
    for(int index = 0; index < array.length; index++){
      
      
    }//end of for loop
    
  }//end of smallest element method
  */
  }
}