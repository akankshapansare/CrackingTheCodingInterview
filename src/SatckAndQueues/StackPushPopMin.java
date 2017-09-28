package SatckAndQueues;

public class StackPushPopMin {

    public Node top = null;
    public Node minElement;

    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
            minElement = newNode;
        } else {
            if (data > minElement.data) {
                newNode.next = top;
                top = newNode;
            } else {
                newNode.prevMin = minElement;
                minElement = newNode;
                newNode.next = top;
                top = newNode;
            }
        }
    }

    public int pop() {
        if (top != null && minElement.data != top.data) {
            int removedElement = top.data;
            top = top.next;
            return removedElement;
        } else if (minElement.data == top.data) {
            minElement = top.prevMin;
            int removedElement = top.data;
            top = top.next;
            return removedElement;
        } else {
            return -1;
        }
    }

    public int min() {
        return minElement != null ? minElement.data : -1;
    }

    public static class Node {
        private int data;
        private Node next;
        private Node prevMin;

        public Node(int data) {
            this.data = data;
        }
    }
}