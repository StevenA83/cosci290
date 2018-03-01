/*
  Steven Lemos
  Co Sci 209
  
  Topics:
    -muliti-way if-else
    -logical operators
    -symbolic logic

*/
import java.util.Scanner;
public class TestLogic{
  
  //entry point of applicaiton
  public static void main(String[] args){
    
    //Starting up Scanner for user input
    Scanner input = new Scanner(System.in);
    
    //Prompt user to enter a grade
    System.out.println("Please enter a grade");
    
    
    int grade = input.nextInt();
    
    //simple if
    if(grade >= 90){
      System.out.println("A");
    }
    
    //Two-way if-else
    if(grade < 90){
      System.out.println("grade is not an A");
    }
    else{
      System.out.println("grade is an A");
    }
    
    //multi if - else if - else
    if(grade >= 90){              //Check to see if statement if true, if it is it will execute the next line then ignore the rest of the "else" statement
      System.out.println("A");    //If the statement is false, then moves on to the next else if statement
    }
    else if(grade >= 80){
      System.out.println("B");
    }
    else if(grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F");
    }
    
    //Logical Operators
    /*
      ! - NOT
      != - NOT equal to
      == - is equal to 
      && - AND ==>
      || - OR
    */
    
    //Using if-else write code that checks whether a student's grade
    //is good, average, or bad
    
    if(grade >= 80){
      System.out.println("This is a good grade.");
      
      //nested-if
      if(grade >=90){
        System.out.println("Excellent work, you got an A.");
      }
    }
    else if(grade < 80 && grade >=70){
      System.out.println("This grade is average.");
    }
    else{
      System.out.println("This is a bad grade.");
    }
    
  }
}