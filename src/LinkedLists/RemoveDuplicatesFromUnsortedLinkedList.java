package LinkedLists;

public class RemoveDuplicatesFromUnsortedLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(1);
        linkedList.addElement(3);
        linkedList.addElement(2);
        linkedList.addElement(2);
        linkedList.addElement(1);
        System.out.println("Given linked list is: ");
        linkedList.printList();
        System.out.println("Linked list after removing duplicates is: ");
        removeDuplicates(linkedList.head);
        linkedList.printList();
    }

    public static void removeDuplicates(LinkedList.Node head) {
        LinkedList.Node start = head;
        while (start != null) {
            LinkedList.Node temp = start.next;
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
