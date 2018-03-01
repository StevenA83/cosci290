/*
  Steven Lemos
  CoSci 290
    
  Demo topics on:
    -incriment/decrement operators
    -augmented assignments operators
    -basic if/else block

*/

public class DemoBoolean{
  public static void main(String[] args) {
    
    int num = 1;
    num = num + 1;  //Increment num by 1
    num++;  //This is called a post increment as does the same as the previous line
    ++num; //This is called a pre increment
    
    num = 1;
    int count = ++num;
    System.out.println("count " + count + " num " + num);
    count = num++;
    System.out.println("count " + count + " num " + num);
    
    count = num--;  //Post-decrement
    count = --num;  //Pre-decrement
    //examples of augmented assignement operators
    num += 2; //equivalent to => num = num + 2
    num *= 2; //num = num * 2
    num /= 2; //num = num / 2
    num -= 2; //num = num - 2
    
    num = 2;
    double num2 = 3.0;
    System.out.println(num * num2); //When a double is mulitplied by a interger, the answer become is output as a double
    System.out.println((int) num2); //lose the decimal
    System.out.println((double) num); //turns 2 into 2.0
    System.out.println("Casting a char to an int " + (int) 'c');  //outputs the number 99 based on ASCII table c=99
    
    int numberOfZombies = 3;
    int actualNumOfZombies = 100;
    
    if(numberOfZombies == actualNumOfZombies){ 
      System.out.println("You might survive this apocalypse.");
    }
    else{
      System.out.println("You might NOT survive this apocalypse.");
    }
    
    //Generate a random number
    System.out.println(Math.random());
    
    // minmum + Math.random() * maximum
    // formula for any range is: Min + (Math.random() * (Max - Min))
    System.out.println(1 + (int)(Math.random() * 10));
    
  }
  
}