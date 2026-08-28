public class merged_linked_list {

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
        first.next = new Node(20);
        first.next.next = new Node(30);

        Node second = new Node(40);
        second.next = new Node(50);
        second.next.next = new Node(60);
        Node temp = first;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = second;
        temp = first;

        while (temp != null) {

            System.out.print(temp.data + " -> ");

            temp = temp.next;
        }

        System.out.println("NULL");
    }
}