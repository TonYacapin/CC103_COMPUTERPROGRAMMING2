package LabExe3;

import java.util.Scanner;

public class threepointfour {

  public static void main(String[] args) {
    char ans = 'y';
    
    try {
      do {
        Scanner s = new Scanner(System.in);

        int[] score = new int[10];
        int index = 0;

        for (index = 0; index < score.length; index++) {
          System.out.print("Enter Number " + (index + 1) + ": ");
          score[index] = s.nextInt();
        }
        System.out.print("The numbers are: ");
        for (index = score.length - 1; index >= 0; index--) {
          System.out.print(score[index] + " ");
        }

        System.out.println("\nTry Again? [Y/N] ");

        ans = s.next().charAt(0);
      } while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {
      System.out.println("ERROR!");
    }
  }

}