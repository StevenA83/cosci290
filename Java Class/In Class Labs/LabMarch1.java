/*
  Steven Lemos
  Co Sci 290
  
   Lab -  write a program that takes user input in the format of "[number between 0-9][item]"
      
        input: 2 guns
        output: You have 2 itmes
                Those item are guns

*/

import java.util.Scanner;
public class LabMarch1{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    int howMany = 0;
    String items = "";
    
    
    System.out.println("Please enter the number of items you are carrying");
    
    howMany = input.nextInt();
    
    System.out.println("Great, now tell me what the items are");
    
    items = input.next();
    
    System.out.println("Thank you so much, you have " + howMany + " items");
    System.out.println("And those items are " + items);
        
  }
}