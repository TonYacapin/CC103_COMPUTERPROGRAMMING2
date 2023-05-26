package CaseStudy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CSProblemone {

	public static void main(String[] args) {
		  try {
		      char ans = 'y';
		      do {
		        Scanner s = new Scanner(System.in);
		        int index = 0;
		        int index_size;
		        System.out.println("Coded by: Angel Hamelton O. Yacapin");
		        System.out.println("\nHow many numbers?");
		        index_size = s.nextInt();
		        Integer[] arr = new Integer[index_size];

		        for (index = 0; index < arr.length; index++) {
		          System.out.println("Enter number " + (index + 1) + ": ");
		          arr[index] = s.nextInt();
		          }
		        
		        Arrays.sort(arr);
		        System.out.println("Minimum:" + arr[0]);
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
		   System.out.println("Maximum:" + arr[0]);
	}
		}