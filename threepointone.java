package LabExe3;

import java.util.Scanner;

public class threepointone {

  public static void main(String[] args) {
try {
		    Scanner s = new Scanner(System.in);

    int[] score = new int[5];

    System.out.print("Enter Element 1: ");
    score[0] = s.nextInt();
    System.out.print("Enter Element 2: ");
    score[1] = s.nextInt();
    System.out.print("Enter Element 3: ");
    score[2] = s.nextInt();
    System.out.print("Enter Element 4: ");
    score[3] = s.nextInt();
    System.out.print("Enter Element 5: ");
    score[4] = s.nextInt();

    System.out.print("The Scores are: ");
    System.out.print(score[0] + " " + score[1] + " " + score[2] + 
    		" " + score[3] + " " + score[4]);

  
	} catch (Exception e) {
		System.out.println("ERROR");
	}

}
}