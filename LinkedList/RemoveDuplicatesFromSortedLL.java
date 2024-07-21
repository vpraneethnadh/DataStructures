class node {
    int data;
    node next;
    node(int d) {
        data = d;
        next = null;
    }
}
class Main {
    static node head;
    static node tail;
    public static void removeDuplicates() {
        tail = head;
        while (tail != null) {
            node temp = tail;
            while (temp != null && temp.data == tail.data) {
                temp = temp.next;
            }
            tail.next = temp;
            tail = tail.next;
        }
    }

    public static void insert(int n) {
        node temp = new node(n);
        if(head == null)
            head = temp;
        else{
            temp.next = head;
            head = temp;
        }
    }

    public static void printList() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        insert(20);
        insert(13);
        insert(13);
        insert(11);
        insert(11);
        insert(11);

        System.out.println("List before removal of duplicates");
        printList();

        removeDuplicates();

        System.out.println("List after removal of elements");
        printList();
    }
}
