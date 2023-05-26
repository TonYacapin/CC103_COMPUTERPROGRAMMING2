import java.util.Scanner;

public class onepointsix {

    public static void main(String[] args)

    {
    	Scanner s = new Scanner(System.in);
    	
    	try {
    		
    
        int a = 10;

        double sum = 0;
        double average = 0;

        for(int num=0;num<10;num=num+1) {
        	
        	 System.out.println("Enter " + a + " integer/s: ");
             sum += s.nextInt();

             a = a - 1; }
        
        
        average = sum / 10;
        
        System.out.println("Average is " + average);

    	 } catch (Exception e) {
    	     System.out.println("Error!");
    }

}
}
