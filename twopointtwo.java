import java.util.Scanner;
public class twopointtwo {

  public static void main(String[] args) {
    try {
    	
      Scanner s = new Scanner(System.in);
      char ans = 'y';
	do {
      int num = 0, n = 0, sum = 0, m = 0;
      
     
        System.out.println("Enter value of n: ");
        n = s.nextInt();
        System.out.println("Enter value of m: ");
        m = s.nextInt();

        for (num = n; num <= m; num++) {

          sum = sum + num;
        }
        System.out.println("The sum is " + sum);
        System.out.println("Try Again? [Y/N] ");
        ans = s.next().charAt(0);
      }
      while (ans == 'y' || ans == 'Y');
      
    } catch (Exception e) {
      System.out.println("Error! ");

    }

  }
}