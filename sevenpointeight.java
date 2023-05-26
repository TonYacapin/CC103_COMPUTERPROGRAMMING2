package LabExe7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sevenpointeight {

  public static void main(String[] args) {

    char ans = 'y';

    BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
    try {
      do {
        String text = "";

        char textChar = ' ', searchChar = ' ';

        int ctr = 0;

        //ask input
        System.out.print("Enter two words: ");
        text = datain.readLine();

        // prints string char one by one if blank char is reached 
        // creates new line and continue until end of text  
        for (ctr = 0; ctr < text.length(); ctr++) {
          textChar = text.charAt(ctr);

          if (textChar == searchChar) {
            System.out.println();
          } else {
            System.out.print(text.charAt(ctr));
          }
        }

        System.out.print("\nTry Again? [Y/N] :");
        ans = datain.readLine().charAt(0);

      } while (ans == 'y' || ans == 'Y');

    } catch (Exception e) {

      System.out.println("ERROR!");
    }
  }

}