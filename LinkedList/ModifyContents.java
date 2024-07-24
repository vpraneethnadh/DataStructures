class node {
    int data;
    node next;
    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ModifyContents {
    static node head;
    static node tail;

    public static void insert(int n) {
        node temp = new node(n);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public static void modify(int[] arr) {
        int m = arr.length / 2;
        int i = 0;
        int j = arr.length - 1;
        while(i < m){
            int x = arr[i] - arr[j];
            insert(x);
            i ++;
            j --;
        }
        for (int k = m; k < arr.length; k ++) {
            insert(arr[k]);
        }
    }

    public static void printdata() {
        node temp = head;
        if (head == null) {
            System.out.println("No links available!");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String args[]) {
        int[] arr = {2, 9, 8, 12, 7, 10};

        modify(arr);

        // insert(10);
        // insert(20);
        // insert(30);
        printdata();
    }
}
