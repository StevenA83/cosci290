/*

  Steven Lemos
  CoSci 290
  
  Topics:
    fucntions/methods - what all the different parts are
    -access modifier
    -return type
    -runction name
    -parameters (otional)
    
  */
  
  public class TestFunctions{
    public static void main(String[] args)  {
    
      
      /*
        access modifiers
        
        return types
        -String
        -char
        -boolean
        -void - doesn't return anything
        -also can return different object types
        
        function names
        -follows the same rules as any identifier
        -use the name of the fucntion to call it
        
        function parameters
        -input that the function uses inside somewhere in the funciton body
        -serperate multiple parameters with commas
      */
      
      //testing custom function called findSum()
      System.out.println("The sum of 2 and 3 is: " + findSum(2,3));
      
      //test printHello
      printHello("Steven");
      
    }
    //this function finds the sum of two given numbers
    public static int findSum(int num1, int num2) {
      int sum = num1 + num2;
      return sum;
    }
    
    public static void printHello(String name) {
      System.out.println("Hello " + name);
    }
  }