package LabExe2;

import java.util.Scanner;

public class twopointeightpointone {

  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(System.in);

      System.out.print("Enter the value of n: ");

      int n = s.nextInt();
      int i, j;

      for (i = n; i >= 1; i--) {
        for (j = 1; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println("ERROR!");
    }
  }
}