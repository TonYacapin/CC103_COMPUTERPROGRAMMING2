package LabExe8;

import java.util.Scanner;

public class LabExe8_2 {

  static boolean hasScore = false; static double score = 0;
  static Scanner dataIn = new Scanner(System.in); static double grade = 0;

  public static void main(String[] args) {
    //ask user for score & validates if the value is valid
    getScore();
    //computes grade 
    getGrade(score);
    //print grade
    printGrade(grade);
  }

  public static void getScore() {
    if (hasScore == false) {
      System.out.print("Valid score is from 0 to 100 only \nInput course score: ");
      score = dataIn.nextInt();
      validateScore(score);
    }
  }

  public static void validateScore(double score) {
    if (score <= 100 && score >= 0) {
      hasScore = true;
    } else {
      System.out.println("Invalid value");
      getScore();
    }
  }

  public static double getGrade(double score) {
    grade = (((score / 100) * 60) + 40);
    return grade;
  }

  public static void printGrade(double grade) {
    System.out.println("\nYour course grade is: " + grade);
  }
  
}