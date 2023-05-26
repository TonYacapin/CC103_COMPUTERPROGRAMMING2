import java.util.Scanner;

public class onepointtwo {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    try {
      System.out.println("Enter a Number: ");
      int n = s.nextInt();
      int i =1;

      while (i <= n) {
    	  
        System.out.print(i + " ");
        i++;
      }
      
    } catch (Exception e) {
      System.out.println("Error");
    }
  }
}
