package LabExe7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sevenpointfour {

	public static void main(String[] args) {
		
		char ans = 'y';
		
		
	BufferedReader datain = new BufferedReader (new InputStreamReader (System.in));
	try {
	do {
		String name = "";
	
	StringBuilder name1 = new StringBuilder();
	
	

	System.out.print("Enter name: ");
	name = datain.readLine();
	
	name1.append(name);
	name1.reverse();
	
	System.out.println(name1);
	
	
System.out.print("\nTry Again? [Y/N] :");
	ans= datain.readLine().charAt(0);
	
	} while (ans == 'y' || ans == 'Y');
	
	} catch (Exception e) {
		
		System.out.println("ERROR!");
	} 
	}

}
