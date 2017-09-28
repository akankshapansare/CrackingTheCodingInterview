package SatckAndQueues;


public class SingleArrayToImplementThreeStacks {

    public Node[] inputArray = new Node[10];
    private int top1 = -1;
    private int top2 = -1;
    private int top3 = -1;
    private int i;

    public void pushStack1(int input) {
        for (i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == null) {
                inputArray[i] = new Node(input);
                inputArray[i].previousTop = top1;
                top1 = i;
                break;
            }
        }
        if (i >= inputArray.length) {
            System.out.println("Array is full");
        }
    }

    public void pushStack2(int input) {
        for (i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == null) {
                inputArray[i] = new Node(input);
                inputArray[i].previousTop = top2;
                top2 = i;
                break;
            }
        }
        if (i >= inputArray.length) {
            System.out.println("Array is full");
        }
    }

    public void pushStack3(int input) {
        for (i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == null) {
                inputArray[i] = new Node(input);
                inputArray[i].previousTop = top3;
                top3 = i;
                break;
            }
        }
        if (i >= inputArray.length) {
            System.out.println("Array is full");
        }
    }

    public int popStack1() {
        if (top1 > -1) {
            int temp = inputArray[top1].data;
            inputArray[top1].data = -1;
            if (inputArray[top1].previousTop != -1) {
                top1 = inputArray[top1].previousTop;
            }
            return temp;
        }
        return -1;
    }

    public int popStack2() {
        if (top2 > -1) {
            int temp = inputArray[top2].data;
            inputArray[top2].data = -1;
            if (inputArray[top2].previousTop != -1) {
                top2 = inputArray[top2].previousTop;
            }
            return temp;
        }
        return -1;
    }

    public int popStack3() {
        if (top3 > -1) {
            int temp = inputArray[top3].data;
            inputArray[top3].data = -1;
            if (inputArray[top3].previousTop != -1) {
                top3 = inputArray[top3].previousTop;
            }
            return temp;
        }
        return -1;
    }

    public void printArray(Node[] showArray) {
        for (int i = 0; i < showArray.length; i++) {
            System.out.println(showArray[i] != null ? showArray[i].data : "null");
        }
    }

    public class Node {
        private int data;
        private int previousTop = -1;

        public Node(int data) {
            this.data = data;
        }
    }
}
