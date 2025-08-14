// Implementation of a Singly Linked List in Java
public class ImplementationLL {

    // Node class represents each element of the linked list
    public static class Node {
        int data; // Stores the value of the node
        Node next; // Pointer to the next node in the list

        // Constructor to initialize the node with a value
        Node(int data) {
            this.data = data;
            this.next = null; // By default, next is null
        }
    }

    // LinkedList class to manage operations on the list
    public static class LinkedList {
        Node head = null; // Head pointer (points to the first node)
        Node tail = null; // Tail pointer (points to the last node)

        // Method to insert at start or beginning--

        void InsertAtBeginning(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Method to insert a new node at the end of the linked list
        void insertAtEnd(int val) {
            Node temp = new Node(val); // Create a new node with the given value

            if (head == null) { // If the list is empty
                head = temp; // The new node becomes the head
                tail = temp; // The new node also becomes the tail
            } else {
                tail.next = temp; // Link the current tail to the new node
                tail = temp; // Update the tail to the new node
            }
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                InsertAtBeginning(val);
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        // Method to display the linked list elements
        void display() {
            Node temp = head; // Start from the head of the list
            while (temp != null) { // Traverse until the end
                System.out.print(temp.data + " -> "); // Print node's data
                temp = temp.next; // Move to the next node
            }
            System.out.println("null"); // Indicate the end of the list
            System.out.println();
        }

        // Method to return the size of the linked list
        int size() {
            int count = 0;
            Node temp = head; // Start from the head
            while (temp != null) { // Traverse the entire list
                count++; // Increment count for each node
                temp = temp.next; // Move to the next node
            }
            return count; // Return the final count
        }

        int getEle(int idx){
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }

    // Main method to test the linked list functionality
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Create a LinkedList object

        // Insert elements at the end of the list
        ll.insertAtEnd(5);
        ll.insertAtEnd(4);

        // Display the linked list
        System.out.print("Linked List: ");
        ll.display();
        ll.InsertAtBeginning(3);
        ll.display();
        ll.insertAt(1, 2);
        ll.display();
        ll.insertAt(0,100);
        ll.insertAt(5, 99);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println();
        System.out.println(ll.getEle(3));
        ll.getEle(3);
        ll.deleteAt(3);
        ll.display();
    }
}
