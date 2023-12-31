import java.util.Arrays;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int topIndex;

    public Stack(int size) {
        this.maxSize = size;
        stackArray = new int[maxSize];
        topIndex = -1;
    }

    public void push(int data) {
        if (isFull())
            System.out.println("cannot add data, stack is full");
        else {
            stackArray[++topIndex] = data;
        }
    }

    public int pop() {
        if (isempty()) {
            System.out.println("Cannot pop, stack is empty");
            return -1;
        } else {
            return stackArray[topIndex--];
        }
    }

    public int peek() {
        if (isempty()) {
            System.out.println("Cannot peek, stack is empty");
            return -1;
        } else
            return stackArray[topIndex];
    }

    public boolean isFull() {
        if (topIndex == maxSize - 1)
            return true;
        else
            return false;
    }

    public boolean isempty() {
        if (topIndex == -1)
            return true;
        else
            return false;
    }
}

class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(8);
        stack.push(12);
        stack.push(56);
        stack.push(88);
        stack.push(33);
        stack.pop();
        System.out.println("top element is "+stack.peek());
        //traverse
        while(!stack.isempty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println("top element is "+stack.peek());
    }
}