package gr.aueb.cf.ch6;

public class StackApp {
    static int[] stack = new int[50];
    static int top = -1;

    public static void main(String[] args) {

        int num = 0;
        push(1);
        push(2);
        push(100);
        push(50);
        push(20);
        push((3));
        num = pop();
        System.out.println("Num = " + num);

        printStack();
    }

    public static void push (int num) {
        if (!isFull()) {
            top++;
            stack[top] = num;
        } else {
            throw new RuntimeException();}
    }

    public static int pop() {
        if (!isEmpty()) {
            return stack[top--];
        } //else System.out.println("stack is empty");
        else {

            throw new RuntimeException();
        }
    }

    public static boolean isFull () {
        return (top == (stack.length - 1) );
    }

    public static boolean isEmpty() {
        return (top == -1);
    }

    public static void printStack() {
            if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }
            for (int i = 0; i <= top; i++) {
        System.out.println(stack[i] + " ");
    }
        System.out.println();
    }

}

