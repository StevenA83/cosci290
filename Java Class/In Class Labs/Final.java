/*
  Author: Steven Lemos
  
  Lab 22: Modify the Tic Tac Toe program to a 6 x 6 character array
    that now functions as a game of Connect 4!
  
*/

import java.util.*;

public class Final{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' ',' ',' ',' '},
                            {' ', ' ', ' ',' ',' ',' '},
                            {' ', ' ', ' ',' ',' ',' '},
                            {' ', ' ', ' ',' ',' ',' '},
                            {' ', ' ', ' ',' ',' ',' '},
                            {' ', ' ', ' ',' ',' ',' '},
                          };
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    
    System.out.println("Connect 4!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2, 3, 4, 5 for a column");
      //row = input.nextInt();
      //System.out.println("Please enter 0, 1, 2, 3, 4, 5 for a col");
      col = input.nextInt();
      move(col);
      changeXO();
      if(checkWinner()){
        gameOver = true;
      }//end of if(checkWinner) statement    
      
    }//end of while(!gameOver) loop
    
  }//end of main method
  
  /*
    This method prints the Tic Tac Toe board
    with updated moves by players.
  */
  public static void printBoard(){
    //print the grid used for the game board
    System.out.println("-------------------------");
    
    for(int i = 0; i < 6; i++){
      System.out.print("| ");
      for(int j = 0; j < 6; j++){
        System.out.print(board[i][j] + " | ");
      }//end of for(int i = 0; i < 6; i++) loop
      System.out.println();
      System.out.println("-------------------------");
    }//end of for(int j = 0; j < 6; j++) loop
  }//end of printBoard funciton
  
  public static void changeXO(){
    if(xo == 'x'){
        xo = 'o';
    }//end of if(xo == 'x') statement
    else{
        xo = 'x';
    }//end of else statement
  }//end of changeXO function
  
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  public static void move(int col){
    if((col >= 0) && (col < 6)){
      try{ //try allows the program to attempt something that may produce an error without crashing the program
        for(int i = 5; i > -1; i--){
          if(board[i][col] == ' '){
            board[i][col] = xo;
            break;
          }
          else if(board[i-1][col] == ' '){
            board[i-1][col] = xo;
            break;
          }
          else if(board[i-2][col] == ' '){
            board[i-2][col] = xo;
            break;
          }
          else if(board[i-3][col] == ' '){
            board[i-3][col] = xo;
            break;
          }
          else if(board[i-4][col] == ' '){
            board[i-4][col] = xo;
            break;
          }
          else if(board[i-5][col] == ' '){
            board[i-5][col] = xo;
            break;
          }
          else{
          }
        } 
      }//end of the try statement
      catch(Exception ArrayIndexOutOfBoundsException){ //catch allows to prevent a program crash due to an expected error
        System.out.println("Sorry, there are no more free spaces there, try another column " + xo + "\n");
        changeXO();
      }//end of the catch statment
    }//end of if((row)) statement
    else{ 
      System.out.println("Sorry, you've entered and invalid option.  Please chooose again player " + xo + "\n");
      changeXO();
    }
  }//end of move method
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  public static boolean checkWinner(){
    int counter = 0;
    for(int i = 0; i < 6; i++){
      //check up and down the colums for 4 in a row
      if(board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board [2][i] && board[0][i] == board[3][i] ||
         board[1][i] != ' ' && board[1][i] == board[2][i] && board[1][i] == board [3][i] && board[1][i] == board[4][i] ||
         board[2][i] != ' ' && board[2][i] == board[3][i] && board[2][i] == board [4][i] && board[2][i] == board[5][i]){
        printBoard();
        changeXO();
        System.out.println("Congradulations! " + xo + " is the winner!\n");
        return true;
      }//end of if statement checking up and down colums for 4 in a row
      //check across the rows for 4 in a row
      else if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == board [i][3] ||
              board[i][1] != ' ' && board[i][1] == board[i][2] && board[i][1] == board[i][3] && board[i][1] == board [i][4] ||
              board[i][2] != ' ' && board[i][2] == board[i][3] && board[i][2] == board[i][4] && board[i][2] == board [i][5]){
        printBoard();
        changeXO();
        System.out.println("Congradulations! " + xo + " is the winner!\n");
        return true;
      }//end of if statement checking rows for 4 in a row
      //check diagonals from top-left to bottom-right for 4 in a row
      else if(board[2][0] != ' ' && board[2][0] == board[3][1] && board[2][0] == board[4][2] && board[2][0] == board[5][3] ||
              board[1][0] != ' ' && board[1][0] == board[2][1] && board[1][0] == board[3][2] && board[1][0] == board[4][3] ||
              board[2][1] != ' ' && board[2][1] == board[3][2] && board[2][1] == board[4][3] && board[2][1] == board[5][4] ||
              board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == board[3][3] ||
              board[1][1] != ' ' && board[1][1] == board[2][2] && board[1][1] == board[3][3] && board[1][1] == board[4][4] ||
              board[2][2] != ' ' && board[2][2] == board[3][3] && board[2][2] == board[4][4] && board[2][2] == board[5][5] ||
              board[0][1] != ' ' && board[0][1] == board[1][2] && board[0][1] == board[2][3] && board[0][1] == board[3][4] ||
              board[1][2] != ' ' && board[1][2] == board[2][3] && board[1][2] == board[3][4] && board[1][2] == board[4][5] ||
              board[0][2] != ' ' && board[0][2] == board[1][3] && board[0][2] == board[2][4] && board[0][2] == board[3][5]){
        printBoard();
        changeXO();
        System.out.println("Congradulations! " + xo + " is the winner!\n");
        return true;
      }//end of if statement checking diagonals from top-left to bottom-right for 4 in a row
      //check diagonals from bottom-left to top-right for 4 in a row
      else if(board[3][0] != ' ' && board[3][0] == board[2][1] && board [3][0] == board[1][2] && board [3][0] == board[0][3] ||
              board[4][0] != ' ' && board[4][0] == board[3][1] && board [4][0] == board[2][2] && board [4][0] == board[1][3] ||
              board[3][1] != ' ' && board[3][1] == board[2][2] && board [3][1] == board[1][3] && board [4][0] == board[0][4] ||
              board[5][0] != ' ' && board[5][0] == board[4][1] && board [5][0] == board[3][2] && board [5][0] == board[2][3] ||
              board[4][1] != ' ' && board[4][1] == board[3][2] && board [4][1] == board[2][3] && board [4][1] == board[1][4] ||
              board[3][2] != ' ' && board[3][2] == board[2][3] && board [3][2] == board[1][4] && board [3][2] == board[0][5] ||
              board[5][1] != ' ' && board[5][1] == board[4][2] && board [5][1] == board[3][3] && board [5][1] == board[2][4] ||
              board[4][2] != ' ' && board[4][2] == board[3][3] && board [4][2] == board[2][4] && board [4][2] == board[1][5] ||
              board[5][2] != ' ' && board[5][2] == board[4][3] && board [5][2] == board[3][4] && board [5][2] == board[2][5]){
        printBoard();
        changeXO();
        System.out.println("Congradulations! " + xo + " is the winner!\n");
        return true;
      }//end of if statement checking diagonals from bottom-left to top-right for 4 in a row
      //check to see if all spaces have been played
      for(int j = 0; j < 6; j++){
        if(board[i][j] != ' '){
          counter++;
          //if all spaces played and no winner the game is a draw
          if(counter > 35){
            printBoard();
            System.out.println("There are no more moves left, the game is a draw.\n");
            return true;
               
          }//end of if(counter > 35) statement
        }//end of if(board[i][j] != ' ') statement
      }//end of for(int j = 0; j < 6; j++) loop
     
        
    }//end of for(int i = 0; i < 6; i++) loop
    return false;
    
  }//end of checkWinner
  
  
}//end class