class Node
{
	int Data;
	Node Link;
	Node(int x)
	{
		Data = x;
		Link = null;
	}
}

class Demo
{
	Node Head;
	int len;
	void insertatb(int x)
	{
		Node n = new Node(x);
		len = len + 1;
		if(Head == null)
			Head = n;
		else
		{
			n.Link = Head;
			Head = n;
		}
	}
	void delete(int pos)
	{
		if(Head == null) 
			System.out.println("No Elements Found...");
		else {
		if(len >= pos) {
		if(pos == 1)
			Head = Head.Link;
		else
		{
			Node t;
			t = Head;
			while(pos - 1 > 1)
			{
				t = t.Link;
				pos --;
			}
			t.Link = t.Link.Link;
		}
		}
		else
			System.out.println("Error in Position...");
	}
		}
	void search(int e)
	{
		int f = 0;
		Node t;
		t = Head;
		while(t != null)
		{
			if(t.Data == e)
				f = 1;
			t = t.Link;
		}
		if(f == 1)
			System.out.println("\nElement Found...");
		else
			System.out.println("\nElement Not found...");
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
public class LList 
{
	public static void main(String args [])
	{
		Demo d = new Demo();
		/*d.insertatb(10);
		d.insertatb(20);
		d.insertatb(30);
		d.insertatb(40);
		d.insertatb(50);
		
		d.display();
		System.out.println("");
		*/
		d.delete(4);
		d.display();
		
		d.search(30);
	}
}
