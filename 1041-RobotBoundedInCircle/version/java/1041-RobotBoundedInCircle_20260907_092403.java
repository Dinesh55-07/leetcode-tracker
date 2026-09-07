// Last updated: 07/09/2026, 09:24:03
1class Solution {
2    public boolean isRobotBounded(String instructions) {
3        int dir[][] = {{0,1}, {-1, 0}, {0, -1}, {1,0}};
4        int i = 0;
5        int x = 0;
6        int y = 0;
7       
8        for(int s = 0; s < instructions.length(); s++){
9            if(instructions.charAt(s) == 'L'){
10                i = (i + 1) % 4;
11            }
12            else if(instructions.charAt(s) == 'R'){
13                i = (i + 3) % 4;
14            }
15            else{
16                x = x + dir[i][0];
17                y = y + dir[i][1];
18            }
19        }
20        return x == 0 && y == 0 || i != 0;
21    }
22}