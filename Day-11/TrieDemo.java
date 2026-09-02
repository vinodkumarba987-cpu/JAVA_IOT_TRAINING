public class TrieDemo {

    static class Node {
        Node[] child = new Node[26];
        boolean end;
    }

    static Node root = new Node();

    static void insert(String word) {
        Node p = root;

        for (char c : word.toCharArray()) {
            int i = c - 'A';

            if (p.child[i] == null)
                p.child[i] = new Node();

            p = p.child[i];
        }

        p.end = true;
    }

    static boolean search(String word) {
        Node p = root;

        for (char c : word.toCharArray()) {
            int i = c - 'A';

            if (p.child[i] == null)
                return false;

            p = p.child[i];
        }

        return p.end;
    }

    public static void main(String[] args) {

        insert("CAN");
        insert("CAR");
        insert("CAT");
        insert("CAB");
        System.out.println(search("CAN"));
        System.out.println(search("CAB"));
        System.out.println(search("CAT"));
        System.out.println(search("CAR"));
        System.out.println(search("CAP"));
    }
}