/*
  Steven Lemos
  Co Sci 290

  Use control structures to do string manipultion and 
    user validation
    
    Built-in String fucntions
      str.length()
      str.toLowerCase() - makes all letters lowercase
      str.toUpperCase() - makes all letters uppercase
      str.equals("some other string") - checks if two Strings are exactly the same
      str.equalsIgnoreCase("no") -  checks if two Strings are equal regardless of case
      str.charAt(int index) - get a specific character at index
      str.substring(int startIndex, int endingIndex) - gives a subset string based on given range
      
      Lab -  write a program that takes user input in the format of "[number between 0-9][item]
      
        input: 2 guns
        output: You have 2 itmes
                Those item are guns
*/

public class Logic1_2{
  public static void main(String[] args){
  
    String str = "Java Rules!"; //length = 11
    
    for(int index = 0; index < str.length(); index++){
      System.out.println(str.charAt(index));
      
      if(index % 2 == 0){
        System.out.println(str.charAt(index));
        
      }
      
    }
   
  }
  
}