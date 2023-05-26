package LabExe7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sevenpointfive {

  public static void main(String[] args) {

    char ans = 'y';

    BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
    try {
      do {
        String text = "";

        System.out.print("Enter Sentence: ");
        text = datain.readLine();

        text = text.replaceAll("\\s+", "");
        System.out.println(text);

        System.out.print("\nTry Again? [Y/N] :");
        ans = datain.readLine().charAt(0);

      } while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {

      System.out.println("ERROR!");
    }
  }

}