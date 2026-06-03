// Last updated: 03/06/2026, 12:09:42
1class Solution {
2    public int lengthOfLastWord(String s) {
3        s = s.trim();
4
5        int len = 0;
6
7        for (int i=s.length()-1; i>=0; i--){
8            if (s.charAt(i) != ' ')  len++;
9            else if(len > 0) break;
10        }
11        return len;
12    }
13}