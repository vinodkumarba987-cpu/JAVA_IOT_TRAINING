public class Task2_bellmanFord {
    public static void main(String[] args) {
        int[][] edges = {
                { 0, 1, 4 },
                { 0, 2, 5 },
                { 1, 2, -2 },
                { 2, 3, 3 }
        };
        int n = 4;
        int[] dist = new int[n];
        for (int i = 0; i < n; i++)
            dist[i] = 999;
        dist[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int[] e : edges) {
                int u = e[0];
                int v = e[1];
                int w = e[2];
                if (dist[u] + w < dist[v])
                    dist[v] = dist[u] + w;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println("0 to " + i + " = " + dist[i]);
    }
}