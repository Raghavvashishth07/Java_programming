public class Manually_ll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        // Node x=new Node();
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(3);
        Node e=new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // Node temp=a;

        // for (int i=0;i<5;i++)
        //  while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
        System.out.println("linked list-- ");
        displayr(a);
        System.out.println();
        System.out.println("length of linked list-- ");
        System.out.println(length(a));
    }
}
