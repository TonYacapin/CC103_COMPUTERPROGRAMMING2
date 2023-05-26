package LabExe4;

import java.util.Scanner;

public class fourpointthree {

	public static void main(String[] args) {
		//array declaration and instantiation
		Scanner s = new Scanner  (System.in);
		int []score = {18, 21, 33, 45, 58, 64, 77, 83, 98, 102};
		int ctr=0, key = 0, idx = -1;
		int first = 0, last =score.length-1, mid=0;
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
		mid = (first + last) / 2;
		while(first <=last)
		{
		if(score[mid] < key)
		{
		first = mid + 1;
		}
		else if(score[mid] == key)
		{
		idx=mid; break;
		}
		else
		{
		last=mid-1;
		}
		mid = (first + last) / 2;
		}
		//display the appropriate message
		if(idx==-1)
		{
		System.out.println("Item not found!");}
		else
		{
		System.out.println("Item FOUND! at index "+ idx);}
}
}
