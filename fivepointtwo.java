package LabExe5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class fivepointtwo {

	public static void main(String[] args) {
		  try {
		      char ans = 'y';
		      do {
		        Scanner s = new Scanner(System.in);
		        int index = 0;
		        Integer[] arr = new Integer[10];

		        System.out.println("Enter a number between 0 and 99.");
		        for (index = 0; index < arr.length; index++) {
		          System.out.println("Enter number " + (index + 1) + ": ");
		          arr[index] = s.nextInt();

		          if (arr[index] > 99 || arr[index] < 0) {
		            System.out.println("The number is out of range.");
		            index--;
		          }
		        }
		        Arrays.sort(arr);
		        System.out.println("Ascending:" + Arrays.toString(arr));
		        reverse(arr); 
		        
		        System.out.println("\nTry Again? [Y/N] ");

		        ans = s.next().charAt(0);
		      } while (ans == 'y' || ans == 'Y');

		    } catch (Exception e) {
		      System.out.println("ERROR!");
		    }
		  }
	private static void reverse(Integer[] arr) {
		   Collections.reverse(Arrays.asList(arr));
		   System.out.println("Decending:" + Arrays.asList(arr));
	}
		}