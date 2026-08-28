public class Queue {

    static int[] queue = new int[5];
    static int front = 0;
    static int rear = -1;

    static void add(int data) {
        if (rear == 4) {
            System.out.println("Queue is full");
        } else {
            queue[++rear] = data;
        }
    }
    static void remove() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Removed: " + queue[front]);
            front++;
        }
    }

    static void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        add(10);
        add(20);
        add(30);

        System.out.println("Queue:");
        display();

        remove();

        System.out.println("After removing:");
        display();
    }
}