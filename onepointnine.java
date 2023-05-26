public class onepointnine {

	public static void main(String[] args) {
		
		
		int num=0;
		int min=1;
		int max=58;
		do
		{
	
		      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		      System.out.print(random_int+" ");
		      num = num+1;
		    
		
		}
		while(num<6);
		
	}
}


