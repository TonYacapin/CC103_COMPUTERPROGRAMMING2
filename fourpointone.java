package LabExe4;

import java.util.Scanner;

public class fourpointone {

	public static void main(String[] args) {
		
		Scanner s =new Scanner (System.in);
		//array declaration and instantiation
		int []score = {3, 8, 9, 2, 1, 0, 5, 4, 6, 7};
		int ctr=0;
		int key = 0;
		int idx = -1;
		//display the elements of array
		for(int item : score )
		{
		System.out.print(item + " ");
		}
		System.out.println();
		//input key to be search
		System.out.print("Enter key to be search: ");
		key=s.nextInt();
		//search the key on the array
		for(ctr=0; ctr<score.length; ctr++)
		{
		if(score[ctr]==key)
		{
		idx=ctr;
		break;
		}
		}
		System.out.println("Last value of ctr: "+ ctr);
		//display the appropriate message
		if(idx==-1)
		{
		System.out.println("Item not found!");
		}
		else
		{
		System.out.println("Item FOUND! at index "+ idx);}
	}

}
