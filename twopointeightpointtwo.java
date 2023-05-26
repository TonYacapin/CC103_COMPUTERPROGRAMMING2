package LabExe2;

import java.util.Scanner;

public class twopointeightpointtwo {

  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(System.in);

      System.out.print("Enter the value of n: ");

      int n = s.nextInt();
      int i, j, k;

      for (i = 1; i <= n; ++i) {
        for (j = 1; j < i; ++j) {
          System.out.print(" ");
        }
        for (k = i; k <= n; k++) {
          System.out.print("*");
        }
        System.out.println();
      }

    } catch (Exception e) {
      System.out.println("ERROR!");
    }
  }
}