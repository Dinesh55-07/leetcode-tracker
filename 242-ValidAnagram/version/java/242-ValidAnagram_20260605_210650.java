// Last updated: 05/06/2026, 21:06:50
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) return false;
4
5        int arr[] = new int[26];
6
7        for (int i=0; i<s.length(); i++){
8            arr[s.charAt(i)-'a']++;
9            arr[t.charAt(i)-'a']--;
10        }
11
12        for (int num : arr){
13            if (num !=0){
14                return false;
15            }
16        }
17        return true;
18    }
19}