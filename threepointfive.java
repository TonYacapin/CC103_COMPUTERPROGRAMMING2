package LabExe3;

import java.util.Scanner;

public class threepointfive {

  public static void main(String[] args) {
    char ans = 'y';

    try {
      do {
        Scanner s = new Scanner(System.in);

        int[] score = new int[10];
        int index = 0;
        double sum = 0;

        for (index = 0; index < score.length; index++) {
          System.out.print("Enter Number " + (index + 1) + ": ");
          score[index] = s.nextInt();
          sum = sum + score[index];
        }
        System.out.print("\nThe numbers are: ");
        for (index = 0; index < score.length; index++) {
          System.out.print(score[index] + " ");
        }
        System.out.println("\nThe average is: " + sum / score.length);

        System.out.println("\nTry Again? [Y/N] ");

        ans = s.next().charAt(0);
      } while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {
      System.out.println("ERROR!");
    }
  }

}