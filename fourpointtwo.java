package LabExe4;

import java.util.Scanner;

public class fourpointtwo {

  public static void main(String[] args) {
try {
	
    Scanner s = new Scanner(System.in);
    //array declaration and instantiation
    int array_Size;
    char ans = 'y';
    int index = 0;

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
    int ctr = 0;
    int key = 0;
    int idx = -1;

    //display the elements of array
    for (int item: score) {
      System.out.print(item + " ");
    }
    System.out.println();
    //input key to be search
      System.out.print("Enter key to be search: ");
      key = s.nextInt();
      //search the key on the array
      for (ctr = 0; ctr < score.length; ctr++) {
        if (score[ctr] == key) {
          idx = ctr;
          break;
        }
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