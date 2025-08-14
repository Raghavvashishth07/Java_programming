public class nthnodefromend {

    //METHOD-2 FOR FINDING NTH NODE FROM START-- 
    public static Node onetravesrsal(Node head,int a){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=a;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }



    //METHOD 1 FOR FINDING NTH NODE FROM LAST--
    public static Node nthnodefromend(Node head,int a){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-a+1;
        temp=head;
        for(int i=1;i<=m-1;i++){
           temp=temp.next;
        }
        return temp;
    }

    //METHOD 1 FOR REMOVING NTH NODE FROM LAST--
    public static void  removefromlast(Node head,int n){
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+" -> ");
           temp=temp.next;
        }
        System.out.print("null");
    }


    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        Node x=nthnodefromend(a,2);
        // System.out.println(x.data);
        Node onet=onetravesrsal(a, 3);
        System.out.println(onet.data);
        System.out.println("after removing nth from last-- ");
        removefromlast(a, 3);//5 removed.
        display(a);
        removefromlast(a, 6);
        display(a);
    }
}
