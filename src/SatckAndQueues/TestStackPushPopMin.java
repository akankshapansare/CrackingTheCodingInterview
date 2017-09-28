package SatckAndQueues;

public class TestStackPushPopMin {

    public static void main(String[] ars) {
        StackPushPopMin stack = new StackPushPopMin();
        stack.push(5);
        stack.push(6);
        stack.push(4);
        stack.push(2);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.min());
    }
}
