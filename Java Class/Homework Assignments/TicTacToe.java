/*
  Author: <Insert your name>
  
  Lab 21: Complete implementation for each function 
    to complete this Tic Tac Toe game!
  
*/

import java.util.*;

public class TicTacToe{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                          };
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    
    System.out.println("Let's play Tic Tac Toe!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2 for col");
      col = input.nextInt();
      move(row, col);
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
    System.out.println("-------------");
    
    for(int i = 0; i < 3; i++){
      System.out.print("| ");
      for(int j = 0; j < 3; j++){
        System.out.print(board[i][j] + " | ");
      }//end of for(int = j) loop
      System.out.println();
      System.out.println("-------------");
    }//end of for(int = i) loop
  }//end of printBoard
  
  public static void changeXO(){
    if(xo == 'x'){
        xo = 'o';
    }//end of if statement
    else{
        xo = 'x';
    }//end of else statement
  }//end of changeXO
  
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  public static void move(int row, int col){
    if((row >= 0) && (row < 3)){
      if((col >= 0) && (col < 3)){
        if(board[row][col] == ' '){
          board[row][col] = xo;
        }//end of if(board) statement
        else{
          System.out.println("Sorry, there is already a mark there, try again " + xo + "\n");
          changeXO();
        }//end of else statement
      }//end of if((col)) statement
      else 
        System.out.println("Sorry, you've entered and invalid option.  Please chooose again player " + xo + "\n");
        changeXO();
    }//end of if((row)) statement
    else 
      System.out.println("Sorry, you've entered and invalid option.  Please chooose again player " + xo + "\n");
      changeXO();
  }//end of move method
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  public static boolean checkWinner(){
    int counter = 0;
    for(int i = 0; i < 3; i++){
      if(board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board [2][i]){
        printBoard();
        changeXO();
        System.out.println("Congradulations! " + xo + " is the winner!\n");
        return true;
      }
      else if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]){
        printBoard();
        changeXO();
        System.out.println("Congradulations! " + xo + " is the winner!\n");
        return true;
      }
      else if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]){
        printBoard();
        changeXO();
        System.out.println("Congradulations! " + xo + " is the winner!\n");
        return true;
      }
      else if(board[0][2] != ' ' && board[0][2] == board[1][1] && board [0][2] == board[2][0]){
        printBoard();
        changeXO();
        System.out.println("Congradulations! " + xo + " is the winner!\n");
        return true;
      }
      for(int j = 0; j < 3; j++){
        if(board[i][j] != ' '){
          counter++;
          if(counter > 8){
            printBoard();
            System.out.println("There are no more moves left, the game is a draw.\n");
            return true;
               
          }
        }
      }
     
        
    }
    return false;
    
  }//end of checkWinner
  
  
}//end class