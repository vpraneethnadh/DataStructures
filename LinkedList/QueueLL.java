import java.util.*;
class Queue
{
	Node Head;
	Node t;
	void Insert(int x)
	{
		Node n = new Node(x);
		if(Head == null)
			Head = n;
		else
		{
			Node t;
			t = Head;
			while(t.Link != null)
				t = t.Link;
			t.Link = n;
		}
	}
	
	void Delete()
	{
		if(Head == null)
			System.out.println("The Queue is Empty...");
		else
			Head = Head.Link;
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

public class QueueLL 
{
	public static void main(String args [])
	{
		Queue q = new Queue();
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("\n1.Insert Nodes to the Queue"
					+ "\n2.Delete Nodes from the Queue"
					+ "\n3.Exit");
			
			System.out.println("Enter Your Choice [1/2/3]: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter any number to add into the Queue: ");
					int num = sc.nextInt();
					q.Insert(num);
					q.display();
					break;
				
				case 2:
					System.out.println("Deleted the Number from the Queue");
					q.Delete();
					q.display();
					break;
				
				case 3:
					System.out.println("Exited...");
					System.exit(0);
			}
		}
	}	
}
