// Last updated: 24/07/2026, 10:24:00
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int count = 0;
4
5        for (char c : jewels.toCharArray()){
6            for (char s : stones.toCharArray()){
7                if (c == s){
8                    count++;
9                }
10            }
11        }
12
13        return count;
14    }
15}