  /*
  Steven Lemos
  CoSci 290
  
  Homework assignment #1
  
  GameDriver, including a spash screen, story setup, in game questions and random
  elements that are used in if/else statements and a Game Over screen.

*/

import java.util.Scanner;  //This is a Java object that allows you to take user input
import java.util.concurrent.TimeUnit;  //This is a Java object that allows for controlling the 


public class GameDriver{
  
  //Main Method starts here
  public static void main(String[]args) throws Exception {  //The throws Exception will allow Thread.sleep() to pause text display
    
    Utility read = new Utility();
    SplashUtility splash = new SplashUtility();
    DelayUtility readDelay = new DelayUtility();
    TestWriteFile write = new TestWriteFile();
    Lab15MultiDimensionalArray map = new Lab15MultiDimensionalArray();
    String name = "Bob";
    String city = "Nowhere";
    String decesion = "";
    int age = 0;
    int workOutDays = 0;
    int doorOdds = (1 + (int)(Math.random() * 10));  //This creates a random number between 1 and 10 and assigns it to variable called doorOdds
    int adrenaline = (1 + (int)(Math.random() * 10));
  
    
    Scanner input = new Scanner(System.in);
    
    
    
    //Splash screen displayed
    splash.readFile("startSplash.txt");
    Thread.sleep(3000);
    
    //The story starts here
    read.readFile("FirstParagraph.txt");
    
    //Scrolling text printing begins here to mimic what reader sees on screen
    //The String text will be displayed letter by letter with a 75 millisecond pause between each letter
    readDelay.readFile("ComputerTalk1.txt");
    
    System.out.print("You hear a crackling noise and a computerized voice speaks.\n\n");
    Thread.sleep(5000);
    
    
    //Computer voice is displayed as text that is displayed letter by letter 
    readDelay.readFile("ComputerTalk2.txt");
    
    //This is where the user enters  for thier first name the program to use
    name = input.nextLine();
    
    //Create a txt file with the name of the user stored in it
    write.writeFile("userName.txt", name);
    
    printWithDelays("\n\"Hello " + name + " it is a pleasure to meet you\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    //Promt asking the user to input the name of their birthplace
    printWithDelays("\n\n\"What is the name of the city where you were born?\"\n\n", TimeUnit.MILLISECONDS, 75);
       
    //Here the user enters the name of thier birthplace for the program to use
    city = input.nextLine();
    write.writeFile("userCity.txt", city);
    
    printWithDelays("\n\"No kidding, my programmer is from " + city + ", it sure is a small world after all\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);

    //Promt asking user to imput thier age
    printWithDelays("\n\n\"Now, how old are you?\"\n\n", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    age = input.nextInt();
    
    printWithDelays("\n\"Wow, you look great for someone who is " + age + " years old\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    //Promt to ask user to input how often they exercise each week
    printWithDelays("\n\n\"You're doing great, just one more question. How many days a week do you workout?\"\n\n", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    workOutDays = input.nextInt();
    
    printWithDelays("\n\"Hmmm... " + workOutDays + " days a week huh, if you say so\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Thank you for your cooperation...comparing answers to your stored personal file\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Brain function assessment complete\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Good news! You have incurred legaly acceptabe low levels of brain damage\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"The Bio-Pod will now open and you will be free to move about the ship\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Thank you for using Life-o-Matic's Cryogenic Bio-Pod Hibernation System and have a nice day\"\n\n", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    
    //Exiting the pod and entering the room
    read.readFile("SecondParagraph.txt");
      
    //Computerized emergency alert message starts here
    readDelay.readFile("ComputerizedEmergencyAlert.txt");
    
    System.out.println("The voice suddenly cuts out and is replaced by static.");
    Thread.sleep(2000);
    
    System.out.println("The door with the red lights above it slides slowly open.");
    Thread.sleep(2000);
    
    //ask the user if they want to stay in room or leave the room
    /*System.out.println("Do you want to STAY in the room or LEAVE the room?");
    
    decesion = input.nextLine();
    
    if(decesion.equalsIgnoreCase("STAY")){
      read.readFile("stayPut.txt");
      Thread.sleep(2000);
      splash.readFile("GameOverSplash.txt");
      System.exit(1); 
    }
    else{};
    */
    //Computer warning finishes and character leaves the room 
    read.readFile("Hallway.txt");
    
    map;
    
    
    //if - else if - else statement that determines if the emergency escape door opens or not
    if(doorOdds <= 4){
      System.out.println("The door does not open.");
      Thread.sleep(4000);
      System.out.println("There is no handle, or knob, or panel you can see...just the seemingly locked door.");
      Thread.sleep(5000);
      System.out.println("You try hitting the door, then kicking the door.");
      Thread.sleep(5000);
      System.out.println("You try to push it and slide it to one side..then the other.");
      Thread.sleep(5000);        
      System.out.println("You try again and again, but the door simply remains closed.");
      Thread.sleep(5000);
      System.out.println("You scream and shout and curse at the door...but it does not open.");
      Thread.sleep(5000);
      System.out.println("You hear more explosions and the hallway shakes so hard you are thrown to the floor.");
      Thread.sleep(5000);
      System.out.println("You hear the loudest explosion yet, then suddenly you hear nothing at all.");
      Thread.sleep(5000);
      System.out.println("The hallway has been ripped in half and you have been sucked out into the vacuum of space.");
      Thread.sleep(3000);   
      
    }
    
    else if (doorOdds > 4 && doorOdds <= 8){
      System.out.println("The door opens slightly, but not wide enough to move through it.");
      Thread.sleep(5000);
      System.out.println("You take a breath and gather all your strength and try to shove open the door.");
      Thread.sleep(5000);
      
      //if - else if - else statement that determines if adrenaline or workOutDays is high enough to open door
      if(adrenaline < 4 && workOutDays <= 2){
        System.out.println("The door stays the same, you haven't opened it any wider.");
        Thread.sleep(5000);
        System.out.println("You try hitting the door, then kicking the door.");
        Thread.sleep(5000);
        System.out.println("You try to push it and slide it to one side..then the other.");
        Thread.sleep(5000);        
        System.out.println("You try again and again, but the door simply remains closed.");
        Thread.sleep(5000);
        System.out.println("You scream and shout and curse at the door...but it does not open.");
        Thread.sleep(5000);
        System.out.println("You hear more explosions and the hallway shakes so hard you are thrown to the floor.");
        Thread.sleep(5000);
        System.out.println("You hear the loudest explosion yet, then suddenly you hear nothing at all.");
        Thread.sleep(5000);
        System.out.println("You hallway has been ripped in half and you have been sucked into the vacum of space.");
        Thread.sleep(3000);   
      }
      
      else if((adrenaline >= 4 && adrenaline < 9) || (workOutDays > 2 && workOutDays <= 5)){
        System.out.println("You strain and struggle and nearly pop your fingers out of joint, but the door finally opens and you walk through it.");
        Thread.sleep(5000);
        System.out.println("The room beyond the door contains the escape pods you have been looking for.");
        Thread.sleep(5000);
        System.out.println("You hop into an escape pod and fly away to safety.");
        Thread.sleep(5000);
      }
      else{
        System.out.println("You almost tare the door off it's track as you rush into the next room.");
        Thread.sleep(5000);
        System.out.println("The room beyond the door contains the escape pods you have been looking for.");
        Thread.sleep(5000);
        System.out.println("You hop into an escape pod and fly away to safety.");
        Thread.sleep(5000);
      }
      
    }
    else{
       System.out.println("The door opens.");
       Thread.sleep(3000);
       System.out.println("The room beyond the door is well lit and a there is some sort of sign on the wall.");
       Thread.sleep(5000);
       System.out.println("You step closer to the sign and read 'Escape Pods Ahead'.");
       Thread.sleep(5000);
       System.out.println("You hop into an escape pod and fly away to safety.");
       Thread.sleep(5000);
      
     }
    
    //Game over screen
    splash.readFile("GameOverSplash.txt");
  }//end of Main Method
  
  //part of the program that allows the display of text letter by letter
  public static void printWithDelays(String data, TimeUnit unit, long delay)
          throws InterruptedException {
      for (char ch:data.toCharArray()) {
          System.out.print(ch);
          unit.sleep(delay);
      }//end of for loop
  }//end of printWithDelays method
}

