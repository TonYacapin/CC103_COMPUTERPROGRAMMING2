package LabExe5;

import java.util.Scanner;

public class fivepointone {

  public static void main(String[] args) {
    try {
      char ans = 'y';
      do {
        Scanner s = new Scanner(System.in);

        int index = 0, j, current;

        int[] arr = new int[10];

        System.out.println("Enter a number between 0 and 99.");
        for (index = 0; index < arr.length; index++) {
          System.out.println("Enter number " + (index + 1) + ": ");
          arr[index] = s.nextInt();

          if (arr[index] > 99 || arr[index] < 0 ) {
            System.out.println("The number is out of range.");
            index--;
          }
        }

        System.out.println("Ascending: ");

        for (index = 1; index < arr.length; index++) {
          current = arr[index]; //The current variable is the current value being sorted
          j = index - 1; //shift the position of the current variable towards the left 

          while (j >= 0 && arr[j] > current) {
            arr[j + 1] = arr[j];
            j = j - 1;

          }
          arr[j + 1] = current;
        }
        for (int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");

        System.out.println();

        System.out.println("Decending: ");

        for (index = 1; index < arr.length; index++) {
          current = arr[index]; //The current variable is the current value being sorted
          j = index - 1; //shift the position of the current variable towards the left 

          while (j >= 0 && arr[j] < current) {
            arr[j + 1] = arr[j];
            j = j - 1;

          }
          arr[j + 1] = current;
        }
        for (int i = 0; i < arr.length; i++)
          System.out.print(arr[i] + " ");

        System.out.println();

        System.out.println("\nTry Again? [Y/N] ");

        ans = s.next().charAt(0);
      } while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {
      System.out.println("ERROR!");
    }
  }
}