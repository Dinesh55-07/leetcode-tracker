// Last updated: 26/07/2026, 09:23:23
1class Solution {
2    public int largestInteger(int n, int s) {
3        if (s == 0) return 0;
4
5        if (s > 9 * n) return -1;
6
7        int result =0; 
8
9        for (int i=0; i<n; i++){
10            int currDigit = Math.min(s,9);
11
12            result = (result * 10) + currDigit;
13
14            s -= currDigit;
15        }
16
17        return result;
18    }
19}