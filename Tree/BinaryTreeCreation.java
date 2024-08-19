class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeCreation {
    public static Node root;

    public static void insert(int n) {
        Node temp = new Node(n);
        if (root == null)
            root = temp;
        else
            insert2(root, temp);
    }

    private static void insert2(Node temp, Node newNode) {
        if (newNode.data < temp.data) {
            if (temp.left == null)
                temp.left = newNode;
            else
                insert2(temp.left, newNode);
        }
        else if (newNode.data > temp.data) {
            if (temp.right == null)
                temp.right = newNode;
            else
                insert2(temp.right, newNode);
        }
    }

    public static void delete(int n){
        if(root == null){
            System.out.println("No Links found");
            return;
        }
        else
            delete2(root,n);
    }

    public static Node delete2(Node root,int n){
        if(n < root.data)
            root.left = delete2(root.left,n);
        else if(n > root.data)
            root.right = delete2(root.right,n);
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = delete2(root.right,root.data);
        }
        return root;
    }

    public static int minValue(Node root){
        int minv = root.data;
        while(root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        insert(10);
        insert(20);
        insert(25);
        insert(30);
        insert(40);
        insert(50);

        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();

        delete(25);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();

        
    }
}