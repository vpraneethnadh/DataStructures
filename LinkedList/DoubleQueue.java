package Data;
class Darray
{
	int max=5;
	int front,rear;
	int k[]=new int[max];
	Darray()
	{
		front=rear=-1;
	}
	
	void Enqueue_rear(int key)
	{
		if (rear==-1)
		{
			rear = max-1;
			k[rear]=key;
		}
		else if (rear!=0)
		{
			rear--;
			k[rear]=key;
		}
		else System.out.println("Overflow...");
	}
	
	void Dqueue_rear()
	{
		if (rear==-1)
			System.out.println("There are no elements in rear");
		else
			rear++;
	}

	
	void Enqueue_front(int key)
	{
		if (front==-1)
		{
			front=0;
			k[front]=key;
		}
		else if (front<=max-1)
		{
			front++;
			k[front]=key;
		}
		else System.out.println("Overflow...");
		
	}
	
	void Dqueue_front()
	{
		if (front==-1)
			System.out.println("There are no elements in first");
		else
			front--;
	}
	
	void display()
	{
		int i,j;
		i=front;
		j=rear;
		
		
		if (front!=-1)
		{
			for(int t=0;t<=front;t++)
				System.out.print(k[t]+" ");
		}
		
		if (rear!=-1)
		{
			for(;j<max;j++)
				System.out.print(k[j]+" ");
		}
		
		
	}
}


public class DoubleQueue 
{
	
	public static void main(String args[])
	{
		System.out.println("V Praneethnadh_21BCE7762");
		Darray d = new Darray();
		d.Enqueue_front(10);
		d.Enqueue_front(20);
		d.Enqueue_front(12);
		d.Enqueue_front(13);
		d.Enqueue_rear(10);
		System.out.print("Elements in the Deque : ");		
		d.display();
		
		System.out.print("\nElements in the Deque : ");
		d.Dqueue_front();
		d.Dqueue_rear();
		d.display();
		
	}
}