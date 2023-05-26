package LabExe7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sevenpointtwo {

  public static void main(String[] args) {
    BufferedReader datain = new BufferedReader (new InputStreamReader (System.in));
    
     try {
		 int ctr = 0;

      // declaring string literal
      String msg = "";

      //enter message string
      System.out.print("Enter Message: ");
      msg = datain.readLine();

      // using charAt method
      System.out.println("Using charAt Method: ");
      System.out.println(msg.charAt(6));

      //using char at to store in char data type
      System.out.println("Using char data type: ");
      char result = msg.charAt(8);
      System.out.println(result);

      //using charAt method in loop
      System.out.println("USing loop; ");
      for (ctr = 0; ctr < msg.length(); ctr++) {
        System.out.println(msg.charAt(ctr));
      }

	} catch (Exception e) {
		System.out.println("ERROR!");
	}
    }

  }
