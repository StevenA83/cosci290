/*
  Steven Lemos
  Co Sci 290
  March 20, 2018
  
  Lab 10, Part 2
    5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000, ten per line, 
    that are divisible by 5 and 6. Numbers are separated by exactly one space.
    
*/

public class Lab10Part2{

  //Main method
  public static void main(String[]args){
    
    //Declare variables 
    int number = 100;
    int numbersPerLine = 10;
    int count = 0;
    
    //Begin while loop that will check numbers between 100 and 1000 (inclusive) 
    while(number >= 100 && number <= 1000){
      
      //Check to see if "number" is divisible by 5 or 6 with no remainder
      if(number % 5 == 0 || number % 6 == 0){
        
        //increase "count" by 1 each time the "number" is divisible by 5 or 6
        count += 1;        
        
        //check to see if "count" is divisible by 10
        if(count % numbersPerLine == 0){
          
          //Print out current "number" and start a new line every 10th number
          System.out.println(number); 
        }
        
        //What to do if "number" is not the 10th number in the line
        else{
          
          //Print out the current "number" with a space after it 
          System.out.print(number + " ");           
        }
      }
      
      //Do nothing if "number" is not divisible by 5 or 6
      else{}
      
      //Increase the number by 1 each loop
      number += 1;
      
    }//end of while loop
  }//end of Main method

}//end of program