package SatckAndQueues;

import java.util.LinkedList;

public class SetOfStacks {

    public LinkedList<Stack> stackLinkedList = new LinkedList<>();

    public void push(int data) {
        if (stackLinkedList.size() <= 0 || stackLinkedList.getLast().isFull()) {
            stackLinkedList.add(new Stack(3));
        }

        stackLinkedList.getLast().push(data);
    }

    public int pop() {
        if (stackLinkedList.getLast() != null) {
            int temp = stackLinkedList.getLast().pop();
            if (stackLinkedList.getLast().size() == 0) {
                stackLinkedList.removeLast();
            }
            return temp;
        } else {
            System.out.println("Stack List is empty");
            return -1;
        }
    }

    public int popAt(int index) {
        if (index < stackLinkedList.size()) {
            return stackLinkedList.get(index).pop();
        }
        return -1;
    }

    public static class Stack {
        private LinkedList<Integer> linkedList = new LinkedList<>();
        private int maxSize;

        public Stack(int maxSize) {
            this.maxSize = maxSize;
        }

        public boolean push(int data) {
            if (linkedList.size() <= maxSize) {
                linkedList.add(data);
                return true;
            } else {
                System.out.println("Stack is full");
                return false;
            }
        }

        public int pop() {
            if (linkedList.size() > 0) {
                return linkedList.removeLast();
            } else {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        public int size() {
            return linkedList.size();
        }

        public boolean isFull() {
            return linkedList.size() >= maxSize;
        }
    }
}
