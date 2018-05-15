/*
  Author: Steven Lemos
  Date: May 15, 2018
  Purpose: Lab 20 
    Declare a 2D array of integers with 5 rows and 6 columns. 
    Randomly assign each index an integer between 0 and 100. 
    Create a custom function that takes in a 2D array of integers and finds the sum of each row. 
    Each sum is saved into an array of integers that is returned by the function.
*/

public class Lab20{
  
  //start main method  
  public static void main(String[]args){
    
    
      
    //declare a 2d array of intergers with 5 rows and 6 columns
    int[][] numbers = new int[5][6];
    int counter = 0;
       
    //assign random values to each index of 2d array
    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers[i].length; j++){
        numbers[i][j] = (int)(Math.random() * 100) + 1;
        System.out.print(numbers[i][j] + " ");
        counter++;
        if(counter % 6 == 0) 
          System.out.println("");
          
      }//end of "j" for loop
    }//end of "i" for loop
    
  
  }//end of main method
  
  //custom method that finds the sum of each row of a 2d array and returns those sums as an array
  public static int sum2DArray(int[][] array){
    
    //declare array for sums
    int[] sums = new int[5];
    
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
       sums = sums + array[i][j] + " ";
      }
    }
    return sums;
  }//end of sum2DArray method 
}//end of class