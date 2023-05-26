package LabExe9;

import java.util.Scanner;

public class LabExe9_2 {

  static Scanner dataIn = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter Command to be Performed\n[1] ADD\n[2] SUBSTRACT\n[3] MULTIPLY\n[4] DIVIDE\n[5] POWER\n[6] SINE\n[7] " +
      "COSINE\n[8] TANGENT\n[9] SECANT\n[10] COSECANT\n[11] COTANGENT\n[12] LOGARITHMS\n[13] SQUARE ROOT\n[14] CONVERSION\n[15] EXIT");
    int commandChoice = dataIn.nextInt();
    commandChoice(commandChoice);
  }

  public static void commandChoice(int commandChoice) {
    if (commandChoice == 1) {
      System.out.println("You chose ADD command");
      System.out.println("Enter first number: ");
      int Num1 = dataIn.nextInt();
      System.out.println("Enter second number: ");
      int Num2 = dataIn.nextInt();
      System.out.println(Add(Num1, Num2));
    } else if (commandChoice == 2) {
      System.out.println("You chose SUBSTRACT command");
      System.out.println("Enter first number: ");
      int Num1 = dataIn.nextInt();
      System.out.println("Enter second number: ");
      int Num2 = dataIn.nextInt();
      System.out.println(Substract(Num1, Num2));
    } else if (commandChoice == 3) {
      System.out.println("You chose MULTIPLY command");
      System.out.println("Enter first number: ");
      int Num1 = dataIn.nextInt();
      System.out.println("Enter second number: ");
      int Num2 = dataIn.nextInt();
      System.out.println(Multiply(Num1, Num2));
    } else if (commandChoice == 4) {
      System.out.println("You chose DIVIDE command");
      System.out.println("Enter first number: ");
      int Num1 = dataIn.nextInt();
      System.out.println("Enter second number: ");
      int Num2 = dataIn.nextInt();
      System.out.println(Divide(Num1, Num2));
    } else if (commandChoice == 5) {
      System.out.println("You chose POWER command");
      System.out.println("Enter base number: ");
      int Num1 = dataIn.nextInt();
      System.out.println("Enter exponent number: ");
      int Num2 = dataIn.nextInt();
      System.out.println(Power(Num1, Num2));
    } else if (commandChoice == 6) {
      System.out.println("You chose SINE command");
      System.out.println("Enter a number: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(Sine(Num1));
    } else if (commandChoice == 7) {
      System.out.println("You chose COSINE command");
      System.out.println("Entet a number: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(Cosine(Num1));
    } else if (commandChoice == 8) {
      System.out.println("You chose TANGENT command");
      System.out.println("Enter a number: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(Tangent(Num1));
    } else if (commandChoice == 9) {
      System.out.println("You chose SECANT command");
      System.out.println("Enter a number: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(Secant(Num1));
    } else if (commandChoice == 10) {
      System.out.println("You chose COSECANT command");
      System.out.println("Enter a number: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(Cosecant(Num1));
    } else if (commandChoice == 11) {
      System.out.println("You chose COTANGENT command");
      System.out.println("Enter a number: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(Cotangent(Num1));
    } else if (commandChoice == 12) {
      System.out.println("You chose LOGARITHMS command");
      System.out.println("Enter a number: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(Log(Num1));
    } else if (commandChoice == 13) {
      System.out.println("You chose SQUARE ROOT command");
      System.out.println("Enter a number: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(sqrt(Num1));
    } else if (commandChoice == 14) {
      System.out.println("You chose CONVERSION command\nthis command converts kilometer to meter");
      System.out.println("Enter Kilometer: ");
      double Num1 = dataIn.nextDouble();
      System.out.println(Convertion(Num1) + " meters");
    } else if (commandChoice == 15) {
      System.out.println("You exited the program");
    }

  }
  public static int Add(int Num1, int Num2) {
    int Sum = 0;
    return Sum = Num1 + Num2;
  }
  public static int Substract(int Num1, int Num2) {
    int Difference = 0;
    return Difference = Num1 - Num2;
  }
  public static int Multiply(int Num1, int Num2) {
    int Product = 0;
    return Product = Num1 * Num2;
  }
  public static int Divide(int Num1, int Num2) {
    int Quotient = 0;
    return Quotient = Num1 / Num1;
  }
  public static int Power(int Num1, int Num2) {
    int Power = 0;
    return Power = (int) Math.pow(Num1, Num2);

  }
  public static double Sine(double Num1) {
    double Sine = 0;
    return Sine = Math.sin(Num1);
  }
  public static double Cosine(double Num1) {
    double Cosine = 0;
    return Cosine = Math.cos(Num1);
  }
  public static double Tangent(double Num1) {
    double Tangent = 0;
    return Tangent = Math.tan(Num1);
  }
  public static double Secant(double Num1) {
    double Secant = 0;
    return Secant = (1 / Cosine(Num1));
  }
  public static double Cosecant(double Num1) {
    double Cosecant = 0;
    return Cosecant = (1 / Sine(Num1));
  }
  public static double Cotangent(double Num1) {
    double Cotangent = 0;
    return Cotangent = (Cosine(Num1) / Sine(Num1));
  }
  public static double Log(double Num1) {
    double Log = 0;
    return Log = Math.log10(Num1);
  }
  public static double sqrt(double Num1) {
    double sqrt = 0;
    return sqrt = Math.sqrt(Num1);
  }
  public static double Convertion(double Num1) {
    double Convertion = 0;
    return Convertion = Num1 * 1000;
  }

}