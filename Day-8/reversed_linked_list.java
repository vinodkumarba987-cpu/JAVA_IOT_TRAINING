public class reversed_linked_list {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        // Reverse the linked list
        Node prev = null;
        Node current = first;

        while (current != null) {

            Node next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        // Print reversed list
        Node temp = prev;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("NULL");
    }
}