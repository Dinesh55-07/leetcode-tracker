// Last updated: 07/09/2026, 09:19:37
1class Solution {
2    public int swimInWater(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
5        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
6        Set<String> seen = new HashSet<>();
7        
8        pq.offer(new int[]{grid[0][0], 0, 0});
9        
10        while (!pq.isEmpty()) {
11            int[] curr = pq.poll();
12            int max_d = curr[0], r = curr[1], c = curr[2];
13            
14            String key = r + "," + c;
15            if (seen.contains(key)) continue;
16            seen.add(key);
17            
18            if (r == m-1 && c == n-1) return max_d;
19            
20            for (int[] dir : directions) {
21                int nr = r + dir[0], nc = c + dir[1];
22                if (nr >= 0 && nr < m && nc >= 0 && nc < n && !seen.contains(nr + "," + nc)) {
23                    int new_d = Math.max(max_d, grid[nr][nc]);
24                    pq.offer(new int[]{new_d, nr, nc});
25                }
26            }
27        }
28        return -1;
29    }
30}