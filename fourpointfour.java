package LabExe4;

import java.util.Scanner;

public class fourpointfour {

  public static void main(String[] args) {
    //array declaration and instantiation
    try {
      Scanner s = new Scanner(System.in);

      int array_Size;
      char ans = 'y';
      int index;

      //Input Array Size
      System.out.print("Enter Array Size: ");
      array_Size = s.nextInt();
      int[] score = new int[array_Size];

      //Input the elements of the array
      for (index = 0; index < score.length; index++) {
    	  System.out.print("Enter Number " + (index + 1) + ": ");
    	  score[index] = s.nextInt();
      }
      System.out.println();
      
      do {
      int key = 0, idx = -1;
      int first = 0, last = score.length - 1, mid = 0;

      //display the elements of array
      for (int item: score) {
        System.out.print(item + " ");
      }
      System.out.println();
      //input key to be search
        System.out.print("Enter key to be search: ");
        key = s.nextInt();
        //search the key on the array
        mid = (first + last) / 2;
        while (first <= last) {
          if (score[mid] < key) {
            first = mid + 1;
          } else if (score[mid] == key) {
            idx = mid;
            break;
          } else {
            last = mid - 1;
          }
          mid = (first + last) / 2;
        }
        //display the appropriate message
        if (idx == -1) {
          System.out.println("Item not found!");
        } else {
          System.out.println("Item FOUND! at index " + idx);
        }

        System.out.println("\nSearch another key? [Y/N] ");

        ans = s.next().charAt(0);
      } while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {
      System.out.println("ERROR!");
    }
  }
}