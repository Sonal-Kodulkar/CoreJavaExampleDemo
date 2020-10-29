package core_java.genericQueue;

import java.util.*;

public class ImplementGenricQueue {
    public int front = 0;
    int length;
    ArrayList arr = new ArrayList();

    public void ArrayList(int length) {
        this.length = length;
    }

    public void fillQueue() {
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr.size());
    }

    public void enQueue(int num) {
//        if (arr.size() > length) {
//            System.out.println("Queue is full");
//        } else {
        arr.add(num);
    }
//    }

    public Object dequeue() {
        Object temp = null;
        if (arr.size() == 0) {
            System.out.println("Queue is empty");
        } else {
            temp = arr.get(front);
            System.out.println("Dequeue element is:" + arr.get(front));
            arr.remove(front);
        }
        return temp;
    }

    public void displayQueue() {
        Iterator i1 = arr.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
    }

    public boolean isEmpty() {
        if (arr.size() == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int x = 1;
        ImplementGenricQueue queue = new ImplementGenricQueue();
        queue.ArrayList(3);
        queue.fillQueue();
        System.out.println("Original Queue");
        queue.displayQueue();
        queue.enQueue(50);
        System.out.println("Queue after Enqueue operation:");
        queue.displayQueue();
        System.out.println("Value of front after enqueue is:" + queue.front);

        queue.dequeue();
        System.out.println("Queue after deleting elements");
        queue.displayQueue();
        System.out.println("Value of front after dequeue is:" + queue.front);

        System.out.println("In while loop");
        while (!queue.isEmpty()) {
            System.out.println("value of front:" + queue.front);
            x = x + (int) queue.dequeue();
            System.out.println("value of x:" + x);
            queue.displayQueue();

        }
    }
}
