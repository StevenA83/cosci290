/*
  Steven Lemos
  CoSci 290
  
  Homework assignment #1
  
  GameDriver, including a spash screen, story setup, in game questions and random
  elements that are used in if/else statements and a Game Over screen.

*/

import java.util.Scanner;  //This is a Java object that allows you to take user input
import java.util.concurrent.TimeUnit;

public class GameDriver{
  
  //Application starts here
  public static void main(String[] args) throws Exception {
    
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
    
    
    Thread.sleep(3000);
    System.out.println("\n\n\nYou awaken from what feels like a long sleep and find yourself laying down in some sort of light blue enclosed space... \n");
    Thread.sleep(7000);
    
    System.out.println("A semi transparent screen flickers to life in front of your face and words begins scrolling across it. \n");
    Thread.sleep(7000);
    
    printWithDelays("\"Bio-Pod start up sequence intitalizing...\"", TimeUnit.MILLISECONDS, 75); 
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Calibrating life support systems...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Monitoring power transfer modules...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Start up sequence complete...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Evaluating Bio-Pod user vital signs...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Vital signs holding steady...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Initializing audio user interface...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(3000);
    
    System.out.println("\n\nYou hear a crackling noise and a computerized voice speaks \n");
    Thread.sleep(5000);
    
    System.out.print("\"Good");
    Thread.sleep(750);
    System.out.print(" morning");
    Thread.sleep(750);
    System.out.print(" and");
    Thread.sleep(750);
    System.out.print(" congradulations");
    Thread.sleep(750);
    System.out.print(" on");
    Thread.sleep(750);
    System.out.print(" sucessfully");
    Thread.sleep(750);
    System.out.print(" using");
    Thread.sleep(750);
    System.out.print(" Life");
    Thread.sleep(750);
    System.out.print("-o-");
    Thread.sleep(750);
    System.out.print("Matic's");
    Thread.sleep(750);
    System.out.print(" Bio-");
    Thread.sleep(750);
    System.out.print("Pod");
    Thread.sleep(750);
    System.out.print(" Hibernation");
    Thread.sleep(750);
    System.out.print(" System\"");
    Thread.sleep(2000);
    
    System.out.print("\n\n\"You");
    Thread.sleep(750);
    System.out.print(" have");
    Thread.sleep(750);
    System.out.print(" been");
    Thread.sleep(750);
    System.out.print(" in");
    Thread.sleep(750);
    System.out.print(" suspended");
    Thread.sleep(750);
    System.out.print(" animation");
    Thread.sleep(750);
    System.out.print(" for");
    Thread.sleep(750);
    System.out.print(" 1");
    Thread.sleep(750);
    System.out.print("0");
    Thread.sleep(750);
    System.out.print("0");
    Thread.sleep(750);
    System.out.print("0");
    Thread.sleep(750);
    System.out.print(" years\"");
    Thread.sleep(2000);
    
    System.out.print("\n\n\"Some");
    Thread.sleep(750);
    System.out.print(" slight");
    Thread.sleep(750);
    System.out.print(" brain");
    Thread.sleep(750);
    System.out.print(" damage");
    Thread.sleep(750);
    System.out.print(" may");
    Thread.sleep(750);
    System.out.print(" have");
    Thread.sleep(750);
    System.out.print(" occured");
    Thread.sleep(750);
    System.out.print(" during");
    Thread.sleep(750);
    System.out.print(" this");
    Thread.sleep(750);
    System.out.print(" time...");
    Thread.sleep(2250);
    System.out.print("please");
    Thread.sleep(750);
    System.out.print(" answer");
    Thread.sleep(750);
    System.out.print(" a");
    Thread.sleep(750);
    System.out.print(" few");
    Thread.sleep(750);
    System.out.print(" questions");
    Thread.sleep(750);
    System.out.print(" to");
    Thread.sleep(750);
    System.out.print(" evaluate");
    Thread.sleep(750);
    System.out.print(" cerebral");
    Thread.sleep(750);
    System.out.print(" function\"");
    Thread.sleep(2000);
   
    System.out.print("\n\n\"What");
    Thread.sleep(750);
    System.out.print(" is");
    Thread.sleep(750);
    System.out.print(" your");
    Thread.sleep(750);
    System.out.println(" name?\"");
    Thread.sleep(2000);
    
    name = input.next();
    
    System.out.print("\n\"Hello ");
    Thread.sleep(750);
    System.out.print( name );
    Thread.sleep(750);
    System.out.print(", it");
    Thread.sleep(750);
    System.out.print(" is");
    Thread.sleep(750);
    System.out.print(" nice");
    Thread.sleep(750);
    System.out.print(" to");
    Thread.sleep(750);
    System.out.print(" meet");
    Thread.sleep(750);
    System.out.print(" you\"");
    Thread.sleep(2000);
   
    System.out.print("\n\n\"What");
    Thread.sleep(750);
    System.out.print(" is");
    Thread.sleep(750);
    System.out.print(" the");
    Thread.sleep(750);
    System.out.print(" name");
    Thread.sleep(750);
    System.out.print(" of");
    Thread.sleep(750);
    System.out.print(" the");
    Thread.sleep(750);
    System.out.print(" city");
    Thread.sleep(750);
    System.out.print(" where");
    Thread.sleep(750);
    System.out.print(" you");
    Thread.sleep(750);
    System.out.print(" were");
    Thread.sleep(750);
    System.out.println(" born?\"");
    Thread.sleep(2000);
    
    
    city = input.next();
    
    System.out.println("\n\"No kidding, my programmer is from " + city + "\"");

    System.out.println("\n\"Now, how old are you?\"");
    
    age = input.nextInt();
    
    System.out.println("Wow, you look great for someone who is " + age + " years old!");
    
    System.out.println("Well, thank you " + name + " for using this Bio Pod...your brain seems just fine. Good luck and welcome to the other side of space.");
   
                                             
  }
public static void printWithDelays(String data, TimeUnit unit, long delay)
        throws InterruptedException {
    for (char ch:data.toCharArray()) {
        System.out.print(ch);
        unit.sleep(delay);
    }
}
}

