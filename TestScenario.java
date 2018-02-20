import java.util.Scanner;  //This is a Java object that allows you to take user input
import java.util.concurrent.TimeUnit;

public class TestScenario{

  public static void main(String[] args) throws Exception {
  
    
    System.out.println("As you walk towards the emergency exit door year hear more explosions and the hallway shakes and shutters.");
    Thread.sleep(7000);
    
    System.out.println("You begin running and reach the door.");
    Thread.sleep(7000);
    
    int doorOdds = (1 + (int)(Math.random() * 10));
    int strength = (1 + (int)(Math.random() * 10));
    
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
      Thread.sleep(7000);
      System.out.println("You hear the loudest explosion yet, then suddenly you hear nothing at all.");
      Thread.sleep(5000);
      System.out.println("You hallway has been ripped in half and you have been sucked into the vacum of space.");
      Thread.sleep(3000);   
      
    }
    
    else if (doorOdds >4 && doorOdds <= 8){
      System.out.println("The door opens slightly, but not wide enough to move through it.");
      Thread.sleep(5000);
      System.out.println("You take a breath and gather all your strength and try to shove open the door.");
      Thread.sleep(5000);
      
      if(strength < 4){
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
        Thread.sleep(7000);
        System.out.println("You hear the loudest explosion yet, then suddenly you hear nothing at all.");
        Thread.sleep(5000);
        System.out.println("You hallway has been ripped in half and you have been sucked into the vacum of space.");
        Thread.sleep(3000);   
      }
      
      else{
        System.out.println("You strain and struggle and nearly pop your fingers out of joint, but the door finally opens and you walk through it.");
        Thread.sleep(5000);
        System.out.println("The room beyond the door contains the escape pods you have been looking for.");
        Thread.sleep(5000);
        System.out.println("You hope into an escape pod and fly away to safety.");
        Thread.sleep(5000);
      }
      
    }
    else{
       System.out.println("The door opens.");
       Thread.sleep(3000);
       System.out.println("The room beyond the door is well lit and a there is some sort of sign on the wall.");
       Thread.sleep(5000);
       System.out.println("You step closer to the sign and read 'Escape Pods Ahead.");
       Thread.sleep(5000);
       System.out.println("You hope into an escape pod and fly away to safety.");
       Thread.sleep(5000);
       
     }
    
  }
}