// package linked_list;

// public class ll1 {

//     // Define the Node class inside ll1 class
//     class Node {
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     // Declare the head of the linked list
//     private Node head;
//     private int size;

//     // Constructor to initialize the linked list
//     public ll1() {
//         this.head = null;  // Initially, the list is empty
//         this.size=0;
//     }

//     // Method to add a node at the beginning of the linked list
//     public void addFirst(String data) {
//         Node newNode = new Node(data);  // Create a new node with the provided data
//         if (head == null) {
//             head = newNode;  // If the list is empty, the new node becomes the head
//         } else {
//             newNode.next = head;  // Point the new node to the current head
//             head = newNode;  // Update the head to the new node
//         }
//         size++;
//     }
//     //add last node--

//     public void addLast(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//         }
//         Node currNode=head;
//         while(currNode.next!=null){
//             currNode=currNode.next;
//         }
//         currNode.next=newNode;
//         size++;

//     }
//     //printing list--

//     public void printList(){
//         if(head==null){
//             System.out.println("list is empty");
//         }
//         Node currNode=head;
//         while(currNode!=null){
//             System.out.print(currNode.data+ " --> ");
//             currNode=currNode.next;
//         }
//         System.out.println("null");
//     }

//     //delete first--

//     public void deleteFirst(){
//         if(head==null){
//             System.out.println("list is empty");
//             return;
//         }
//         head=head.next;
//         size--;
//     }

//     //delete Last--

//     public void deleteLast(){
//         if(head==null){
//             System.out.println("list is empty");
//             return;
//         }
//         size--;
//         if(head.next==null){
//             head=null;
//             return;
//         }
//         Node secondlast=head;
//         Node lastNode=head.next;
//         while(lastNode.next!=null){
//              lastNode=lastNode.next;
//              secondlast=secondlast.next;
//         }
//         secondlast.next=null;
//     }

//     public int getSize() {
//         return size;
//     }



//     // Main method to test the linked list functionality
//     public static void main(String[] args) {
//         ll1 list = new ll1();  // Create a new linked list object
//         list.addFirst("a");     // Add "a" to the list
//         list.addFirst("is");    // Add "is" to the list
//         list.printList();
//         list.addLast("system");
//         list.printList();

//         list.deleteFirst();
//         list.printList();

//         list.deleteLast();
//         list.printList();

        
//         System.out.println("Size of the list: " + list.getSize());  // Output the size
//     }
// }
package linked_list;

public class ll1 {

    // Define the Node class inside ll1 class
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Declare the head of the linked list
    private Node head;
    private int size; // Keeps track of the size of the list

    // Constructor to initialize the linked list
    public ll1() {
        this.head = null;  // Initially, the list is empty
        this.size = 0;     // Size is 0 when list is empty
    }

    // Method to add a node at the beginning of the linked list
    public void addFirst(String data) {
        Node newNode = new Node(data);  // Create a new node with the provided data
        if (head == null) {
            head = newNode;  // If the list is empty, the new node becomes the head
        } else {
            newNode.next = head;  // Point the new node to the current head
            head = newNode;  // Update the head to the new node
        }
        size++;  // Increment size when a new node is added
    }

    // Method to add a node at the end of the linked list
    public void addLast(String data) {
        Node newNode = new Node(data);  // Create a new node
        if (head == null) {
            head = newNode;  // If the list is empty, set new node as head
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;  // Traverse to the last node
            }
            currNode.next = newNode;  // Set the last node's next to the new node
        }
        size++;  // Increment size
    }

    // Method to print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Method to delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;  // Set the head to the next node
        size--;  // Decrement size
    }

    // Method to delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;  // If there's only one node, set head to null
        } else {
            Node secondLast = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;  // Set the second last node's next to null
        }
        size--;  // Decrement size
    }

    // Method to get the size of the linked list
    public int getSize() {
        return size;
    }

    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }
 
 
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){

        if(head==null || head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;

    }
 

    // Main method to test the linked list functionality
    public static void main(String[] args) {
        ll1 list = new ll1();  // Create a new linked list object
        list.addFirst("a");     // Add "a" to the list
        list.addFirst("is");    // Add "is" to the list
        list.printList();       // Print the list: is --> a --> null

        list.addLast("system"); // Add "system" to the list
        list.printList();       // Print the list: is --> a --> system --> null

        list.deleteFirst();     // Delete the first node
        list.printList();       // Print the list: a --> system --> null

        list.deleteLast();      // Delete the last node
        list.printList();       // Print the list: a --> null

        System.out.println("Size of the list: " + list.getSize());  // Output the size
        list.deleteFirst();
        list.addFirst("this");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");

        list.printList();
        list.reverseList();
        list.printList();

        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}
