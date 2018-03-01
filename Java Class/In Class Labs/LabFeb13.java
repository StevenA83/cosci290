/*
  Steven Lemos
  CoSci 290
  
  In class Lab for February 13, 2018
  
  Text game user input test

*/

import java.util.Scanner;  //This is a Java object that allows you to take user input

public class LabFeb13{
  public static void main(String[]args){ //This is starting point of the application
    
    String name = "Steven";
    String city = "Burbank";
    int age = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("You awaken from what feels like a long sleep and find yourself laying down in some sort of light blue enclosed space... \n"
                       + "A semi transparent screen flickers to life in front of your face and words begins scrolling across the screen. \n"
                       + "\"Bio Pod start up sequence intitalized...Calibrating...start up complete.\" \n" 
                       + "\"Checking Bio Pod user vital signs...user vital signs stable...initalizing user interface and memory check\" \n"
                       + "You hear a crackling noise and a computerized voice speaks \n"
                       + "\"Good morning and congradulations on sucessfully using Life-o-matic's Bio Pod Hibernation System\" \n"
                       + "\"You have been in suspended animation for 1-0-0-0 years\" \n"
                       + "\"Some slight brain damage may have occured during this time...please answer a few simple questions to evaluate brain function\" \n"
                       + "\"Please state your name\"");
    
    name = input.next();
    
    System.out.println("Good job, it is nice to meet you " + name);
    
    System.out.println("Now please tell me name of the city where you were born");
    
    city = input.next();
    
    System.out.println("No kidding, my programmer is from " + city);

    System.out.println("Now, how old are you?");
    
    age = input.nextInt();
    
    System.out.println("Wow, you look great for someone who is " + age + " years old!");
    
    System.out.println("Well, thank you " + name + " for using this Bio Pod...your brain seem just fine. Good luck and welcome to the other side of space.");
      
      
      
      
    
    
  }

}
