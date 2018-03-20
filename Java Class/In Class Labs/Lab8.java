/*

  Steven Lemos
  Co Sci 290

  Do problem 6.2 in the book: (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. Use the following method header:
    public static int sumDigits(long n)
    
*/
import java.util.Scanner
public class Lab8{
  
  public static void main(String[]args){
  
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter an integer: ");
    
    int number = input.nextInt();
    
    System.out.print("The sum of the digits is ");
    sumDigits(number);
    
  }

  public static int sumDigits(long n){
  
    int sum = 0;
    
    while (n > 0) {
      sum = sum + n % 10;
      n = n / 10;
    }
  System.out.println(sum);
  }
  
  
}
