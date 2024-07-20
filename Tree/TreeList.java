import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        data = val;
        left = right = null;
    }
}

public class TreeList {
	static void rightsideview(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int n = q.size();
			for(int i = 0;i <= n - 1;i ++) {
				TreeNode curr = q.poll();
				if(i == n-1)
					System.out.print(curr.data + " ");
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
		}
	}
	static void leftsideview(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int n = q.size();
			for(int i = 0;i <= n - 1;i ++) {
				TreeNode curr = q.poll();
				if(i == n-1)
					System.out.print(curr.data + " ");
				if(curr.right != null)
					q.add(curr.right);
				if(curr.left != null)
					q.add(curr.left);
				
			}
		}
	}
	static void levelorder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
	    while(!q.isEmpty()){
	      TreeNode curr = q.poll();
	      System.out.print(curr.data+" ");
	      if(curr.left!=null){
	        q.add(curr.left);
	      }
	      if(curr.right!=null){
	        q.add(curr.right);
	      }
	    }
	}
    static void preorder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void postorder(TreeNode root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        int val = sc.nextInt();
        if (val != -1) {
            root = new TreeNode(val);
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            val = sc.nextInt();
            while (!q.isEmpty() && val != -1) {
                TreeNode curr = q.poll();
                curr.left = new TreeNode(val);
                q.add(curr.left);
                val = sc.nextInt();
                if (val == -1)
                    break;
                curr.right = new TreeNode(val);
                q.add(curr.right);
                val = sc.nextInt();
            }
        }
        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
        System.out.print("Levelorder: ");
        levelorder(root);
        System.out.println();
        System.out.print("Left Side View: ");
        leftsideview(root);
        System.out.println();
        System.out.print("right Side View: ");
        rightsideview(root);
    }
}
