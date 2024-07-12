package Data;

import java.util.*;

class Dnode
{
	int data;
	Dnode LLink;
	Dnode RLink;
	
	Dnode(int x)
	{
		data = x;
		LLink = null;
		RLink = null;
	}
}

class Multi
{
	Dnode Head;
	Dnode t;
	int size = 0;
	void Right(int x)
	{
		Dnode n = new Dnode(x);
		
		if(Head == null)
		{
			Head = n;
			n.LLink = Head;
		}
		else
		{
			n.RLink = Head;
			n.RLink.LLink = n;
			Head = n;
			n.LLink = Head;
		}
	}
	
	void Left(int x)
	{
		Dnode n = new Dnode(x);
		if(Head == null)
		{
			Head = n;
			n.LLink = Head;
		}
		else
		{
			t = Head;
			while(t.RLink != null)
				t = t.RLink;
			t.RLink = n;
			n.LLink = t;
		}
	}
	
	void insertmiddle(int pos,int x)
	{
		size = size + 1;
		Dnode n = new Dnode(x);
		if(pos == 1)
		{
			n.RLink = Head;
			n.RLink.LLink = n;
			Head = n;
			n.LLink = Head;
		}
		else if(pos >= size)
		{
			t = Head;
			if(Head == null)
			{
				Head = n;
				n.LLink = Head;
			}
			else
			{
				while(t.RLink != null)
					t = t.RLink;
				t.RLink = n;
				n.LLink = t;
			}
		}
		else
		{
			while(pos - 1 < 1)
			{
				t = t.RLink;
				pos = pos - 1;
			}
			t.LLink = n;
			n.LLink = t;
			t.LLink.RLink = n;
			n.LLink = t.LLink;
		}
	}
	
	void deletebeginning()
	{
		int pos = 0;
		Dnode t1,t2;
		size --;
		if(Head == null)
			System.out.println("NO Elements Found...");
		else
		{
			t1 = Head;
			t2 = t1.RLink;
			if(pos == 1)
			{
				if(t2 == null)
					Head = null;
				else
				{
					Head = t1.RLink;
					t2.LLink = Head;
				}
			}
			else
			{
				while(pos - 1 > 1)
				{
					t1 = t1.RLink;
					t2 = t2.RLink;
					pos --;
				}
				t1.RLink = t2.RLink;
				if(t2.RLink != null)
					t2.RLink.LLink = t1;
			}
		}
	}
	void deletemiddle(int pos)
	{
		Dnode t1,t2;
		size --;
		if(Head == null)
			System.out.println("NO Elements Found...");
		else
		{
			t1 = Head;
			t2 = t1.RLink;
			if(pos == 1)
			{
				if(t2 == null)
					Head = null;
				else
				{
					Head = t1.RLink;
					t2.LLink = Head;
				}
			}
			else
			{
				while(pos - 1 > 1)
				{
					t1 = t1.RLink;
					t2 = t2.RLink;
					pos --;
				}
				t1.RLink = t2.RLink;
				if(t2.RLink != null)
					t2.RLink.LLink = t1;
			}
		}
	}
	void deleteend()
	{
		int pos = size-1;
		Dnode t1,t2;
		size --;
		if(Head == null)
			System.out.println("NO Elements Found...");
		else
		{
			t1 = Head;
			t2 = t1.RLink;
			if(pos == 1)
			{
				if(t2 == null)
					Head = null;
				else
				{
					Head = t1.RLink;
					t2.LLink = Head;
				}
			}
			else
			{
				while(pos - 1 > 1)
				{
					t1 = t1.RLink;
					t2 = t2.RLink;
					pos --;
				}
				t1.RLink = t2.RLink;
				if(t2.RLink != null)
					t2.RLink.LLink = t1;
			}
		}
	}
	
	void display()
	{
		t = Head;
		while(t != null)
		{
			System.out.print("  " + t.data);
			t = t.RLink;
		}
		System.out.println();
	}
}

public class DoubleLList
{
	public static void main(String args [])
	{
		Multi m = new Multi();
		System.out.println("V Praneethnadh_21BCE7762");
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int e;

		while(true)
		{
			System.out.println("1. Insertion at beginning\n"
				+ "2. Insertion at middle\n"
				+ "3. Insertion at end\n"
				+ "4. Deletion at beginning\n"
				+ "5. Deletion at middle\n"
				+ "6. Deletion at end \n"
				+ "7. Display Elements in LinkedList \n"
				+ "8. Exit\n");
		
			System.out.print("Enter Your Choice: ");
			n = sc.nextInt();
			
			switch(n)
			{
			case 1: 
				System.out.println("***Insertion at Beginning***");
				System.out.println("Enter a number to insert at the Beginning: ");
				int a = sc.nextInt();
				m.Right(a);
				break;
			
			case 2:
				System.out.println("***Insertion at Middle***");
				System.out.println("Enter a number to insert at the Middle: ");
				int b = sc.nextInt();
				System.out.println("Enter the poition of the number to be inserted: ");
				int p = sc.nextInt();
				m.insertmiddle(p,b);
				break;
				
			case 3:
				System.out.println("***Insertion at End***");
				System.out.println("Enter a number to insert at the End: ");
				int c = sc.nextInt();
				m.Left(c);
				break;
				
			case 4:
				System.out.println("***Deletion at Beginning***");
				m.deletebeginning();
				break;
				
			case 5:
				System.out.println("***Deletion at Middle***");
				System.out.println("Enter the position of the number to be deleted: ");
				int d1 = sc.nextInt();
				m.deletemiddle(d1);
				break;
				
			case 6:
				System.out.println("***Deletion at End***");
				m.deleteend();
				break;
			
			case 7:
				System.out.println("***Elements in LinkedList***");
				m.display();
				break;
			
			case 8:
				System.out.println("Succesfully Exited...");
				System.exit(0);
				break;
			}
		}
	}
}
