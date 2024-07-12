import java.util.Scanner;

public class QuickSort 
{
	static void Quick(int k[],int first,int last)
	{
		int pivot;
		int i = 0,j = 0;
		int temp;
		
		if(first < last)
		{
			pivot = first;
			i = first;
			j = last - 1;
			
			while(i < j)
			{
				while(k[i] < k[pivot] && i < last)
					i ++;
				while(k[j] > k[pivot])
					j --;
				if(i < j)
				{
					temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
			temp = k[pivot];
			k[pivot] = k[j];
			k[j] = temp;
			Quick(k,first,j - 1);
			Quick(k,j + 1,last);
		}
		System.out.print("\nPass " + (i + 1)+":");
		for(int a = 0; a < k.length ; a ++)
			System.out.print(" "+k[a]);
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
		Quick(k,0,n);
	}
}
