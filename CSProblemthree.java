package CaseStudy;

import java.util.Scanner;

public class CSProblemthree {
  public static void main(String[] args) {
    try {
      char ans = 'y';
      do {
        Scanner s = new Scanner(System.in);

        int index_size, index;
        System.out.println("Coded by: Angel Hamelton O. Yacapin");
        System.out.print("\nEnter a number (Array size): ");
        index_size = s.nextInt();

        int[] arr = new int[index_size];

        System.out.println("Enter a number between 0 and 9.");
        for (index = 0; index < arr.length; index++) {
          System.out.print("Enter digit " + (index + 1) + " : ");
          arr[index] = s.nextInt();

          if (arr[index] > 9 || arr[index] < 0) {
            System.out.println("The number is out of range.");
            index--;
          }
        }
        for (index = 0; index <= 9; index++) {
          System.out.print(0 + index + " ");
          for (int i = 0; i < arr.length; i++) {
            if (index == arr[i]) {
              System.out.print("*");
            }
          }
          System.out.println();
        }
        System.out.println("\nTry Again? [Y/N] ");

        ans = s.next().charAt(0);
      } while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {
      System.out.println("ERROR!");
    }
  }
}