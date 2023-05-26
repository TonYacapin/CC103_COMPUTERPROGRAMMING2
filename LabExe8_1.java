package LabExe8;

import java.util.Scanner;

public class LabExe8_1 {

  public static void main(String[] args) {
    String message1, message2, result1;
    Scanner s = new Scanner(System.in);

    //method5
    printmessage();
    System.out.println();

    //method4 
    System.out.print("enter name: ");
    message1 = s.next();
    print("Hello " + message1);
    System.out.println();

    //method3
    System.out.print("enter age: ");
    message2 = s.next();
    println("Wow you're " + message2);
    System.out.println();

    //method2
    result1 = "your name is " + message1 + " age " + message2;
    printResult(result1);
    System.out.println();

    //Method1
    getSum(34, 35);

  }
  // user-defined method 1
  public static int getSum(int num1, int num2) {
    int sum = 0;
    sum = num1 + num2;
    System.out.println(sum);
    return sum;
  }
  //user-defined method 2
  public static void printResult(String result1) {
    System.out.println("The resut is: " + result1);
  }
  //user-defined method 3
  public static void println(String message) {
    System.out.println(message);

  }
  //user-defined method 4
  public static void print(String message) {
    System.out.println(message);

  }
  //user-defined method 5
  public static void printmessage() {
    System.out.println("Hi! Good morning.");

  }

}