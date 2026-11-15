public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
    if (i == j)
        return 0;
    int n = m.length;
    int[] tasks = new int[n];
    tasks[0] = i;
    int[] distances = new int[n];
    for (int p = 0; p<n; p++)
       distances[p] = -1;
    distances[i] = 0;
    int read = 0;
    int write = 1;

    while (read < write) {
        int curr = tasks[read];
        read = read+1;
        for (int t = 0; t < n; t++) {
            if (m[curr][t] == 1) {
                if (distances[t] == -1) {
                    tasks[write] = t;
                    write = write+1;
                    distances[t] = distances[curr]+1;
                    if (t == j)
                        return distances[t];
                }
            }
        }
    }
    
    return -1;
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}