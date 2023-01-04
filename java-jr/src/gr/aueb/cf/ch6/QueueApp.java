package gr.aueb.cf.ch6;

import java.util.Arrays;

public class QueueApp {

    static int[] queue = new int[50];
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        enQueue(1);
        enQueue(2);
        enQueue(3);

        num = deQueue();


    }

    public static void enQueue (int val) {
        if (!isFull()) {
            //top++;
            queue[++top] = val;
        } else {
            System.out.println("Queue is full");
        }
    }

    public static int deQueue() {
        int num = 0;

        if (!isEmpty()) {
            num = queue[0];
            queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
            return num;
         }
           else {
                throw new RuntimeException("Queue is empty");
            }
        }

    public static boolean isFull () {
        return (top == (queue.length - 1) );
    }

    public static boolean isEmpty() {
        return (top == -1);
    }
}
