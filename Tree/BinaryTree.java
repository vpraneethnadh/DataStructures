class node
{
	int data;
	node Left;
	node Right;
	
	node(int x)
	{
		data = x;
		Left = null;
		Right = null;
	}
}

class Binary
{
	node Root;
	Binary(int x)
	{
		Root = new node(x);
	}
	Binary()
	{
		Root = null;
	}
}

public class BinaryTree
{
	public static void main(String args [])
	{
		Binary b = new Binary();
		b.Root = new node(1);
		b.Root.Left = new node(2);
		b.Root.Right = new node(3);
		b.Root.Left.Left = new node(4);
		b.Root.Left.Right = new node(5);
		b.Root.Right.Left = new node(6);
		b.Root.Right.Right = new node(7);
	}
}
