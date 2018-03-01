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
  
  //Application starts here
  public static void main(String[] args) throws Exception {  //The throws Exception will allow Thread.sleep() to pause text display
    
    String name = "Bob";
    String city = "Nowhere";
    int age = 0;
    int workOutDays = 0;
    int doorOdds = (1 + (int)(Math.random() * 10));  //This creates a random number between 1 and 10 and assigns it to variable called doorOdds
    int adrenaline = (1 + (int)(Math.random() * 10));
  
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("  ____  __    __   ____  __  _    ___  ____\n"  +
                       " /    ||  |__|  | /    ||  |/ ]  /  _]|    \\ \n" +
                      "|  o  ||  |  |  ||  o  ||  ' /  /  [_ |  _  | \n" +
                      "|     ||  |  |  ||     ||    \\ |    _]|  |  | \n" +
                      "|  _  ||  `  '  ||  _  ||     \\|   [_ |  |  |\n" +
                      "|  |  | \\      / |  |  ||  .  ||     ||  |  |\n" +
                      "|__|__|  \\_/\\_/  |__|__||__|\\_||_____||__|__|\n");
    
    //The story starts here
    Thread.sleep(3000);  //Thread.sleep pauses the program before it moves on to the next line
    System.out.println("\n\n\nYou awaken from what feels like a long deep sleep and find yourself laying down in some sort of light blue bed.");
    Thread.sleep(5000);
    
    System.out.println("However, the bed is not a normal bed.");
    Thread.sleep(3000);
    
    System.out.println("It is emitting a soft glow and is enclosed by a sloping, circular wall.");
    Thread.sleep(5000);
    
    System.out.println("It's almost like the bed is inside a giant egg.");
    Thread.sleep(5000);
    
    System.out.println("A semi transparent screen flickers to life in front of your face and words begins scrolling across it. \n");
    Thread.sleep(5000);
    
    
    //Scrolling text printing begins here to mimic what reader sees on screen
    //The String text will be displayed letter by letter with a 75 millisecond pause between each letter
    printWithDelays("\"Bio-Pod emergency start up sequence intitalizing...\"", TimeUnit.MILLISECONDS, 75);  
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Calibrating life support systems...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Monitoring emergency power transfer modules...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Start up sequence complete...", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("Evaluating user vital signs\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Vital signs holding steady...Initializing user interface\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
   
    System.out.print("\n\nYou hear a crackling noise and a computerized voice speaks.");
    Thread.sleep(5000);
    
    
    //Computer voice is displayed as text that is displayed letter by letter 
    printWithDelays("\n\n\"Good morning and congratulations!\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"You have been successfully revived\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Thank you for using Life-o-Matic's Cryogenic Bio-Pod Hibernation System\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"You have been in suspended animation for ", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(750);
    System.out.print("1");
    Thread.sleep(750);
    System.out.print("0");
    Thread.sleep(750);
    System.out.print("0");
    Thread.sleep(750);
    System.out.print("0");
    Thread.sleep(750);
    System.out.print(" years\"");
    Thread.sleep(2000);
    
    printWithDelays("\n\n\"You may have experienced some 'slight' brain damage during the emergency revival cycle...\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
   
    printWithDelays("\n\n\"Please answer a few questions to determine cerebral functionality\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    //This is a promt asking the user's first name
    printWithDelays("\n\n\"What is your first name?\"\n\n", TimeUnit.MILLISECONDS, 75); 
    Thread.sleep(1500);
    
    //This is where the user enters  for thier first name the program to use
    name = input.next();  
    
    printWithDelays("\n\"Hello " + name + " it is a pleasure to meet you\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    //Promt asking the user to input the name of their birthplace
    printWithDelays("\n\n\"What is the name of the city where you were born?\"\n\n", TimeUnit.MILLISECONDS, 75);
       
    //Here the user enters the name of thier birthplace for the program to use
    city = input.next();  
    
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
    
    printWithDelays("\n\n\"Thank you for using Life-o-Matic's Cryogenic Bio-Pod Hibernation System and have a nice day\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    
    //Exiting the pod and entering the room
    System.out.println("\n\nYou hear a click and a hiss, the pod door slowly opens and you step out of it into a dimly lit room.");
    Thread.sleep(5000);
    
    System.out.println("It looks like a small futuristic hotel room, with recessed lights on the ceiling, a small desk the Bio-Pod bolted to one wall.");
    Thread.sleep(5000);
    
    System.out.println("All the room's surfaces gleam like they're made of soft shiny metal.");
    Thread.sleep(5000);
    
    System.out.println("As you continue to look around the room, you hear a series of muffeled echoing explosions.");
    Thread.sleep(5000);
    
    System.out.println("The room shakes violently and you fall to the floor just as the lights go out and room is plunged into darkness.");
    Thread.sleep(5000);
    
    System.out.println("The shaking stops and the room is quiet...the lights flicker on and off.");
    Thread.sleep(5000);
    
    System.out.println("Pulsing red lights turn on over a door you hadn't noticed before and synthesized voice begins speaking.");
    Thread.sleep(5000);
    
    //Computerized emergency alert message starts here
    printWithDelays("\n\n\"This is a ship wide emergency alert, this is not a drill\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Please proceed to the nearest emergency escape pod\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"The 'Starship Lusitania' has been stuck by cometary debris\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Shields, engines and main power are offline\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"FTL drive core temperatures approaching critical levels\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    printWithDelays("\n\n\"Hull breaches detected on levels 14, 15, 16 and 20\"", TimeUnit.MILLISECONDS, 75);
    Thread.sleep(1500);
    
    System.out.println("\n\nThe voice suddenly cuts out and is replaced by static.");
    Thread.sleep(5000);
    
    //Computer warning finishes and character leaves the room 
    System.out.println("The door with the red lights above it slides slowly open.");
    Thread.sleep(5000);
    
    System.out.println("You pick yourself up from the floor, step throught the door and into a hallway.");
    Thread.sleep(5000); 
    
    System.out.println("The hallway is lit by dim orange lighting.");
    Thread.sleep(5000);
    
    System.out.println("Overly large letters on the wall read 'Level 20--Passenger Corridor'.");
    Thread.sleep(5000);
    
    System.out.println("At the far end of the hallway is a door with the words 'Emergency Exit' glowing on it.");
    Thread.sleep(5000);
    
    System.out.println("As you walk towards the emergency exit door you hear more explosions and the hallway shakes and shutters.");
    Thread.sleep(5000);
    
    System.out.println("You begin running and reach the door.");
    Thread.sleep(5000);
    
    
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
    System.out.println("  ___    __    __  __  ____    _____  _  _  ____  ____ \n" + 
                       " / __)  /__\\  (  \\/  )( ___)  (  _  )( \\/ )( ___)(  _ \\ \n" +
                       "( (_-. /(__)\\  )    (  )__)    )(_)(  \\  /  )__)  )   /  \n" +
                       " \\___/(__)(__)(_/\\/\\_)(____)  (_____)  \\/  (____)(_)\\_)" );
  }
  
//part of the program that allows the display of text letter by letter
public static void printWithDelays(String data, TimeUnit unit, long delay)
        throws InterruptedException {
    for (char ch:data.toCharArray()) {
        System.out.print(ch);
        unit.sleep(delay);
    }
}
}

