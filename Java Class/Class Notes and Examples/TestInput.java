/*
  Steven Lemos
  CoSci 290
  
  Testing datatypes and input from the user
*/
import java.util.Scanner;//This is a Java object that allows you to take user input

public class TestInput{
  //main method - starting point of the applicaiton
  public static void main(String[]args){
    //dataype variableName = expression
    //1. Identifieres can only start with a letter, _ (underscore), or $ (dollar sign)
    //2. Identifiers with multiple words are camelCased 
    //e.g. - numOfStudents, name, interestRate
    
    //primative datatypes
    //int - interger - whole number (positive and negative) => 1,2,3
    //double - decimal number (positive and negative) => 3.33, 0.2, 0.333, -0.333
    //char - single character inside a single quotation => '3', '!', ' '
    //boolean - true or false => true, false
    
    //object/reference datatypes
    //String - characters surrounded with double quoatations => "skldfjsldk", "Cat", "3"
    /*There are other objects in Java that come with Java and that are custom
       => Objects/class that comes with Java: Scanner, System, ect. Objects
       => Costomer classes: Zombies, SpaceInvader, Person, ect.
    */
    
    final double PI_VALUE =  3.1415; //constants are all capital, multiple words separated by underscores
    String name = "Steven";
    name = "Ceaser";
    int numberOfStudents = 29;
    double avgGPA = 3.78;
    boolean gameOver = false; //or true
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hello, please type your name: ");
    
    name = input.next(); //.next() is used for String variable type
    
    System.out.println("Hi " + name);
    
    System.out.println("How old are you?");
    
    age = input.nextInt(); //.nextInt is used for Interger variable type
    
    System.out.println("So you are " + age + " years old");
    
    /*Arithmatic Operators
     + is used for addition
     - is used for subtraction
     * is used for multiplication
     / is used for division
     = is an assignment operator or something equals
     
     Programming math oerations follow the same order of operations:
     parenthesis (), exponents, multiplication or division, addition or subtraction from left to right
     
    */
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24;
    
    System.out.println("This means you are " + month + " months old OR " + days + " days old OR " 
                       + hours + " hours old");
    
  }
}