import java.util.Scanner;

public class onepointthree {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    try {
      System.out.println("Enter a Number: ");
      int n = s.nextInt();
      System.out.println("Enter a Number(this Number should be smaller than your first number: ");
      int i =s.nextInt();

      while (i <= n) {
    	  
        System.out.print(i + " ");
        i++;
      }
      
    } catch (Exception e) {
      System.out.println("Error");
    }
  }
}