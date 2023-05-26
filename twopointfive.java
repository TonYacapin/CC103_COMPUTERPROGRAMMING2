package LabExe2;

public class twopointfive {

  public static void main(String[] args) {

    int num = 0;
    num = 1;

    while (num <= 10) {
      System.out.println(num);
      num = num + 1;

      if (num == 5) {
        break;
      }
    }
    
    System.out.println("Thank you.");
  }
}