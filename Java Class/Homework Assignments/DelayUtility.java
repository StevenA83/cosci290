/*
  
    Author: Steven Lemos
    
    This Utility Class houses all the custom methods that
    support my text adventure.support
    
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class DelayUtility{
  /*
    This methond oens a file and prints out each line.
  */
  public void readFile(String filename) throws Exception {
    
    String currentLine; //hold the current line being read in file
    
    //trying to open a file to read
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      //read each line in the file until the EOF
      while((currentLine = br.readLine()) != null){
        printWithDelays(currentLine + "\n\n", TimeUnit.MILLISECONDS, 75);
        Thread.sleep(1500);
        
      } 
     //if there is no file to open, the exception will be caught 
    }catch(IOException e){
      e.printStackTrace();
    }
  }
  
  //part of the program that allows the display of text letter by letter
  public static void printWithDelays(String data, TimeUnit unit, long delay)
          throws InterruptedException {
      for (char ch:data.toCharArray()) {
          System.out.print(ch);
          unit.sleep(delay);
      }//end of for loop
  }//end of printWithDelays method
}//end class