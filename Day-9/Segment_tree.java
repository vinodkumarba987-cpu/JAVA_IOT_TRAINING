class SegmentTree {

    int[] tree;
    int n;

    SegmentTree(int[] arr) {
        n = arr.length;
        tree = new int[4 * n];
        build(arr, 0, 0, n - 1);
    }
    void build(int[] arr, int node, int start, int end) {

        if (start == end) {
            tree[node] = arr[start];
            return;
        }

        int mid = (start + end) / 2;

        build(arr, 2 * node + 1, start, mid);
        build(arr, 2 * node + 2, mid + 1, end);

        tree[node] =
                tree[2 * node + 1] +
                tree[2 * node + 2];
    }

    int query(int node, int start, int end, int left, int right) {
        if (right < start || end < left) {
            return 0;
        }
        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        int leftSum =
                query(2 * node + 1, start, mid, left, right);

        int rightSum =
                query(2 * node + 2, mid + 1, end, left, right);

        return leftSum + rightSum;
    }
    void update(int node, int start, int end, int index, int value) {

        if (start == end) {
            tree[node] = value;
            return;
        }

        int mid = (start + end) / 2;

        if (index <= mid) {
            update(2 * node + 1, start, mid, index, value);
        } else {
            update(2 * node + 2, mid + 1, end, index, value);
        }

        tree[node] =
                tree[2 * node + 1] +
                tree[2 * node + 2];
    }
    int query(int left, int right) {
        return query(0, 0, n - 1, left, right);
    }
    void update(int index, int value) {
        update(0, 0, n - 1, index, value);
    }
}


public class Segment_tree {

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 4, 9, 3};

        SegmentTree st = new SegmentTree(arr);
        System.out.println(st.query(1, 4));
        st.update(2, 10);
        System.out.println(st.query(1, 4));
    }
}