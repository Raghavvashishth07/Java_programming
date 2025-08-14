package QUEUE;

public  class Llimplement {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

       public static class Queuell{
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if(size==0) {
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        public int remove(){
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }

        public int peek(){
            if(size==0) {
                System.out.println("queue is empty"); 
                return -1;
            }
            return head.val;
        }
        
       public boolean isEmpty(){
        if(size==0) return true;
        else return false;
       }

       public void display(){
        Node temp=head;
           if (head == null) {
                System.out.print("Queue is empty");
            }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
       }

       } 
    
    public static void main(String[] args) {
        Queuell q1=new Queuell();
        q1.display();
        System.out.println(q1.isEmpty());
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        System.out.print(q1.peek());
        
        q1.remove();
        System.out.println(q1.peek());


    }
}
