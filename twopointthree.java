import java.util.Scanner;
public class twopointthree {

  public static void main(String[] args) {
    try {
      Scanner s = new Scanner(System.in);
      int num;
      char ans = 'y';

      do {
        System.out.println("Enter Positive Interger: ");
        num = s.nextInt();

        while (num > 1) {

          if (num % 2 == 0) {
            num = num / 2;
          } else {
            num = 3 * num + 1;

          }
          System.out.print(num + " ");

        }
        System.out.println();
        System.out.println("\nTry Again? [Y/N] ");

        ans = s.next().charAt(0);
      }
      while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {
      System.out.println("Error!");

    }
  }
}
	


