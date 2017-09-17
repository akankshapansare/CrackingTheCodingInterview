package LinkedLists;

public class FindNthToLastElementSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(4);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(6);
        singlyLinkedList.addElement(7);
        System.out.println("Given linked list is: ");
        singlyLinkedList.printList();
        int size = singlyLinkedList.size();
        int n = findNthToLastElement(3, size, singlyLinkedList.head);
        System.out.println("Nth last element is: " + n);

    }

    public static int findNthToLastElement(int n, int linkedListSize, SinglyLinkedList.Node head) {
        int size = linkedListSize;
        int position = size - n;
        int count = 0;
        SinglyLinkedList.Node temp = head;
        if (position > 0) {
            while (temp != null) {
                if (count == position) {
                    return temp.data;
                }
                temp = temp.next;
                count++;
            }
        }
        return 0;
    }
}
