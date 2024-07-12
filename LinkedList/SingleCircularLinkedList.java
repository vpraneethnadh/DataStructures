package Data;

import java.io.*;
import java.util.*;

class cnode
{
	int data;
	cnode link;
	cnode(int data)
	{
		this.data = data;
		link = null;
	}
}
class Circle
{
	cnode Head = null;
	cnode t;
	int len = 0;
	void insertatbeginning(int x)
	{
		t = Head;
		cnode n = new cnode(x);
		
		if(Head == null)
		{
			Head = n;
			Head.link = Head;
		}
		else
		{
			n.link = Head;
			while(t.link != Head)
				t = t.link;
			t.link = n;
			Head = n;
		}
		len = len + 1;
		display();
	}
	void insertatmiddle(int x)
	{
		cnode n = new cnode(x);
		int pos;
		t = Head;
		if(len >= 2)
		{
			pos = len / 2;
			while(pos > 1)
			{
				t = t.link;
				pos = pos - 1;
			}
			n.link = t.link;
			t.link = n;
		}
		len ++;
		display();
	}
	void insertatend(int x)
	{
		t = Head;
		cnode n = new cnode(x);
		
		if(Head == null)
		{
			Head = n;
			Head.link = Head;
		}
		else
		{
			while(t.link != Head)
				t = t.link;
			t.link = n;
			n.link = Head;
		}
		len = len + 1;
		display();
	}
	void deleteatbeginning()
	{
		t = Head;
		if(Head == null)
		{	
			System.out.println("No Elements Found...");
		}
		else
		{
			while(t.link != Head)
				t = t.link;
			Head = Head.link;
			t.link = Head;
		}
		len --;
		display();
	}
	void deleteatmiddle()
	{
		t = Head;
		int pos;
		pos = len / 2;
		if(len > 2)
		{
			if(Head == null)
			{	
				System.out.println("No Elements Found...");
			}
			else
			{
				while(pos > 2)
				{
					t = t.link;
					pos --;
				}
				t.link = t.link.link;
			}
		}
		len --;
		display();
	}
	void deleteatend()
	{
		t = Head;
		int pos;
		pos = len - 1;
		if(Head == null)
		{	
			System.out.println("No Elements Found...");
		}
		else
		{
			while(pos > len - 1)
			{
				t = t.link;
				pos --;
			}
			t.link = t.link.link;
		}
		len --;
		display();
	}
	void display()
	{
		t = Head;
		System.out.println("The Elements in the Circular LinkedList are: ");
		while(t.link != Head)
		{
			System.out.print(t.data+" ");
			t = t.link;
		}
		System.out.print(t.data);
		System.out.println();
	}
}

public class SingleCircularLinkedList 
{
	public static void main(String args[])
	{
		System.out.println("V Praneethnadh_21BCE7762");
		Circle c1 = new Circle();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n1. Insertion at beginning\n"
					+ "2. Insertion at middle\n"
					+ "3. Insertion at end\n"
					+ "4. Deletion at beginning\n"
					+ "5. Deletion at middle\n"
					+ "6. Deletion at end \n"
					+ "7. Exit\n");
			
			System.out.print("Enter Your Choice[1-7]: ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("\n***Insertion at beginning***");
				System.out.print("Enter any number to insert: ");
				int ib = sc.nextInt();
				c1.insertatbeginning(ib);
				break;
				
			case 2:
				System.out.println("\n***Insertion at Middle***");
				System.out.print("Enter any number to insert: ");
				int im = sc.nextInt();
				c1.insertatmiddle(im);
				break;
				
			case 3:
				System.out.println("\n***Insertion at End***");
				System.out.print("Enter any number to insert: ");
				int ie = sc.nextInt();
				c1.insertatend(ie);
				break;
				
			case 4:
				System.out.println("\n***Deletion at beginning***");
				c1.deleteatbeginning();
				break;
				
			case 5:
				System.out.println("\n***Deletion at Middle***");
				c1.deleteatmiddle();
				break;
				
			case 6:
				System.out.println("\n***Deletion at End***");
				c1.deleteatend();
				break;
				
			case 7:
				System.out.println("Exited...");
				System.exit(0);
				break;
			}
		}
	}
}
