package QUEUE;

import java.util.*;

public class q1 {

    
    static class QueueA {
        int f = -1, r = -1;
        int[] arr = new int[5];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }

            if (f == -1) {
                f = 0;
            }

            arr[++r] = val;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int removed = arr[f];

            if (f == r) {
                f = r = -1;  // Reset when queue becomes empty
            } else {
                f++;
            }

            return removed;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[f];
        }

        public boolean isEmpty() {
            return f == -1 || f > r;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print("Queue: ");
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueA q = new QueueA();

        q.add(10);
        q.add(20);
        q.add(30);
        q.display(); // Output: Queue: 10 20 30

        System.out.println("Removed: " + q.remove()); // 10
        q.display(); // Output: Queue: 20 30

        System.out.println("Peek: " + q.peek()); // 20

        System.out.println("Is Empty: " + q.isEmpty()); // false

        q.remove();
        q.remove();
        q.display(); // Output: Queue is empty
        System.out.println("Is Empty: " + q.isEmpty()); // true
    }
}
