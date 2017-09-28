package SatckAndQueues;

public class TestSetOfStacks {

    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks();

        setOfStacks.push(2);
        setOfStacks.push(6);
        setOfStacks.push(4);
        setOfStacks.push(7);
        setOfStacks.push(1);
        setOfStacks.push(6);
        setOfStacks.push(9);
        setOfStacks.push(10);
        setOfStacks.popAt(2);
        setOfStacks.pop();
    }
}
