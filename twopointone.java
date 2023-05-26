import java.util.Scanner;
public class twopointone {

  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(System.in);

      int num = 0;

      System.out.print("Enter number: ");
      num = s.nextInt();
      while (num != 0) {
        if (num % 2 == 0) {
          System.out.println("Even Number");
        } else {
          System.out.println("Odd Number");
        }

        System.out.print("Enter number: ");
        num = s.nextInt();
      }
      System.out.println("Thank you.");

    } catch (Exception e) {
      System.out.println("Error! ");

    }

  }
}