import java.util.Scanner;

public class onepointfour {
	
	public static void main(String[] args){
	
	
 	 Scanner s = new Scanner (System.in);
 	
 	try {
 		
 		System.out.println("Enter Name: ");
 		String Name = s.nextLine();
 		System.out.println();
 		
 		for(int num=0;num<10;num=num+1)
 		{
 
 		System.out.println(Name);
 		
 		}
 		
 } catch (Exception e) {
     System.out.println("Error!");
 

     }
 }
}

