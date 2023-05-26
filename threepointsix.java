package LabExe3;

import java.util.Scanner;

public class threepointsix {

  public static void main(String[] args) {
    char ans = 'y';

    try {
      do {
        Scanner s = new Scanner(System.in);

        // variables
        int[] score = new int[10];
        int index = 0;
        double sum = 0, average = 0;

        // ask user for inputs & computes sum
        for (index = 0; index < score.length; index++) {
          System.out.print("Enter Number " + (index + 1) + ": ");
          score[index] = s.nextInt();
          sum = sum + score[index];
        }
        //computes average
        average = sum / score.length;
        System.out.println("\nThe average is: " + average);

        //display number that are > average	
        System.out.println("\nThose numbers above the average: ");
        for (index = 0; index < score.length; index++) {

          if (score[index] > average) {
            System.out.print(score[index] + " ");
          }
        }
        //display number that are < average	
        System.out.println("\nThose numbers below the average: ");
        for (index = 0; index < score.length; index++) {
          if (score[index] < average) {
            System.out.print(score[index] + " ");
          }
        }

        System.out.println("\nTry Again? [Y/N] ");

        ans = s.next().charAt(0);
      } while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {
      System.out.println("ERROR!");
    }
  }

}