/*
  Steven Lemos
  Co Sci 290
  Lab 15
  
  5.13  Find the largest n such that n^3 < 12,000.
  Use a while loop to find the largest interger n such that n^3 is less than 12,000.
  
*/
//begin program
public class Lab15{
  //start of main method
  public static void main(String[]args){
    
    //declare variables
    int n = 0;
    
    //use while loop to find largest n where n^3 is less than 12,000
    while((n*n*n) < 12000){
      
      //increase the value of n each time loop is run
      n++;
    }//end of while loop
    
    //output the largest n value that the loop created
    System.out.println("The largest n value possible is " + n);
    
  }//end of maint method

}//end of program