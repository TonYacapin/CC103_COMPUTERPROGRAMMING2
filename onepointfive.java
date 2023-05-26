import java.util.Scanner;

public class onepointfive {

    public static void main(String[] args) {
    	 Scanner s = new Scanner (System.in);
    	
    	try {
    		
    		System.out.println("Enter Name: ");
    		String Name = s.nextLine();
    		System.out.println();
    		System.out.println("Enter Number of Copies: ");
    		int num2 = s.nextInt();
    		System.out.println();
    		
    		for(int num=0;num<num2;num=num+1)
    		{
    
    		System.out.println(Name);
    		
    		}
    		
    } catch (Exception e) {
        System.out.println("Error!");
    

        }
    }
}