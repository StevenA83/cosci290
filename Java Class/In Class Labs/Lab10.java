/*
  Steven Lemos
  Co Sci 290
  Lab 10
  Part 1
    6.8 (Conversions between Celsius and Fahrenheit) Write a class that contains the following two methods:
        
        Convert from Celsius to Fahrenheit 
        public static double celsiusToFahrenheit(double celsius)
        
        Convert from Fahrenheit to Celsius 
        public static double fahrenheitToCelsius(double fahrenheit)
        
        The formula for the conversion is: fahrenheit = (9.0 / 5) * celsius + 32 
          

  Part 2 
    5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are separated by exactly one space.
  
  */
import java.util.Scanner;  

  public class Lab10{
    
    //Main method
    public static void main(String[]args){
      
      //declare variables for celsius and fahrenheit
      double celsius = 40.0;
      double fahrenheit = 120.0;
      
      
      //begin output of tabel
      System.out.println("Celsius\t\tFahrenheit\t|\t\tFahrenheit\t\tCelsius\n"
                        +"-------------------------------------------------");
      
      //loop to print the values
      for(int index = 0; index < 10; index++){
        
        //print the values in table format
        System.out.println(celsius + "\t\t" + celsiusToFahrenheit(celsius) + "\t\t|\t\t" + fahrenheit + "\t\t"+ fahrenheitToCelsius(fahrenheit));
        
        //subtract 1 from celsius each time the loop runs
        celsius -= 1;
        
        //subtract 10 from fahrenheit each time the loop runs
        fahrenheit  -=  10;
        
      }//end of for loop
    }//end of Main method
    
      //Convert Celsius to Fahrenheit  
      public static double celsiusToFahrenheit(double celsius){
        
        //declare variable for converted temperature
        double convertedTemperature = ((9.0 / 5) * celsius + 32);
        
        //return value of converted temperature
        return convertedTemperature;
              
      }//end of celsiusToFahrenheit method
    
    //Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit){
      
      //declare variable for converted temperature
        double convertedTemperature = ((5.0 / 9) * (fahrenheit - 32));
        
        //return value of converted temperature
        return convertedTemperature; 
    }//end of fahrenheitToCelsius method
  }//end of program
