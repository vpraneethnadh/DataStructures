class Treenode{
    int data;
    Treenode left;
    Treenode right;
    Treenode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class Tree{
    static Treenode root;
    public static void insert(int data){
        root = insertroot(root,data);
    }
    public static Treenode insertroot(Treenode root, int data){
        if(root == null){
            root = new Treenode(data);
            return root;
        }
        if(data < root.data)
            root.left = insertroot(root.left,data);
        else if(data > root.data)
            root.right = insertroot(root.right,data);
        
        return root;
    }
    
    public static void inorder(Treenode root){
        if(root != null){
            inorder(root.right);
            System.out.print(root.data + " ");
            inorder(root.left);
        }
    }
    
    public static void preorder(Treenode root){
        if(root != null){
            System.out.print(root.data + " ");
            preorder(root.right);
            preorder(root.left);
        }
    }
    
    public static void postorder(Treenode root){
        if(root != null){
            postorder(root.right);
            postorder(root.left);
            System.out.print(root.data + " ");
        }
    }
    public static void inorder(){
        inorder(root);
    }
    public static void preorder(){
        preorder(root);
    }
    public static void postorder(){
        postorder(root);
    }
  
    public static void main(String args[]){
        insert(45);
        insert(50);
        insert(60);
        insert(75);
        insert(90);
        insert(652);
        
        preorder();
        System.out.println();
        postorder();
        System.out.println();
        inorder();
    }
}