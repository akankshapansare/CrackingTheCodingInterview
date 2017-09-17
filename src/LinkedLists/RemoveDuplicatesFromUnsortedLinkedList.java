package LinkedLists;

public class RemoveDuplicatesFromUnsortedLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addElement(1);
        doublyLinkedList.addElement(3);
        doublyLinkedList.addElement(2);
        doublyLinkedList.addElement(2);
        doublyLinkedList.addElement(1);
        System.out.println("Given linked list is: ");
        doublyLinkedList.printList();
        System.out.println("Linked list after removing duplicates is: ");
        removeDuplicates(doublyLinkedList.head);
        doublyLinkedList.printList();
    }

    public static void removeDuplicates(DoublyLinkedList.Node head) {
        DoublyLinkedList.Node start = head;
        while (start != null) {
            DoublyLinkedList.Node temp = start.next;
            while (temp != null) {
                if (start.data == temp.data) {
                    if (temp.previous != null) {
                        temp.previous.next = temp.next;
                    }
                    if (temp.next != null) {
                        temp.next.previous = temp.previous;
                    }
                }
                temp = temp.next;
            }
            start = start.next;
        }
    }
}
