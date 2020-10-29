package practiceProblem.LinkedList;

public class DuplicateInLikedList {
    public Node head = null;
    public Node tail = null;

    class Node {
        int data;
        Node next;


        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void addNode(int data) {
        Node newNode = new Node(data);

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");

        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        current = head;
    }

    public void checkDuplicateElement() {
        Node current = head;
        int temp = current.data;
        while (current != null) {

            current = current.next;
            if (temp == current.data) {
                System.out.println("Duplicate element is " + temp);
                break;
            }

        }
    }

    public void reverseLinkedList() {
        Node pointer = head;
        Node prev = null;
        Node current = null;
        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;
            current.next = prev;
            prev = current;
            head = current;
        }
    }
}


