// Last updated: 03/08/2026, 09:42:23
1class Solution {
2    public String restoreString(String s, int[] indices) {
3        int l = s.length();
4        StringBuilder sb = new StringBuilder("");
5        char c[] = new char[l];
6
7        for (int i=0; i<l; i++){
8            c[indices[i]]=s.charAt(i);
9        }
10        sb.append(c);
11        return sb.toString();
12    }
13}