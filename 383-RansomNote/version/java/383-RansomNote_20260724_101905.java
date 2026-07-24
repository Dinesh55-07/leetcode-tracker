// Last updated: 24/07/2026, 10:19:05
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        if (ransomNote.length() > magazine.length()) return false;
4        int alphabet_counter[] = new int[26];
5
6        for (char c : magazine.toCharArray()){
7            alphabet_counter[c-'a']++;
8        }
9
10        for (char c : ransomNote.toCharArray()){
11            if (alphabet_counter[c-'a'] == 0) return false;
12            alphabet_counter[c-'a']--;     
13        }
14        return true;
15    }
16}