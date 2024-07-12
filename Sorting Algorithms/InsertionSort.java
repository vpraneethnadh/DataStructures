import java.util.Scanner;

public class InsertionSort 
{
	static void Insert(int k[])
	{
		int i,j,temp;
		for(i = 1; i < k.length; i ++)
		{
//			System.out.println(i);
//			System.out.println(k.length);
			
			temp = k[i];
			j = i - 1;
			while(j >= 0 && temp <= k[j])
			{
				k[j + 1] = k[j];
				j = j - 1;
			}
			k[j + 1] = temp;
		
//			System.out.println(i);
			System.out.print("\nPass " + (i)+":");
			for(int a = 0; a < k.length ; a ++)
				System.out.print(" "+k[a]);
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
		Insert(k);
	}
}
