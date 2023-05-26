package LabExe2;

import java.util.Scanner;
import java.util.Random;

public class twopointfour {

  public static void main(String[] args) {
	  
    try {

      Scanner s = new Scanner(System.in);
      Random n = new Random();

      int number = n.nextInt(100), input;
      boolean guessed = false;

      while (guessed == false) {

        System.out.print("Enter your guess number: ");
        input = s.nextInt();

        if (input == number) {
          System.out.println("You guessed the correct number");
          System.out.println("Thank you");
          guessed = true;

        } else if (input < number) {
          System.out.println("Your number is lower than the number. Guess again!");

        } else if (input > number) {
          System.out.println("Your number is higher than the number. Guess again!");
        }
      }
      
    } catch (Exception e) {
    	System.out.println("ERROR!");
    }

  }

}