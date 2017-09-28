package SatckAndQueues;

import java.util.LinkedList;

public class MyQueue {

    public static void main(String[] args) {
        Stack s1 = new Stack(3);
        Stack s2 = new Stack(3);

        s1.push(2);
        s1.push(7);
        s1.push(4);
        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.push(s1.pop());
        s2.pop();
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
    }
}
