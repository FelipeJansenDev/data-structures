package linkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(1);
        myLinkedList.append(5);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.removeLast();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */

    }

}