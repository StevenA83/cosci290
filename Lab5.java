/*

  Steven Lemos
  Co Sci 290
  
  Lab 5
    -fix the logic and make this code check if each character is a letter
    
*/

import java.util.Scanner;
public class Lab5{

  //main method
  public static void main(String[] args) {
    
    //initiate the scanner object
    Scanner input = new Scanner(System.in);
    
    //Set initial conditions for variables
    boolean nameLength = false;
    boolean allLetters = true;
    String name = "";
    
    //Begin "while loop"
    while(nameLength == false  || allLetters == false) {
      
      //Reset "allLetters" boolean value to "true" each time loop is run
      allLetters = true;
      nameLength = false;
      
      //Promt to get user to enter a String
      System.out.println("What is you name?");
    
      //Saving user input as variable "name" 
      name = input.next();
      
      
      //check if name is less than 2 characters
      if(name.length() >= 2){
        
        //If the nameLength is at least 2 characters the boolean value is switched to true
        nameLength = true;    
      }
      
      else{   
        
        //If nameLength is not at least 2 letters, nothing happens and the boolean value remains false
      }
      
      //create index of name characters
      for(int index = 0; index < name.length(); index++){
        
        //checking each charaters to see if it is a letter
        if(Character.isLetter(name.charAt(index))){ 
          
          //If the character being checked is a letter, nothing happens and "allLetters" boolean value remains "true"                    
        }
        
        //If a character in "name" is not a letter, the boolean value for "allLetters" is changed to "false"
        else{
          allLetters = false;
        }
       
      }//end of "for loop" where the characters in "name" are checked if they are letters or not
      
      //What to do if either the "nameLength" or the "allLetters" conditions fail
      if(nameLength == false || allLetters == false){
        
        //Telling the user what condtions must be met for a name to be acceptable
        System.out.println("Invalid entry, please enter a name that is at least 2 charaters long and only contains letters.");
      }
      
      //If all conditions are met and a valid name has been entered
      else{
        System.out.println("Thank you " + name + " for entering a valid name, have a nice day.");
      }
      
    }//end of while loop
            
  }//end of main method
  
}//end of program


  
