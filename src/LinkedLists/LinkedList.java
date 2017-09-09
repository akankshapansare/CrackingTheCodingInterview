package LinkedLists;

public class LinkedList {

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
            newNode.previous = temp;
            newNode.next = null;
        }
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
            return totalCount;
        }
    }

    public void insertElement(int position, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == position) {
                if (position == 0) {
                    head = newNode;
                }

                if (temp.previous != null) {
                    temp.previous.next = newNode;
                    newNode.previous = temp.previous;
                }

                newNode.next = temp;
                temp.previous = newNode;

                break;
            }
            temp = temp.next;
            count++;
        }
    }

    public void deleteElement(int position) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            if (count == position) {
                if (position == 0) {
                    head = head.next;
                }
                if (temp.previous != null) {
                    temp.previous.next = temp.next;
                }
                if (temp.next != null) {
                    temp.next.previous = temp.previous;
                }
                break;
            }
            temp = temp.next;
            count++;
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
        Node next;
        Node previous;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
}
