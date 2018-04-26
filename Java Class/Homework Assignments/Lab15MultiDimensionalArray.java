/*
  Steven Lemos
  Co Sci 290
*/

public class Lab15MultiDimensionalArray{
  public static void main(String[] args){
    
    //create a map with different objects in it the array
    //create a 5x5 ar
    //assign numbers to each index
    //print out the values with a loop
    
    //create 5x5 array
    int [] [] map = new int [5] [5];
    int i = 1;
    //assign numbers to array
    for(int x = 0; x < 5; x++){ //cycles through one dimension
      
      for(int y = 0; y < 5; y++){ //cycles through second dimension
        map [x] [y] = i;
        i++;
      }
      
    }
    
    //print out array
    for(int x = 0; x < 5; x++){ //cycles through one dimension
      
      for(int y = 0; y < 5; y++){ //cycles through second dimension
        System.out.print(map [x] [y] + "\t");
      }
      System.out.println(" ");
    }
    
    
    
  }

  
}