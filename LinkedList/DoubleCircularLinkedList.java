package Data;
import java.util.*;
class dcnode
{
	int data;
	dcnode llink;
	dcnode rlink;
	
	dcnode(int data)
	{
		this.data = data;
		llink = null;
		rlink = null;
	}
}

class DoubleCircular
{
	dcnode Head;
	dcnode t,t1,t2;
	int len;
	void insertatbeginning(int x)
	{
		t = Head;
		dcnode n = new dcnode(x);
		if(Head == null)
		{
			Head = n;
			n.rlink = Head;
		}
		else
		{
			t = Head;
			while(t.rlink != Head)
				t = t.rlink;
			n.rlink = Head;
			Head = n;
			t.rlink = n;
		}
		len++;
		display();
	}
	void insertatmiddle(int x)
	{
		dcnode n = new dcnode(x);
		int pos;
		pos = len / 2;
		while(pos - 1 >= 1)
		{
			t = t.rlink;
			pos --;
		}
		n.llink = t;
		n.rlink = t.rlink;
		t.rlink = n;
		n.rlink.llink = n;
		len++;
		display();
	}
	void insertatend(int x)
	{
		t = Head;
		dcnode n = new dcnode(x);
		if(Head == null)
		{
			Head = n;
			n.rlink = Head;
		}
		else
		{
			while(t.rlink != Head)
				t = t.rlink;
			n.rlink = Head;
			n.llink = t;
			t.rlink = n;
		}
		len++;
		display();
	}
	void deleteatbeginning()
	{
			Head = Head.rlink;
			t = Head;
			Head.llink = null;
			while(t.rlink != Head)
				t = t.rlink;
			t.rlink = Head;
			len --;
		display();
	}
	void deleteatmiddle()
	{
		t1 = Head;
		int pos;
		pos = len / 2;
			while(pos > 1)
			{
				t2 = t1;
				t1 = t1.rlink;
				pos --;
			}
			t2.rlink = t1.rlink;
			t1.rlink.llink = t2;
		len--;
		display();
	}
	void deleteatend()
	{
		t = Head;
			while(t.rlink.rlink != Head)
				t = t.rlink;
			t.rlink = Head;
		
		len--;
		display();
	}
	void display()
	{
		t = Head;
		while(t.rlink != Head)
		{
			System.out.print(t.data+" ");
			t = t.rlink;
		}
		System.out.println(t.data);
	}
}
public class DoubleCircularLinkedList 
{
	public static void main(String args[])
	{
		System.out.println("V Praneethnadh_21BCE7762");
		DoubleCircular dc = new DoubleCircular();
		Scanner sc = new Scanner(System.in);
		int n;
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
				dc.insertatbeginning(a);
				break;
			
			case 2:
				System.out.println("***Insertion at Middle***");
				System.out.println("Enter the number to be inserted at middle: ");
				int p = sc.nextInt();
				dc.insertatmiddle(p);
				break;
				
			case 3:
				System.out.println("***Insertion at End***");
				System.out.println("Enter a number to insert at the End: ");
				int c = sc.nextInt();
				dc.insertatend(c);
				break;
				
			case 4:
				System.out.println("***Deletion at Beginning***");
				dc.deleteatbeginning();
				break;
				
			case 5:
				System.out.println("***Deletion at Middle***");
				dc.deleteatmiddle();
				break;
				
			case 6:
				System.out.println("***Deletion at End***");
				dc.deleteatend();
				break;
			
			case 7:
				System.out.println("***Elements in LinkedList***");
				dc.display();
				break;
			
			case 8:
				System.out.println("Succesfully Exited...");
				System.exit(0);
				break;
			}
		}
	}
}
