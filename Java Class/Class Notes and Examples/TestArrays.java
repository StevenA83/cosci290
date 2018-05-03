/*
  Author: Steven Lemos
  Purpose: Play around with arrays
  
*/

public class TestArrays{
  
  //entry point of program
  public static void main(String[]args){
    
    //declare an array
    String[] names = new String[5]; //each thing in the array is called an element with an index value
                                    //that stands for the elements location starting with zero
    
    //assign values to this array
    names[0] = "Steven";
    names[1] = "Chris";
    names[2] = "Hai";
    names[3] = "Gerson";
    names[4] = "Adam";
    
    //update
    names[4] = "Lynn"; //here index 4 has been reassigned from Adam to Lynn
    
    for(int index = 0; index < names.length; index++){
    System.out.println("Element "+ index + ": " + names[index]);
      
    }
  }//end oif main
}//end of class