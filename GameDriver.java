/*
  Steven Lemos
  CoSci 290
  
  Homework assignment #1
  
  GameDriver, including a spash screen, story setup, in game questions and random
  elements that are used in if/else statements and a Game Over screen.

*/

import java.util.Scanner;  //This is a Java object that allows you to take user input

public class GameDriver{
  
  //Application starts here
  public static void main(String[] args) {
    
    String name = "Bob";
    String city = "Nowhere";
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("  ____  __    __   ____  __  _    ___  ____\n"  +
                       " /    ||  |__|  | /    ||  |/ ]  /  _]|    \\ \n" +
                      "|  o  ||  |  |  ||  o  ||  ' /  /  [_ |  _  | \n" +
                      "|     ||  |  |  ||     ||    \\ |    _]|  |  | \n" +
                      "|  _  ||  `  '  ||  _  ||     \\|   [_ |  |  |\n" +
                      "|  |  | \\      / |  |  ||  .  ||     ||  |  |\n" +
                      "|__|__|  \\_/\\_/  |__|__||__|\\_||_____||__|__|\n");
    
    
    System.out.println("You awaken from what feels like a long sleep and find yourself laying down in some sort of light blue enclosed space... \n");
    System.out.println("A semi transparent screen flickers to life in front of your face and words begins scrolling across it. \n");
    System.out.println("\"Bio Pod start up sequence intitalized...Calibrating...start up complete.\" \n"); 
    System.out.println("\"Checking Bio Pod user vital signs...user vital signs stable...initalizing user interface and memory check\" \n");
    System.out.println("You hear a crackling noise and a computerized voice speaks \n");
    System.out.println("\"Good morning and congradulations on sucessfully using Life-o-matic's Bio Pod Hibernation System\" \n");
    System.out.println("\"You have been in suspended animation for 1-0-0-0 years\" \n");
    System.out.println("\"Some slight brain damage may have occured during this time...please answer a few simple questions to evaluate brain function\" \n");
    System.out.println("\"Please state your name\"");
    
    name = input.next();
    
    System.out.println("\nGood job, it is nice to meet you " + name);
    
    System.out.println("\n\"Now please tell me name of the city where you were born\"");
    
    city = input.next();
    
    System.out.println("\n\"No kidding, my programmer is from " + city + "\"");

    System.out.println("\n\"Now, how old are you?\"");
    
    age = input.nextInt();
    
    System.out.println("Wow, you look great for someone who is " + age + " years old!");
    
    System.out.println("Well, thank you " + name + " for using this Bio Pod...your brain seems just fine. Good luck and welcome to the other side of space.");
   
                                             
  }

}