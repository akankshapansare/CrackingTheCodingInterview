package LinkedLists;

public class ReturnNodeAtBeginingOfLoopCircularList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(4);
        singlyLinkedList.addElement(2);

        singlyLinkedList.makeCircularList();
        int biginingNode = returnNodeAtBigining(singlyLinkedList.head);
        System.out.println("Node at the bigining of the loop is: " + biginingNode);
    }

    public static int returnNodeAtBigining(SinglyLinkedList.Node head) {
        SinglyLinkedList.Node temp1 = head;
        SinglyLinkedList.Node temp2 = head;

        while (temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next.next;
            if (temp1 == temp2) {
                break;
            }
        }
        if (temp2.next == null) {
            return 0;
        }

        temp1 = head;
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp2.data;
    }
}
