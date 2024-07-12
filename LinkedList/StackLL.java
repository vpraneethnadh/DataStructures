import java.util.*;
class Stack
{
	Node Head;
	int Top = 0;
	void push(int x)
	{
		Node n = new Node(x);
		Top = Top + 1;
		if(Head == null)
			Head = n;
		else
		{
			n.Link = Head;
			Head = n;
		}
		display();
	}
	
	void pop()
	{
		if(Head == null)
			System.out.println("UnderFlow...");
		else
		{
			Head = Head.Link;
			Top = Top - 1;
		}
		display();
	}
	
	void display()
	{
		Node t;
		t = Head;
		while(t != null)
		{
			System.out.print("->" + t.Data);
			t = t.Link;
		}
	}
}
public class StackLL 
{
	public static void main(String args [])
	{
		int choice = 0;
		Stack s = new Stack();
		while(choice != 3)
		{
			System.out.println("\n1.Push an element into stack"
					+ "\n2.Pop an element from stack"
					+ "\n3.Exit");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Yout choice[1/2/3]: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter an element into stack: ");
				int n = sc.nextInt();
				s.push(n); break;
			case 2:
				s.pop();break;
			case 3:
				System.exit(0); break;
			}
		}
	}
}
