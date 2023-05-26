package LabExe3;

import java.util.Scanner;

public class threepointtwo {

  public static void main(String[] args) {

    try {
      Scanner s = new Scanner(System.in);
      
      int[] score = new int[5];
      int index = 0;

      for (index = 0; index < 5; index++) {
        System.out.print("Enter " + (index + 1) + " element: ");
        score[index] = s.nextInt();
      }
      System.out.print("The scores are: ");
      for (index = 0; index < 5; index++) {
        System.out.print(score[index] + " ");
      }
    } catch (Exception e) {
      System.out.println("ERROR!");
    }

  }

}