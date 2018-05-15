/*
  Author: Steven Lemos
  Purpose: Test 2D arrays
*/

public class Test2DArrays{
  
  //main mehtod
  public static void main(String[]args){
    
    //declare 2D arrays
    String[][] words = new String[3][2];
    /*
      We just created a matrix of 3 rows and 2 columns
      
      {" ", " "}
      {" ", " "}
      {" ", " "}
      
    */
    
    //assign first element in the 2d array
    words[0][0] = "cat";
    
    //get element in 2d array
    //System.out.println(words[0][0]);
    //System.out.println(words[0][1]);
    
    //iterate through array and assign values using loops
    for (int i = 0; i < words.length; i++){ //this goes through each row
      for(int j = 0; j < words[i].length; j++){ //this goes through each column
        words[i][j] = i + j + "cats";
        System.out.println(words[i][j]);
      }  
    }
    
    System.out.println(print2DArray(words));
    
    
  }//end main
  
  //this method concatenates all elements in a 2d arrays
  public static String print2DArray(String[][] array){
    
    //holder for concantenated string
    String concat = "";
    
    //go through elements of 2d array
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
        concat = concat + array[i][j] +  " ";
      }
    }
    return concat;
  }//end of print2DArray method
}//end class