public class circular_queue {

    static int[] queue = new int[5];
    static int front = -1;
    static int rear = -1;

    // Add element
    static void add(int data) {

        if ((rear + 1) % 5 == front) {
            System.out.println("Queue is full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % 5;
        queue[rear] = data;
    }

    // Remove element
    static void remove() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % 5;
        }
    }

    // Display elements
    static void display() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear) {
                break;
            }

            i = (i + 1) % 5;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        add(10);
        add(20);
        add(30);
        add(40);

        System.out.println("Queue:");
        display();

        remove();
        remove();

        System.out.println("After removing:");
        display();

        add(50);
        add(60);

        System.out.println("After adding:");
        display();
    }
}