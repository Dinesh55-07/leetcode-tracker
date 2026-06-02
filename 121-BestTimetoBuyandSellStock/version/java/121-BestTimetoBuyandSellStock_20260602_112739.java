// Last updated: 02/06/2026, 11:27:39
1class Solution {
2    public int maxProfit(int[] prices) {
3        int lsf = Integer.MAX_VALUE;
4        int op = 0;
5        int pist = 0;
6
7        for (int i=0; i < prices.length; i++){
8            if (prices[i] < lsf){
9                lsf = prices[i];
10            }
11            pist = prices[i] - lsf;
12
13            if ( op < pist){
14                op=pist;
15            }
16        }
17        return op;
18    }
19}