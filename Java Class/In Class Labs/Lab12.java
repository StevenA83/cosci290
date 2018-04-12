/* 
  
 	<<!----- Steven Lemos ------>> 
  Co Sci 290
  April 12, 2018
 	Lab 12 
  
 	Directions: 
 	1. This application has bugs. Edit my code so that the program compiles and runs. 
 	2. Comment every line of code. 
 	3. Add code or modify the code so that the following output is achieved: 
  
 	Sample output with odd number: 
  
 	This program will check if a number is even or odd... 
 	Please enter in a whole number... 
 	3 
 	The number 3 is odd... 
  
  
 	Sample output with even number: 
  
 	This program will check if a number is even or odd... 
 	Please enter in a whole number... 
 	2 
 	The number 2 is even... 
  
 	 
 	Note: 
 	Preserve the indentation of the code.  
 	Clean java code has: 
 	 proper indentation 
 	 variable declaration at the beginning of the program 
 	 class name starts with a capital 
 	 comments that explains the logic 
  
 */ 

//Import Scanner utility to allow for user input
 import java.util.Scanner;
 
//Start of program
 public class Lab12{ 
 
 //Main method
 	public static void main(String[]args){ 
 
    //Initalize Scanner object
 		Scanner input = new Scanner(System.in); 
    
    //Declare vaiable "num" as an interger
 		int num = 0; 
 
    //Output telling the user what this proram will do
 		System.out.println("This program will check if a number" 
 			+ " is even or odd..."); 
 
    //Prompt user to input a whole number
 		System.out.println("Please enter in a whole number..."); 
 
    //save the user inputed number as "num"
 		num = input.nextInt(); 
 
    //run the "checkNums" code to see if user number is odd or even
 		checkNums(num); 
 
 	} 
 
 //function to check the user input
 	public static void checkNums(int num){
    
    //check to see if the "num" is even
    if(num % 2 == 0){
      
      //if it is even tell the user it is an even number
      System.out.println("The number " + num + " is even...");
    }
    
    //if "num" is not even
    else{
      
      //tell the user "num" is an odd number
      System.out.println("The number " + num + " is odd...");
      
    }//end of if/else statement
 
 	}//end of checkNums function 
}//end of program 
 
