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
    
    int nameLength = 0;
    
    while(nameLength < 2) {
      
      System.out.println("What is you name?");
    
      String name = input.next();
      
      //chec if name is less than 2 characters
      if(name.length() < 2){
      System.out.println("Please enter a name that is at least "
                       + "two letters long and no numbers");
      }
      
      else{ //name is at least 2 characters
        
        System.out.println("Nice to meet you " + name);
        System.out.println("Now lets check to make sure you didn't use any illegal characters");
       
      }
        //check of name contains letters
        
        //for example, go through each letter in the name "Lo!gan"
        //name.charAt(0) to look at the character in index 0
        
        //use the for-loop because we know how many letters it has
      for(int index = 0; index < name.length(); index++){
          
        System.out.println(name.charAt(index));
          
          
          //check if the character is a letter or number
        if(!Character.isLetter(name.charAt(index))){  //if it's not a letter

          System.out.println("This is an illegal character");
          
          System.out.println("Please enter a name that is at least "
                       + "two letters long and no numbers");
             
        }
          
        else{
          System.out.println("This is a letter");
            
        }
          
      }
        nameLength = name.length();
    }
      
      
      
  }// end of while loop
            
  }


  
