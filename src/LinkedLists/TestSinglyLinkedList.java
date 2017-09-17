package LinkedLists;

public class TestSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        System.out.println("Add element in the linked list");
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(7);
        singlyLinkedList.addElement(8);
        singlyLinkedList.addElement(10);
        singlyLinkedList.printList();

        System.out.println("Insert element in the linked list");
        singlyLinkedList.insertElement(0, 1);
        singlyLinkedList.insertElement(1, 2);
        singlyLinkedList.insertElement(4, 11);
        singlyLinkedList.printList();

        System.out.println("Delete element from the linked list");
        singlyLinkedList.deleteElement(0);
        singlyLinkedList.deleteElement(3);
        singlyLinkedList.printList();

        System.out.println("Size of linked list is: " + singlyLinkedList.size());
    }
}
