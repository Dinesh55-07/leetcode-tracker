// Last updated: 02/09/2026, 09:14:01
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int row = grid.length;
4        int col = grid[0].length;
5
6        int peri = 0;
7
8        for (int i=0; i<row; i++){
9            for (int j=0; j<col; j++){
10                if (grid[i][j] == 1){
11                    if (i == 0 || grid[i-1][j] == 0){
12                        peri++;
13                    }
14                    if (i == row - 1  || grid[i+1][j] == 0){
15                        peri++;
16                    }
17                    if (j == 0 || grid[i][j-1] == 0){
18                        peri++;
19                    }
20                    if (j == col - 1 || grid[i][j+1] == 0){
21                        peri++;
22                    }
23                }
24            }
25        }    
26        return peri;
27    }
28}