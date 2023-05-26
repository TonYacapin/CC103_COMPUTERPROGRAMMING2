package LabExe6;

import java.util.Scanner;

public class sixpointtwo {

   public static void main(String[] args) {

  try {
		    Scanner s = new Scanner(System.in);

      int[][] score = new int[3][3];
      double[] avg = new double[3];
      String[] names = {
         "Tom, Mcky",
         "Tom, Mcdher",
         "Chiz, Moza"
      };

      int row = 0, col = 0;
      double sum = 0;
      	//ask input
      for (row = 0; row < 3; row++) {

         for (col = 0; col < 3; col++) {

            System.out.print("Enter Grade of " + names[row] + " for the 1st to 3rd grading");
            score[row][col] = s.nextInt();
         }
      }
      	//formula for avg
      for (row = 0; row < 3; row++) {
         for (col = 0; col < 3; col++) {
            sum = sum + score[row][col];
         }
         avg[row] = sum / 3;
         sum = 0;
      }
      	// print out 
      System.out.println("\n \t\t1\t2\t3 \tAverage");

      for (row = 0; row < 3; row++) {
         System.out.print(names[row] + " \t");
         for (col = 0; col < 3; col++) {
            System.out.print(score[row][col] + " \t");

         }
         System.out.printf("%5.2f%n", avg[row]);

      }

   
	} catch (Exception e) {
	System.out.println("ERROR!");
	}

}
}