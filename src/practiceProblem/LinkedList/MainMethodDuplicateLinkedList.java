package practiceProblem.LinkedList;

public class MainMethodDuplicateLinkedList {
    public static void main(String[] args) {
        DuplicateInLikedList l1= new DuplicateInLikedList();
        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(1);
        System.out.println("Nodes of singly linked list: ");
       l1.display();
       l1.checkDuplicateElement();
       l1.reverseLinkedList();
       System.out.println("Reversed linked list: ");
       l1.display();
    }
}
