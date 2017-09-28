package SatckAndQueues;

public class TestSingleArrayToImplementThreeStacks {

    public static void main(String[] args) {
        SingleArrayToImplementThreeStacks threeStacks = new SingleArrayToImplementThreeStacks();
        threeStacks.pushStack1(10);
        threeStacks.pushStack2(9);
        threeStacks.pushStack3(2);
        threeStacks.pushStack2(4);
        threeStacks.pushStack2(5);
        threeStacks.pushStack1(7);
        threeStacks.pushStack1(8);
        threeStacks.pushStack3(3);
        threeStacks.pushStack2(6);
        threeStacks.pushStack3(1);
        threeStacks.pushStack2(11);
        threeStacks.popStack1();
        threeStacks.popStack3();
        threeStacks.popStack1();
        threeStacks.printArray(threeStacks.inputArray);
    }
}
