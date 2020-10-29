package core_java.genericQueue;


import java.util.ArrayList;

public class GenericQueue<T> {
    int front = 0, rare = -1, n;
    int length;
    ArrayList<T> arr = new ArrayList<T>();


//    public void ArrayList(int length) {
//        this.length = length;
//    }

//    public  <T> void fillQueue(T[] elements) {
//        for (T element : elements) {
//            rare++;
//            System.out.println(element);
//        }
//        System.out.println("Value of rare after fillqueue:" + rare);
//
//
//    }

    public <T> void enQueue(T num) {
        if (rare == length - 1) {
            System.out.println("Queue is full");
        } else {
//            arr.add(num);
            rare++;
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }

    public <T> void deQueue() {
        if (rare == -1) {
            System.out.println("Queue is empty");
        } else {
            arr.remove(front);
            front++;
        }
    }

    public void display() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        GenericQueue<Integer> queue1 = new GenericQueue();
        Integer[] arr = {10, 20, 30};

//        queue1.ArrayList(10);
        System.out.println("Original Queue");
        //       queue1.fillQueue(arr);

//        queue1.display();
        queue1.enQueue(40);
        System.out.println("Queue after enqueue operation");
//        queue1.display();
//        queue1.deQueue();
//        System.out.println("Queue after dequeue operation");
//        queue1.display();

    }


}
