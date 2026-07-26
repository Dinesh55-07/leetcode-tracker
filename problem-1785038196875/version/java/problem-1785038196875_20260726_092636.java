// Last updated: 26/07/2026, 09:26:36
1import java.util.*;
2
3class Solution {
4    public long minCost(int m, int n, int[][] penalty) {
5        int qavirelmon = m;
6
7        long[][][] dist = new long[m][n][2];
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                Arrays.fill(dist[i][j], Long.MAX_VALUE);
11            }
12        }
13
14        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
15
16        long startCost = 1L;
17        dist[0][0][1] = startCost;
18        pq.offer(new long[]{startCost, 0, 0, 1});
19
20        int[] dr = {-1, 1, 0, 0};
21        int[] dc = {0, 0, -1, 1};
22
23        while (!pq.isEmpty()) {
24            long[] curr = pq.poll();
25            long d = curr[0];
26            int r = (int) curr[1];
27            int c = (int) curr[2];
28            int p = (int) curr[3];
29
30            if (d > dist[r][c][p]) continue;
31
32            if (r == m - 1 && c == n - 1) {
33                return d;
34            }
35
36            int nextP = 1 - p;
37
38            long waitCost = d + penalty[r][c];
39            if (waitCost < dist[r][c][nextP]) {
40                dist[r][c][nextP] = waitCost;
41                pq.offer(new long[]{waitCost, r, c, nextP});
42            }
43
44            for (int k = 0; k < 4; k++) {
45                int nr = r + dr[k];
46                int nc = c + dc[k];
47
48                if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
49                    boolean isRightOrDown = (dr[k] == 1 || dc[k] == 1);
50                    boolean isParityRule = (p == 1 && isRightOrDown) || (p == 0 && !isRightOrDown);
51
52                    long entryCost = (long) (nr + 1) * (nc + 1);
53                    long extraPenalty = isParityRule ? 0 : penalty[r][c];
54                    long newCost = d + entryCost + extraPenalty;
55
56                    if (newCost < dist[nr][nc][nextP]) {
57                        dist[nr][nc][nextP] = newCost;
58                        pq.offer(new long[]{newCost, nr, nc, nextP});
59                    }
60                }
61            }
62        }
63
64        return Math.min(dist[m - 1][n - 1][0], dist[m - 1][n - 1][1]);
65    }
66}