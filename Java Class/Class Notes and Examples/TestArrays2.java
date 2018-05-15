/*
  Author: Steven Lemos
  Purpose: Go over the basics of arrays.

*/

public class TestArrays2{

  //starting point of program
  public static void main(String[]args){
    
    //declare an array of intergers
    int[] numbers = new int[5];
    
    //assign a value inside this array called numbers
    numbers[0] = 100;
    numbers[1] = 33;
    numbers[2] = -1;
    numbers[3] = 3;
    numbers[4] = -8;
    
    //update a value
    numbers[0] = 3;
    
    //create a new array of 6 values
    numbers = new int[6];
    //{0,0,0,0,0,0}
    numbers[5] = -12;
    //{0,0,0,0,0,-12}
    
    //randomly assign intergers to each index of the array using a loop
    for(int = i; 0 < 6; i++){
      numbers[i] = (int)(Math.random() * 100) + 1;
    }
    
    //print out each element
    for(int i =o, i < 6, i++){
      
    }
    
    
    System.out.println(numbers);
  
  
  }//end of main
}//end of class