/*
  Steven Lemos
  CoSci 290
  
  Demo on the String class
*/
import java.util.Scanner;
public class TestStrings{

  //main method
  public static void main(String[] args) {
    
    //initiate the scanner object
    Scanner input = new Scanner(System.in);
    
    //ask the user a question
    System.out.println("Are you rich? Yes or No?");
    
    //get answer from console
    String answer = input.next();
    boolean flag = false;
    
    /*
    
    Example below is to test for specific respose
    
    answer.toLowerCase() - maks all the letters lowercase
    answer.toUppwerCase() - makes all the letters uppercase
    answer.equals("some other string") - checks if two Strings are exactly the same
    answer.equalsIgnorCase("no") - checks if two Strings are equal regardless of case
    
    */
    
    
    //check if the answer is Yes or No
    if(answer.equalsIgnoreCase("No")){   //The equalsIgnoreCase allows for any combonation of No
      System.out.println("That sucks!");
    }
    else{
      System.out.println("Cool.");
    }
    
    /*
      Impose some rules on user input
      name.length() - gives and int of how many characters the String is long
    */
    
    //example of a while loop
    
    int nameLength = 0;
    
    while(nameLength < 2) {
      
      System.out.println("What is you name?");
    
      String name = input.next();
      
      //chec if name is less than 2 characters
      if(name.length() < 2 || flag){
      System.out.println("Please enter a name that is at least "
                       + "two letters long and no numbers");
      }
      
      else{ //name is at least 2 characters
        
        //check of name contains letters
        
        //for example, go through each letter in the name "Lo!gan"
        //name.charAt(0) to look at the character in index 0
        
        //use the for-loop because we know how many letters it has
        for(int index = 0; index < name.length(); index++){
          
          System.out.println(name.charAt(index));
          
          
          //check if the character is a letter or number
          if(!Character.isLetter(name.charAt(index))){  //if it's not a letter
            flag = true;
            System.out.println("This is an illegal character");
           // break; //gets out of current loop
          }
          
          else{
            System.out.println("This is a letter");
            
          }
          
        }
        
      }
      
      
      nameLength = name.length();
    }// end of while loop
    
    /*
      when you want code to run at least once, use a do-while loop
      
      do{
        
        the body with code.
        
      }
    
    */
            
  }

}