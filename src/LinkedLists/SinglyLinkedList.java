package LinkedLists;

public class SinglyLinkedList {


    public Node head = null;

    public void addElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
    }

    public void insertElement(int position, int data) {
        Node temp = head;
        Node tempPrevious = null;
        Node newNode = new Node(data);
        int count = 0;
        while (temp != null) {
            if (count == position) {
                if (position == 0) {
                    head = newNode;
                }

                if (tempPrevious != null) {
                    tempPrevious.next = newNode;
                }
                newNode.next = temp;
                break;
            }
            tempPrevious = temp;
            temp = temp.next;
            count++;
        }
    }

    public void deleteElement(int position) {
        int count = 0;
        Node temp = head;
        Node tempPrevious = null;
        while (temp != null) {
            if (count == position) {
                if (position == 0) {
                    head = head.next;
                } else {
                    tempPrevious.next = temp.next;
                }
                break;
            }
            tempPrevious = temp;
            temp = temp.next;
            count++;
        }
    }

    public void makeCircularList() {
        SinglyLinkedList.Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
    }


    public int size() {
        int totalCount = 0;
        if (head == null) {
            return totalCount;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                totalCount++;
            }
            return totalCount + 1;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("It is empty list");
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            if (temp.next == null) {
                System.out.println(temp.data);
            }
        }
    }


    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
