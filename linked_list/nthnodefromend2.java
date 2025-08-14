
public class nthnodefromend2 {

    // METHOD-2 FOR FINDING NTH NODE FROM END (One-pass approach)
    public static Node onetravesrsal(Node head, int a) {
        Node fast = head;
        Node slow = head;

        // Move fast 'a' steps ahead
        for (int i = 1; i <= a; i++) {
            if (fast == null) return null; // If 'a' is larger than list size
            fast = fast.next;
        }

        // Move both pointers together
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // METHOD-1 FOR FINDING NTH NODE FROM END (Two-pass approach)
    public static Node nthnodefromend(Node head, int a) {
        int size = 0;
        Node temp = head;

        // Count the size
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (a > size) return null; // Edge case: If 'a' is too large

        int m = size - a + 1;
        temp = head;

        // Move to the (m-1)th node
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // METHOD-1 FOR REMOVING NTH NODE FROM END
    public static Node removefromlast(Node head, int n) {
        Node fast = head;
        Node slow = head;
    
        // Move fast 'n' steps ahead
        for (int i = 0; i < n; i++) { 
            if (fast == null) return head; // If 'n' is larger than list size
            fast = fast.next;
        }
    
        // If fast is null, remove the head node
        if (fast == null) return head.next;
    
        // Move both pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
    
        // Remove nth node
        slow.next = slow.next.next;
    
        return head;
    }
    
    

    // DISPLAY LINKED LIST
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // NODE CLASS
    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original Linked List:");
        display(a);

        // Finding 2nd node from end
        Node x = nthnodefromend(a, 2);
        if (x != null) System.out.println("2nd node from end: " + x.data);

        // Finding 3rd node from end using one-pass method
        Node onet = onetravesrsal(a, 3);
        if (onet != null) System.out.println("3rd node from end (one-pass): " + onet.data);

        // Removing 3rd node from end
        System.out.println("\nAfter removing 3rd node from end:");
        a = removefromlast(a, 3);
        display(a);

        // Removing 6th node (head node)
        System.out.println("\nAfter removing 6th node from end:");
        a = removefromlast(a, 6);
        display(a);
    }
}
