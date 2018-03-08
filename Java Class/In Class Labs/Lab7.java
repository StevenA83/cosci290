/*
  Steven Lemos
  Co Sci 290
  
  Lab 7
    Create a program that reads an unspecified number of intergers,
    count the number of postitive and negative values entered,
    calculate the total numbers entered and their average,
    end the input with a 0, 
    display the average as a floating-point number.
*/

//import scanner utility to allow for user input
import java.util.Scanner;

//
public class Lab7{
  
  //Main method
  public static void main(String[]args){
  
    //initiate the scanner object
    Scanner input = new Scanner(System.in);
    
    //Declare variables
    int number = 0;
    int numberCount = 0;
    int total = 0;
    int positiveNumbers = 0;
    int negativeNumbers = 0;
    String str = "";
    String negativeSign = "-";
   
    
    //Prompt user to enter a interger
    System.out.print("Enter an interger (the input ends if you enter a 0): ");
    str = input.nextLine();
    
    for(int index = 0; index < str.length(); index++){
      if(Character.isDigit(str.charAt(index))){
        
        numberCount++;
        positiveNumbers++;
        String tempString = str.charAt(index);
        int intValue = Integer.parseInt(tempString);
        total = total + intValue;
        
      }
      else if(str.charAt(index).equals(negativeSign)){
        
        positiveNumbers--;
        negativeNumbers++;
        String tempString = str.charAt(index + 1);
        int intValue = Integer.parseInt(tempString);
        total = total - intValue;
      }
      else{}
    }
    
    float average = (total/numberCount);
    System.out.println("The number of positives is " + positiveNumbers);
    System.out.println("The number of negatives is " + negativeNumbers);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
    
    /*
    number = input.nextInt();
    
    //Keep a count of how many numbers have been entered
    numberCount++;
    
    //check if number is positive, negative and store it in total
    if(number > 0){
      positiveNumbers++;
    }
    else if(number < 0){
      negativeNumbers++;
    }
    else{}
    
    //Add the number to the running total
    total = total + number;
    
   
    
    while(number != 0){
       //Prompt user to enter a interger
        System.out.print("Enter an interger (the input ends if you enter a 0): ");
        number = input.nextInt();

        //Keep a count of how many numbers have been entered
        numberCount++;

        //check if number is positive, negative and store it in total
        if(number > 0){
          positiveNumbers++;
        }
        else if(number < 0){
          negativeNumbers++;
        }
        else{}

        //Add the number to the running total
        total = total + number;
    }
    
    float average = (total/numberCount);
    System.out.println("The number of positives is " + positiveNumbers);
    System.out.println("The number of negatives is " + negativeNumbers);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
      
    */
  }
}