package LinkedLists;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Add element in the linked list");
        linkedList.addElement(10);
        linkedList.addElement(4);
        linkedList.addElement(6);
        linkedList.addElement(9);
        linkedList.printList();
        System.out.println("Insert element in the linked list");
        linkedList.insertElement(1, 5);
        linkedList.insertElement(0, 1);
        linkedList.insertElement(3, 8);
        linkedList.printList();
        System.out.println("Delete element from the linked list");
        linkedList.deleteElement(5);
        linkedList.deleteElement(2);
        linkedList.printList();
    }
}
