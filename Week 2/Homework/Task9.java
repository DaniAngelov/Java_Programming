
//  github.com/DaniAngelov

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Task1 
{
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int arr[] = new int[length];
		
		for(int i =0 ;i < length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int temp = 0;
		int temp2 = 0 ;
		for(int i = 0;i < length;i++)
		{
			
			temp = arr[i];
			//temp2 = arr[length - i];
			arr[i] = arr[length - i - 1];
			arr[length - i - 1] = temp;
			
			if(i == length /2 || (length % 2 == 0 && i == length /2 - 1))
				break;
			
		}
		for(int i = 0;i < length;i++)
		{
			System.out.println(arr[i] + " ");
		}
		
	}
	
}
