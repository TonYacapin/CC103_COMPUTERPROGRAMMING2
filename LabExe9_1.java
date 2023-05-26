package LabExe9;

import java.util.Scanner;

public class LabExe9_1 {

  static Scanner dataIn = new Scanner(System.in);
  static boolean hasHoursRendered = false;

  public static void main(String[] args) {

    double hoursRendered, Rate, GrossSalary, netSalary;

    hoursRendered = getHoursRendered(0);
    Rate = getRate(0);
    GrossSalary = getGrossSalary(hoursRendered, Rate);
    netSalary = getNetSalary(GrossSalary);
    printNetSalary(GrossSalary, netSalary);
  }

  public static double getHoursRendered(double hoursRendered) {
    if (hasHoursRendered == false);
    System.out.print("Valid hours is from 0 to 12 only\nEnter Hours Rendered: ");
    hoursRendered = dataIn.nextInt();
    validateHours(hoursRendered);
    return hoursRendered;
  }

  public static void validateHours(double Hours) {
    if (Hours <= 12 && Hours >= 0) {
      hasHoursRendered = true;
    } else {
      getHoursRendered(0);
    }
  }

  public static double getRate(double Rate) {
    System.out.print("Enter Rate per hour: ");
    return Rate = dataIn.nextDouble();
  }
  public static double getGrossSalary(double hoursRendered, double Rate) {
    double GrossSalary = (8 * Rate) + ((2 * Rate) * 4);
    return GrossSalary;
  }
  public static double getNetSalary(double GrossSalary) {
    double netSalary = GrossSalary - (GrossSalary * .30);
    return netSalary;
  }

  public static void printNetSalary(double GrossSalary, double netSalary) {
    System.out.printf("\nGross salary is %.2f\n", GrossSalary);
    System.out.printf("Net Salary is  %.2f\n", netSalary);

  }

}