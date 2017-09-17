package LinkedLists;

import java.util.ArrayList;

public class ReturnSumAsLinkedList {
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(5);


        System.out.println("First given linked list");
        singlyLinkedList.printList();

        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList();
        singlyLinkedList1.addElement(5);
        singlyLinkedList1.addElement(9);
        singlyLinkedList1.addElement(2);

        System.out.println("Second given linked list");
        singlyLinkedList1.printList();

        SinglyLinkedList singlyLinkedList2 = returnSum(singlyLinkedList, singlyLinkedList1);
        System.out.println("Sum of the above 2 linked list in the form of list is:");
        singlyLinkedList2.printList();

    }

    public static SinglyLinkedList returnSum(SinglyLinkedList singleLinkedListFirst, SinglyLinkedList singleLinkedListSecond) {

        int sizeN1 = singleLinkedListFirst.size();
        int sizeN2 = singleLinkedListSecond.size();


        if (sizeN1 == sizeN2) {
            SinglyLinkedList singlyLinkedListSum = new SinglyLinkedList();
            SinglyLinkedList.Node temp1 = singleLinkedListFirst.head;
            SinglyLinkedList.Node temp2 = singleLinkedListSecond.head;

            int carry = 0;
            while (temp1 != null && temp2 != null) {
                int sum = (temp1.data + temp2.data + carry) % 10;
                carry = (temp1.data + temp2.data + carry) / 10;
                singlyLinkedListSum.addElement(sum);
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return singlyLinkedListSum;
        }
        return null;
    }
}
