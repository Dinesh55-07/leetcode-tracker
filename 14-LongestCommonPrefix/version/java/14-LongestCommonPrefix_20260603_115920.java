// Last updated: 03/06/2026, 11:59:20
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        StringBuilder sb = new StringBuilder();
4
5        Arrays.sort(strs);
6
7        String first = strs[0];
8        String last = strs[strs.length-1];
9
10        int index= 0;
11
12        while ( index < first.length() && index < last.length()){
13            if(first.charAt(index) == last.charAt(index)){
14                index++;
15            }else{
16                break;
17            }
18        }
19        return first.substring(0,index);
20    }
21}