import java.util.Scanner;

public class onepointseven {

	public static void main(String[] args) {
		
		
		System.out.println("Input Number:");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();

		int number=1;
		
		do { 
			
			if (number%6 == 0)
				System.out.print(number+" ");
			
			number++;
		}
		
		while(number<=n);
			
			
		{
	
		}
}
}

