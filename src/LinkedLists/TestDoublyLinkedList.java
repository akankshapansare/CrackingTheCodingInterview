package LinkedLists;

public class TestDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("Add element in the linked list");
        doublyLinkedList.addElement(10);
        doublyLinkedList.addElement(4);
        doublyLinkedList.addElement(6);
        doublyLinkedList.addElement(9);
        doublyLinkedList.printList();

        System.out.println("Insert element in the linked list");
        doublyLinkedList.insertElement(1, 5);
        doublyLinkedList.insertElement(0, 1);
        doublyLinkedList.insertElement(3, 8);
        doublyLinkedList.printList();

        System.out.println("Delete element from the linked list");
        doublyLinkedList.deleteElement(5);
        doublyLinkedList.deleteElement(2);
        doublyLinkedList.printList();

        System.out.println("Size of linked list is: " + doublyLinkedList.size());
    }
}
