import java.io.*;
import java.util.*;

public class BubbleSort 
{
	void Bsort(int k[],int size)
	{
		int temp,flag;
		for(int i = 0; i < size - 1; i ++)
		{
			flag = 0;
			for(int j = 0; j < size - 1; j ++)
			{
				if(k[j + 1] < k [j])
				{
					temp = k[j];
					k[j] = k[j + 1];
					k[j + 1] = temp;
					flag = 1;
				}
			}
			
			System.out.print("\n " + (i + 1)+":");
			for(int a = 0; a < size ; a ++)
				System.out.print(" "+k[a]);
			if(flag == 0)
				break;
		}
	}
	public static void main(String args [])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Elements needed: ");
		n = sc.nextInt();
		
		int k[] = new int[n];
		
		for(int i = 0;i <= n - 1; i ++)
		{
			System.out.print("Enter an Element: ");
			k[i] = sc.nextInt();
		}
//		Bsort(k,n);
		BubbleSort b = new BubbleSort();
		b.Bsort(k, n);
	}
}
