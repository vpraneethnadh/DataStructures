import java.util.*;

class Tnode 
{
	int key, height;
	Tnode left, right;

	Tnode(int d) 
	{
		key = d;
		height = 1;
	}
}

public class AVLTree 
{
	Tnode root;
	int height(Tnode N) 
	{
		if (N == null)
			return 0;

		return N.height;
	}
	int max(int a, int b) 
	{
		return (a > b) ? a : b;
	}

	Tnode rightRotate(Tnode y) 
	{
		Tnode x = y.left;
		Tnode T2 = x.right;

		x.right = y;
		y.left = T2;

		y.height = max(height(y.left), height(y.right)) + 1;
		x.height = max(height(x.left), height(x.right)) + 1;

		return x;
	}

	Tnode leftRotate(Tnode x) 
	{
		Tnode y = x.right;
		Tnode T2 = y.left;

		y.left = x;
		x.right = T2;

		x.height = max(height(x.left), height(x.right)) + 1;
		y.height = max(height(y.left), height(y.right)) + 1;

		return y;
	}

	int getBalance(Tnode N) 
	{
		if (N == null)
			return 0;

		return height(N.left) - height(N.right);
	}
	
	Tnode minValueNode(Tnode node)
    {
        Tnode current = node;
        while (current.left != null)
        current = current.left;
        return current;
    }

	Tnode insert(Tnode node, int key) 
	{
		if (node == null)
			return (new Tnode(key));

		if (key < node.key)
			node.left = insert(node.left, key);
		
		else if (key > node.key)
			node.right = insert(node.right, key);
		
		else
			return node;

		
		node.height = 1 + max(height(node.left),height(node.right));

		int balance = getBalance(node);

		if (balance > 1 && key < node.left.key)
			return rightRotate(node);

		if (balance < -1 && key > node.right.key)
			return leftRotate(node);

		if (balance > 1 && key > node.left.key) 
		{
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		if (balance < -1 && key < node.right.key) 
		{
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		return node;
	}
	
    Tnode deleteNode(Tnode root, int key)
    {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else
        {
            if ((root.left == null) || (root.right == null))
            {
                Tnode temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;

                if (temp == null)
                {
                    temp = root;
                    root = null;
                }
                else
                    root = temp;
            }
            else
            {
            	Tnode temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = deleteNode(root.right, temp.key);
            }
        }
        if (root == null)
            return root;
 
        root.height = max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);
 
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);
 
        if (balance > 1 && getBalance(root.left) < 0)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
 
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);
 
        if (balance < -1 && getBalance(root.right) > 0)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    
	void preOrder(Tnode node) 
	{
		if (node != null) 
		{
			System.out.print(node.key + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("V Praneethnadh_21BCE7762");
		Scanner sc = new Scanner(System.in);
		
		AVLTree tree = new AVLTree();		
		while(true)
		{
			System.out.println("\n1.Insertion of an element"
					+ "\n2.Deletion of an element"
					+ "\n3.Display in Preorder Traversal"
					+ "\n4.Exit");
			
			System.out.print("Enter your choice[1-4]: ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.print("Enter any number to insert in a tree: ");
				int in = sc.nextInt();
				tree.root = tree.insert(tree.root, in);
				break;
			
			case 2:
				System.out.print("Enter any number to insert in a tree: ");
				int de = sc.nextInt();
				tree.root = tree.deleteNode(tree.root, de);
				break;
				
			case 3:
				System.out.print("Displaying the elements in Preorder: ");
				tree.preOrder(tree.root);
				break;
				
			case 4:
				System.out.println("Exited...");
				System.exit(0);
				break;
			}
		}
	}
}

